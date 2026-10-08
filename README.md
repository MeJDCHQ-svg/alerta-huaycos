# Alerta Huayco — Backend (1er Entregable)

Sistema web para la gestión y alerta temprana de riesgo de huaycos.
Proyecto Final — Curso Desarrollo Web Integrado — Universidad Tecnológica del Perú.

## Contenido de este entregable (semana 5 — 30%)

Proyecto backend en **Spring Boot 3 / Java 17** configurado con las **23 clases de
dominio** del sistema (más de 5 por integrante), organizadas por módulo:

| Paquete | Clases de dominio | Responsable |
|---|---|---|
| `domain.usuario` | Usuario, Rol, Ciudadano, FuncionarioMunicipal, Administrador | Integrante 1 |
| `domain.riesgo` | Municipalidad, Distrito, ZonaRiesgo, TipoSensor, Sensor, LecturaSensor, NivelRiesgo | Integrante 2 |
| `domain.alerta` | TipoAlerta, Alerta, CanalNotificacion, Notificacion, Incidente | Integrante 3 |
| `domain.reporte` | ReporteCiudadano, EvidenciaReporte, Comentario, RutaEvacuacion, RefugioTemporal, Bitacora | Integrante 4 |

Cada clase está anotada con JPA (`@Entity`) y refleja los atributos y relaciones
del diagrama de clases y del diagrama entidad-relación presentados en el informe.
La jerarquía `Usuario` → `Ciudadano` / `FuncionarioMunicipal` / `Administrador` usa
estrategia de herencia `SINGLE_TABLE` con columna discriminadora `tipo_usuario`.

Se incluyen además repositorios `Spring Data JPA` iniciales (uno por agregado
principal) y la configuración de una base de datos en memoria H2 para desarrollo,
dejando comentada la configuración equivalente para MySQL de cara al despliegue.

## Cómo ejecutar

Requisitos: JDK 17+ y Maven 3.9+.

```bash
mvn spring-boot:run
```

La aplicación levanta en `http://localhost:8080` y la consola de H2 en
`http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:alertahuayco`).

## Próximos avances (2do Entregable — semana 14)

- Capa de servicios y controladores REST por módulo.
- Reglas de negocio de `calcularNivelActual()`, `evaluarRiesgo()` y `emitir()`.
- Pruebas unitarias por servicio y despliegue con Maven contra MySQL.
- Integración con el proyecto frontend (enlace GitHub independiente).
