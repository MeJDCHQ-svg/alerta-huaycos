package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: Distrito.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "distrito")
@Getter
@Setter
@NoArgsConstructor
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDistrito;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 100)
    private String provincia;

    @Column(length = 100)
    private String region;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_municipalidad")
    private Municipalidad municipalidad;
}
