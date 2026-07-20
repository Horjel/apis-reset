# Message Creator API

Tercera API del proyecto **APIS RESET**.

## Nivel

Basico.

## Objetivo de aprendizaje

Aprender a enviar un cuerpo JSON mediante HTTP, convertirlo en un objeto Java y
crear un recurso con `POST` y `201 Created`.

## Conceptos nuevos

- Request body.
- `@RequestBody`.
- Metodo POST.
- Codigo `201 Created`.
- Diferencia entre `Content-Type` y `Accept`.
- Falta de idempotencia de POST.

## Requisitos funcionales

- Recibir el autor y el contenido de un mensaje en formato JSON.
- Crear un identificador para el mensaje.
- Guardarlo temporalmente en memoria.
- Devolver el mensaje creado.
- Permitir consultarlo posteriormente por su identificador.

## Crear un mensaje

```http
POST /api/v1/messages
Content-Type: application/json
```

```json
{
  "author": "Jorge",
  "content": "Estoy aprendiendo APIs REST"
}
```

Respuesta:

```http
201 Created
Location: /api/v1/messages/1
Content-Type: application/json
```

```json
{
  "id": 1,
  "author": "Jorge",
  "content": "Estoy aprendiendo APIs REST"
}
```

## Consultar un mensaje

```http
GET /api/v1/messages/{id}
Accept: application/json
```

Si el identificador existe, devuelve `200 OK` y el mensaje almacenado. Si no
existe, devuelve `404 Not Found`.

## Casos negativos

| Caso | Codigo esperado | Motivo |
| --- | --- | --- |
| Body vacio | `400 Bad Request` | `@RequestBody` necesita contenido. |
| JSON mal formado | `400 Bad Request` | Spring no puede convertirlo en Java. |
| `Content-Type: text/plain` | `415 Unsupported Media Type` | El endpoint espera JSON. |
| Identificador inexistente | `404 Not Found` | No existe el recurso solicitado. |

Un JSON valido con campos vacios todavia se acepta porque esta API no utiliza
Jakarta Validation. La validacion de campos se introducira en proyectos
posteriores.

## Estado

Fase 4 implementada: POST y GET funcionan, los mensajes se almacenan en memoria
y la coleccion de Postman incluye casos positivos y negativos de HTTP.

Los mensajes desaparecen al detener la aplicacion.

## Ejecutar

Desde esta carpeta, en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

## Postman

Importa `postman/message-creator-api.postman_collection.json`. La coleccion
contiene seis peticiones. El POST positivo guarda `messageId`, `messageAuthor` y
`messageContent`; el GET reutiliza esas variables.

## Siguiente fase

Ejecutar la coleccion completa en Postman, revisar los resultados y cerrar la API
con su evaluacion final.
