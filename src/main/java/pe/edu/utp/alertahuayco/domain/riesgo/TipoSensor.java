package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: TipoSensor.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "tipo_sensor")
@Getter
@Setter
@NoArgsConstructor
public class TipoSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoSensor;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(length = 20)
    private String unidadMedida;
}
