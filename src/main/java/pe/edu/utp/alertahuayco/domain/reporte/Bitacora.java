package pe.edu.utp.alertahuayco.domain.reporte;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.utp.alertahuayco.domain.usuario.Usuario;

import java.time.LocalDateTime;

/**
 * Clase de dominio: Bitacora (auditoria basica de acciones del sistema).
 * Modulo a cargo del Integrante 4 (Reportes ciudadanos y evacuacion).
 */
@Entity
@Table(name = "bitacora")
@Getter
@Setter
@NoArgsConstructor
public class Bitacora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;

    @Column(length = 150)
    private String accion;

    private LocalDateTime fechaHora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioResponsable;
}
