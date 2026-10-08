package pe.edu.utp.alertahuayco.domain.alerta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de dominio: CanalNotificacion (App, Correo, SMS, Sirena).
 * Modulo a cargo del Integrante 3 (Alertas y notificaciones).
 */
@Entity
@Table(name = "canal_notificacion")
@Getter
@Setter
@NoArgsConstructor
public class CanalNotificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCanal;

    @Column(nullable = false, length = 40)
    private String nombre;
}
