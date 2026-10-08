package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: RefugioTemporal.
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "refugio_temporal")
@Getter
@Setter
@NoArgsConstructor
public class RefugioTemporal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRefugio;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 200)
    private String direccion;

    private int capacidad;

    @Column(length = 20)
    private String estado;
}
