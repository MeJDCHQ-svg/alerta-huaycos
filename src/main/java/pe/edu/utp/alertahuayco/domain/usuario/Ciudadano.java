package pe.edu.utp.alertahuayco.domain.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: Ciudadano (hereda de Usuario).
 * Modulo a cargo del Integrante 1 (Usuarios y seguridad).
 */
@Entity
@DiscriminatorValue("CIUDADANO")
@Getter
@Setter
@NoArgsConstructor
public class Ciudadano extends Usuario {

    @Column(length = 15)
    private String dni;

    @Column(length = 200)
    private String direccion;

    public void registrarReporte() {
        // Delegado a ReporteCiudadanoService en la capa de negocio.
    }
}
