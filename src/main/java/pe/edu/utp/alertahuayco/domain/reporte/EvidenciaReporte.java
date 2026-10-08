package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: EvidenciaReporte (foto/video adjunto a un reporte).
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "evidencia_reporte")
@Getter
@Setter
@NoArgsConstructor
public class EvidenciaReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvidencia;

    @Column(length = 255)
    private String urlArchivo;

    @Column(length = 20)
    private String tipoArchivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reporte")
    private ReporteCiudadano reporteCiudadano;
}
