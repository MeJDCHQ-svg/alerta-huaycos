package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.riesgo.ZonaRiesgo;
import pe.edu.utp.alertahuayco.domain.usuario.Ciudadano;

import java.time.LocalDateTime;

/**
 * Clase de dominio: ReporteCiudadano.
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "reporte_ciudadano")
@Getter
@Setter
@NoArgsConstructor
public class ReporteCiudadano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;

    @Lob
    private String descripcion;

    private LocalDateTime fechaHora;

    @Column(length = 20)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Ciudadano ciudadano;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zona")
    private ZonaRiesgo zonaRiesgo;

    public void adjuntarEvidencia() {
        // Delegado a EvidenciaReporteService en la capa de negocio.
    }
}
