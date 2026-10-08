package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: ZonaRiesgo.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "zona_riesgo")
@Getter
@Setter
@NoArgsConstructor
public class ZonaRiesgo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZona;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 300)
    private String descripcion;

    @Lob
    @Column(name = "poligono_geo")
    private String poligonoGeo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_distrito")
    private Distrito distrito;

    public String calcularNivelActual() {
        // Regla de negocio: se calcula a partir de las ultimas lecturas
        // de los sensores asociados a la zona. Implementacion en el
        // servicio ZonaRiesgoService (siguiente entregable).
        return "PENDIENTE_CALCULO";
    }
}
