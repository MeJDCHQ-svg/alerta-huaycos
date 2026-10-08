package pe.edu.utp.alertahuayco.domain.riesgo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: Municipalidad.
 * Modulo a cargo del Integrante 2 (Zonas de riesgo y sensores).
 */
@Entity
@Table(name = "municipalidad")
@Getter
@Setter
@NoArgsConstructor
public class Municipalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMunicipalidad;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(length = 20)
    private String ruc;

    @Column(length = 20)
    private String telefono;
}
