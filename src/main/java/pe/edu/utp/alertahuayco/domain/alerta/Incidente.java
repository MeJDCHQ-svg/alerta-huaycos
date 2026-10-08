package pe.edu.utp.alertahuayco.domain.alerta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.riesgo.ZonaRiesgo;

import java.time.LocalDateTime;

/**
 * Clase de dominio: Incidente (registro historico).
 * Modulo a cargo del Integrante 3 (Alertas y notificaciones).
 */
@Entity
@Table(name = "incidente")
@Getter
@Setter
@NoArgsConstructor
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIncidente;

    private LocalDateTime fechaOcurrencia;

    @Lob
    private String descripcion;

    @Column(length = 20)
    private String nivelSeveridad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zona")
    private ZonaRiesgo zonaRiesgo;
}
