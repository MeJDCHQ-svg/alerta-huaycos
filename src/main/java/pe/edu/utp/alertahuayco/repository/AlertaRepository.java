package pe.edu.utp.alertahuayco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utp.alertahuayco.domain.alerta.Alerta;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}
