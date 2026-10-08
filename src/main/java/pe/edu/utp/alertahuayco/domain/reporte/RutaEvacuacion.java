package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.riesgo.ZonaRiesgo;

/**
 * Clase de dominio: RutaEvacuacion.
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "ruta_evacuacion")
@Getter
@Setter
@NoArgsConstructor
public class RutaEvacuacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 150)
    private String puntoInicio;

    @Column(length = 150)
    private String puntoFin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zona")
    private ZonaRiesgo zonaRiesgo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_refugio")
    private RefugioTemporal refugioTemporal;
}
