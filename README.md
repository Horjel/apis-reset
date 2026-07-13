# Hello HTTP API

Primera API REST del proyecto de aprendizaje **APIS RESET**. Su objetivo es
practicar el recorrido completo de una peticion HTTP: cliente, controlador,
respuesta JSON y comprobacion con Postman.

## Tecnologias

- Java 17
- Spring Boot 4.1.0
- Spring Web
- Spring Boot DevTools
- Maven y Maven Wrapper
- JUnit
- Postman

## Endpoint

| Metodo | Ruta | Descripcion | Respuesta correcta |
|---|---|---|---|
| `GET` | `/api/v1/greeting` | Obtiene el saludo de la aplicacion | `200 OK` |

### Peticion

```http
GET http://localhost:8080/api/v1/greeting
Accept: application/json
```

### Respuesta

```http
HTTP/1.1 200 OK
Content-Type: application/json
```

```json
{
  "message": "Welcome Patata",
  "application": "hello-http-api"
}
```

### Casos negativos

- Una ruta inexistente devuelve `404 Not Found`.
- Usar `POST` en `/api/v1/greeting` devuelve `405 Method Not Allowed`, porque
  el endpoint solo admite `GET`.

## Ejecutar localmente

En Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

La aplicacion escucha por defecto en `http://localhost:8080`.

DevTools reinicia la aplicacion cuando detecta cambios en las clases compiladas.
Si el IDE no compila automaticamente al guardar, ejecuta en otra terminal:

```powershell
.\mvnw.cmd compile
```

## Pruebas de Maven

```powershell
.\mvnw.cmd test
```

## Postman

Importa el archivo:

```text
postman/hello-http-api.postman_collection.json
```

La coleccion contiene una variable `baseUrl` y dos peticiones:

- `Get greeting - 200 OK`: comprueba el estado, el tipo de contenido y el JSON.
- `Create greeting with unsupported method - 405`: comprueba el metodo no permitido.

## Estructura principal

```text
src/main/java/com/jorge/apisreset/hellohttpapi/
|-- HelloHttpApiApplication.java
|-- controller/
|   `-- GreetingController.java
`-- model/
    `-- GreetingResponse.java
```

## Conceptos practicados

- Peticiones y respuestas HTTP.
- Metodo GET.
- Codigos `200`, `404` y `405`.
- Headers `Accept` y `Content-Type`.
- Serializacion de un objeto Java a JSON.
- Controladores REST de Spring.
- Variables y scripts de prueba en Postman.

## Posibles mejoras futuras

- Incorporar una prueba automatizada especifica del endpoint.
- Permitir seleccionar el idioma del saludo.
- Publicar el repositorio en GitHub.
