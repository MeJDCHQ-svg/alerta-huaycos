package pe.edu.utp.alertahuayco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utp.alertahuayco.domain.riesgo.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
