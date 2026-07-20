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

## Estado

Fase 2 implementada: el endpoint POST convierte el JSON en
`CreateMessageRequest`, delega la creacion en `MessageService` y devuelve un
`MessageResponse` con `201 Created` y el header `Location`.

Los mensajes se guardan en memoria y desaparecen al detener la aplicacion.
Todavia no existe un endpoint GET ni validacion de campos.

## Ejecutar

Desde esta carpeta, en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

## Postman

Importa `postman/message-creator-api.postman_collection.json`. La peticion de
creacion comprueba el estado `201`, el formato JSON, los valores devueltos y el
header `Location`.

## Siguiente fase

Comprobar el POST desde Postman, implementar la consulta por identificador y
anadir casos negativos relevantes.
