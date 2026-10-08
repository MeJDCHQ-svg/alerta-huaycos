package pe.edu.utp.alertahuayco.domain.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: Administrador (hereda de Usuario).
 * Modulo a cargo del Integrante 1 (Usuarios y seguridad).
 */
@Entity
@DiscriminatorValue("ADMINISTRADOR")
@Getter
@Setter
@NoArgsConstructor
public class Administrador extends Usuario {

    @Column(length = 30)
    private String nivelAcceso;

    public void gestionarUsuarios() {
        // Delegado a UsuarioService en la capa de negocio.
    }
}
