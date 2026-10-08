package pe.edu.utp.alertahuayco.domain.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio base: Usuario.
 * Modulo a cargo del Integrante 1 (Usuarios y seguridad).
 * Estrategia de herencia SINGLE_TABLE: Ciudadano, FuncionarioMunicipal y
 * Administrador se persisten en la misma tabla "usuario", diferenciados
 * por la columna discriminadora "tipo_usuario".
 */
@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, unique = true, length = 120)
    private String correo;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(length = 20)
    private String telefono;

    @Column(nullable = false)
    private boolean estado = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    private Rol rol;

    public boolean autenticar(String rawPassword) {
        // Regla de negocio: la validacion real de credenciales
        // (hash/salt) se implementara en la capa de servicio de seguridad.
        return this.password != null && this.password.equals(rawPassword);
    }

    public void actualizarPerfil(String nombres, String apellidos, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
}
