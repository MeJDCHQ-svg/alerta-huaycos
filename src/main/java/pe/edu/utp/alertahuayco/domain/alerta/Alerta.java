package pe.edu.utp.alertahuayco.domain.alerta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.riesgo.NivelRiesgo;
import pe.edu.utp.alertahuayco.domain.riesgo.ZonaRiesgo;

import java.time.LocalDateTime;

/**
 * Clase de dominio: Alerta.
 * Modulo a cargo del Integrante 3 (Alertas y notificaciones).
 */
@Entity
@Table(name = "alerta")
@Getter
@Setter
@NoArgsConstructor
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlerta;

    private LocalDateTime fechaEmision;

    @Lob
    private String mensaje;

    @Column(length = 20)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zona")
    private ZonaRiesgo zonaRiesgo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_alerta")
    private TipoAlerta tipoAlerta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel")
    private NivelRiesgo nivelRiesgo;

    public void emitir() {
        this.fechaEmision = LocalDateTime.now();
        this.estado = "EMITIDA";
        // Delegado a NotificacionService para el despacho a los canales.
    }

    public void cerrar() {
        this.estado = "CERRADA";
    }
}
