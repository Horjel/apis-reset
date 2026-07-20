# APIS RESET

Proyecto de aprendizaje progresivo para desarrollar **30 APIs REST con Java y
Spring Boot**, comprobarlas con Postman y documentar el proceso con Git y
GitHub.

El objetivo principal no es terminar rapidamente, sino consolidar HTTP, diseno
REST, validaciones, persistencia, seguridad y pruebas mediante proyectos pequenos
y ejecutables de forma independiente.

## Estado actual

- APIs completadas: **2 de 30**
- API actual: **03 - Message Creator API (fase 1)**
- Nivel actual: fundamentos de HTTP, Spring Web y Postman

## Proyectos

| Numero | API | Concepto principal | Estado | Carpeta |
| --- | --- | --- | --- | --- |
| 01 | Hello HTTP API | Primer endpoint GET, JSON y codigos HTTP | Completada | [01-hello-http-api](./01-hello-http-api) |
| 02 | Dynamic Greeting API | Path variables y query parameters | Completada | [02-dynamic-greeting-api](./02-dynamic-greeting-api) |
| 03 | Message Creator API | POST, request body y `201 Created` | Fase 1 | [03-message-creator-api](./03-message-creator-api) |

## Estructura del repositorio

```text
apis-reset/
|-- README.md
|-- APIS_RESET_PROGRESS.md
|-- 01-hello-http-api/
|-- 02-dynamic-greeting-api/
`-- 03-message-creator-api/
```

Existe un unico repositorio Git para todo el itinerario. Cada carpeta numerada es
un proyecto Maven independiente y contiene su propio codigo, README y coleccion
de Postman. Esto permite agrupar las 30 APIs sin mezclar sus dependencias ni sus
objetivos de aprendizaje.

## Tecnologias principales

- Java 17
- Spring Boot
- Maven y Maven Wrapper
- Spring Web
- Postman
- JUnit
- Git y GitHub

Las dependencias adicionales se incorporaran de forma progresiva cuando aporten
valor al concepto que se esta practicando.

## Ejecutar una API

Clona este repositorio y entra en la carpeta de la API que quieras ejecutar. Por
ejemplo, para la API 01 en PowerShell:

```powershell
git clone https://github.com/Horjel/apis-reset.git
cd apis-reset\01-hello-http-api
.\mvnw.cmd spring-boot:run
```

Las instrucciones y endpoints concretos se encuentran en el README de cada API.

## Progresion

1. Fundamentos de HTTP, REST, JSON y Postman.
2. Validaciones y respuestas de error consistentes.
3. Persistencia con Spring Data JPA y MySQL.
4. Relaciones y reglas de negocio.
5. Seguridad, JWT, documentacion y pruebas avanzadas.
6. Proyecto final completo para portafolio.

El progreso detallado, los conceptos aprendidos y los aspectos que deben
reforzarse se encuentran en [APIS_RESET_PROGRESS.md](./APIS_RESET_PROGRESS.md).

## Autor

Proyecto desarrollado por [Horjel](https://github.com/Horjel) como itinerario de
aprendizaje y portafolio de APIs REST.
