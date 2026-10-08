package pe.edu.utp.alertahuayco.domain.alerta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: TipoAlerta.
 * Modulo a cargo del Integrante 3 (Alertas y notificaciones).
 */
@Entity
@Table(name = "tipo_alerta")
@Getter
@Setter
@NoArgsConstructor
public class TipoAlerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoAlerta;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(length = 200)
    private String descripcion;
}
