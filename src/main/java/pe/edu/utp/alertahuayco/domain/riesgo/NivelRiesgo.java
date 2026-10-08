package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: NivelRiesgo (catalogo: Bajo, Medio, Alto, Muy Alto).
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "nivel_riesgo")
@Getter
@Setter
@NoArgsConstructor
public class NivelRiesgo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNivel;

    @Column(nullable = false, length = 30)
    private String nombre;

    private double umbralMin;
    private double umbralMax;

    @Column(length = 10)
    private String colorMapa;
}
