package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Clase de dominio: Sensor.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "sensor")
@Getter
@Setter
@NoArgsConstructor
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSensor;

    @Column(nullable = false, unique = true, length = 30)
    private String codigo;

    private double latitud;
    private double longitud;

    @Column(length = 20)
    private String estado;

    private LocalDate fechaInstalacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zona")
    private ZonaRiesgo zonaRiesgo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_sensor")
    private TipoSensor tipoSensor;
}
