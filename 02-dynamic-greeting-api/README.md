# Dynamic Greeting API

Segunda API del proyecto **APIS RESET**. Devuelve un saludo personalizado a
partir de un nombre incluido en la ruta y permite elegir un tono formal mediante
un parametro opcional.

## Objetivo de aprendizaje

- Leer datos obligatorios de la URL con `@PathVariable`.
- Leer parametros opcionales con `@RequestParam`.
- Definir un valor predeterminado para un parametro.
- Diferenciar respuestas `200`, `400` y `404`.
- Comprobar casos positivos y negativos con Postman.

## Tecnologias

- Java 17
- Spring Boot 4.1.0
- Spring Web
- Maven Wrapper
- Postman

## Endpoint

```http
GET /api/v1/greetings/{name}?formal={true|false}
```

| Parte | Tipo | Obligatoria | Descripcion |
| --- | --- | --- | --- |
| `name` | Path variable | Si | Nombre que aparecera en el saludo. |
| `formal` | Query parameter booleano | No | Si se omite, su valor es `false`. |

### Saludo informal predeterminado

```http
GET http://localhost:8080/api/v1/greetings/Ana
```

```json
{
  "message": "Hola, Ana!",
  "name": "Ana",
  "formal": false
}
```

### Saludo formal

```http
GET http://localhost:8080/api/v1/greetings/Jorge?formal=true
```

```json
{
  "message": "Buen dia, Jorge.",
  "name": "Jorge",
  "formal": true
}
```

## Codigos HTTP practicados

| Codigo | Situacion |
| --- | --- |
| `200 OK` | La ruta y los parametros son validos. |
| `400 Bad Request` | `formal` contiene un valor que Spring no puede convertir a booleano. |
| `404 Not Found` | Falta `name`, por lo que no existe una ruta que coincida. |
| `405 Method Not Allowed` | La ruta existe, pero se utiliza otro metodo en lugar de GET. |

## Ejecutar el proyecto

Desde esta carpeta, en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

La API quedara disponible en `http://localhost:8080`.

## Probar con Postman

Importa el archivo:

```text
postman/dynamic-greeting-api.postman_collection.json
```

La coleccion incluye cuatro casos:

1. Saludo formal: `200 OK`.
2. Saludo informal usando el valor predeterminado: `200 OK`.
3. Peticion sin nombre: `404 Not Found`.
4. Valor booleano invalido: `400 Bad Request`.

Si se modifica el texto del controlador, tambien debe actualizarse la expectativa
exacta de las pruebas de Postman y volver a importarse la coleccion, o editarse la
copia que ya esta guardada dentro de Postman.
