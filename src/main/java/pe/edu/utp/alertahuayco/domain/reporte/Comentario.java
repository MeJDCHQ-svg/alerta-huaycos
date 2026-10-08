package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.usuario.Usuario;

import java.time.LocalDateTime;

/**
 * Clase de dominio: Comentario (seguimiento a un reporte ciudadano).
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "comentario")
@Getter
@Setter
@NoArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    @Lob
    private String texto;

    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reporte")
    private ReporteCiudadano reporteCiudadano;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
