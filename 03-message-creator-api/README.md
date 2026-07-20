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

## Diseno inicial

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

Respuesta prevista: `201 Created`.

## Estado

Fase 1 completada: estructura base de Spring Boot preparada. El endpoint todavia
no esta implementado.

## Ejecutar

Desde esta carpeta, en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

## Siguiente fase

Definir por separado el objeto que recibe el JSON, el objeto que representa el
mensaje creado y el contrato del endpoint POST.
