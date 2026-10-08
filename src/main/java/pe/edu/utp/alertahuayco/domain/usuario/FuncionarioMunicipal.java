package pe.edu.utp.alertahuayco.domain.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.riesgo.Municipalidad;

/**
 * Clase de dominio: FuncionarioMunicipal (hereda de Usuario).
 * Modulo a cargo del Integrante 1 (Usuarios y seguridad).
 */
@Entity
@DiscriminatorValue("FUNCIONARIO")
@Getter
@Setter
@NoArgsConstructor
public class FuncionarioMunicipal extends Usuario {

    @Column(length = 80)
    private String cargo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_municipalidad")
    private Municipalidad municipalidad;

    public void validarReporte() {
        // Delegado a ReporteCiudadanoService en la capa de negocio.
    }

    public void emitirAlerta() {
        // Delegado a AlertaService en la capa de negocio.
    }
}
