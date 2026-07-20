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

## Requisitos funcionales previstos

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

## Estado

Fase 3 implementada: el endpoint POST crea mensajes y el endpoint GET permite
consultarlos por identificador. `MessageService` devuelve
`Optional<MessageResponse>` para representar que el mensaje puede existir o no.

Los mensajes se guardan en memoria y desaparecen al detener la aplicacion.
Todavia no existe validacion de campos.

## Ejecutar

Desde esta carpeta, en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

## Postman

Importa `postman/message-creator-api.postman_collection.json`. La peticion de
creacion guarda `messageId`, `messageAuthor` y `messageContent` como variables de
coleccion. La siguiente peticion reutiliza esas variables para consultar el
mensaje, y la tercera comprueba el caso `404 Not Found`.

## Siguiente fase

Comprobar el flujo completo desde Postman y anadir casos negativos relacionados
con el cuerpo JSON y el header `Content-Type`.
