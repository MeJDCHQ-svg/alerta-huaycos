package pe.edu.utp.alertahuayco.domain.alerta;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.usuario.Usuario;

import java.time.LocalDateTime;

/**
 * Clase de dominio: Notificacion.
 * Modulo a cargo del Integrante 3 (Alertas y notificaciones).
 */
@Entity
@Table(name = "notificacion")
@Getter
@Setter
@NoArgsConstructor
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;

    private LocalDateTime fechaEnvio;

    @Column(length = 20)
    private String estadoEnvio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alerta")
    private Alerta alerta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_canal")
    private CanalNotificacion canalNotificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario destinatario;

    public void enviar() {
        this.fechaEnvio = LocalDateTime.now();
        this.estadoEnvio = "ENVIADA";
        // Integracion real con correo/SMS: pendiente para el 2do entregable.
    }
}
