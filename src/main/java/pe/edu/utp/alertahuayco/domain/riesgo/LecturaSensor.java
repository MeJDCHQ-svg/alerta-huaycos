package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Clase de dominio: LecturaSensor.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "lectura_sensor")
@Getter
@Setter
@NoArgsConstructor
public class LecturaSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLectura;

    private double valor;

    private LocalDateTime fechaHora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sensor")
    private Sensor sensor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel")
    private NivelRiesgo nivelRiesgo;

    public NivelRiesgo evaluarRiesgo() {
        // Regla de negocio: compara "valor" contra los umbrales de
        // NivelRiesgo para determinar el nivel correspondiente.
        // Implementacion completa en LecturaSensorService (siguiente entregable).
        return this.nivelRiesgo;
    }
}
