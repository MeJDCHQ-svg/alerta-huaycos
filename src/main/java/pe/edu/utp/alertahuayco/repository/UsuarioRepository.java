package pe.edu.utp.alertahuayco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utp.alertahuayco.domain.usuario.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}
