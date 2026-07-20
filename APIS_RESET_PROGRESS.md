# Progreso de APIS RESET

Ultima actualizacion: 2026-07-20

## Estado general

- APIs completadas: 2 de 30
- API actual: 03 - Message Creator API (fase 1 completada)
- Repositorio publico: https://github.com/Horjel/apis-reset
- Organizacion: un unico repositorio con una carpeta numerada por API
- API 01: `01-hello-http-api`
- API 02: `02-dynamic-greeting-api`
- API 03: `03-message-creator-api`

## API 01 - Hello HTTP API

Estado: completada y publicada dentro del repositorio principal

### Conceptos aprendidos

- Flujo cliente-servidor de una peticion HTTP.
- Metodo GET, rutas y endpoints.
- Respuestas JSON y serializacion desde Java.
- Codigos `200 OK`, `201 Created`, `404 Not Found` y
  `405 Method Not Allowed`.
- Diferencia entre error HTTP y error de conexion.
- Headers `Accept` y `Content-Type`.
- `@RestController`, `@RequestMapping` y `@GetMapping`.
- Maven, `pom.xml`, Maven Wrapper y carpeta `target`.
- Colecciones, carpetas, variables y pruebas basicas de Postman.
- Commits pequenos y descriptivos con Git.

### Conceptos que conviene reforzar

- Elegir el codigo HTTP adecuado para cada resultado.
- Diferenciar ruta inexistente de metodo no permitido.
- Diferenciar respuesta real de la API y expectativa de una prueba.
- Recordar que DevTools necesita que el codigo sea compilado.

### Nivel actual

- HTTP: basico
- Postman: basico
- Diseno REST: basico
- Calidad del codigo: estructura clara para una API pequena

### Errores o confusiones detectados

- Confusion inicial entre `200` y `405` cuando el metodo HTTP es incorrecto.
- Confusion entre actualizar el controlador y actualizar la expectativa de Postman.

## API 02 - Dynamic Greeting API

Estado: completada y publicada dentro del repositorio principal

### Conceptos aprendidos

- `@PathVariable` para recibir un dato obligatorio incluido en la ruta.
- `@RequestParam` para recibir un dato opcional despues de `?`.
- Valor predeterminado `false` cuando se omite el parametro `formal`.
- Conversion automatica de texto HTTP a `boolean` realizada por Spring.
- Diferencia entre `400 Bad Request`, `404 Not Found` y `405 Method Not Allowed`.
- Uso de `if/else` para expresar con claridad dos variantes del saludo.
- Pruebas de Postman para casos positivos y negativos.
- Necesidad de mantener sincronizados el contrato real y las expectativas de las pruebas.

### Nivel actual

- HTTP: basico, con rutas y parametros dinamicos
- Postman: basico, con casos positivos y negativos
- Diseno REST: basico
- Calidad del codigo: separacion sencilla entre controlador y modelo de respuesta

### Conceptos que conviene reforzar

- Distinguir cuando un dato pertenece a la ruta y cuando es un query parameter.
- Recordar que los parametros recibidos por HTTP llegan como texto y Spring intenta convertirlos.
- Mantener actualizadas las pruebas cuando cambia intencionadamente la respuesta de la API.

## API 03 - Message Creator API

Estado: fase 1 completada, proyecto base creado

### Fase actual

- Proyecto Spring Boot creado dentro del monorepo.
- Spring Web, DevTools y Spring Boot Test configurados.
- Maven Wrapper preparado.
- Prueba de arranque creada.
- Coleccion inicial de Postman creada.
- Pendiente: definir los objetos de entrada y respuesta y crear el endpoint POST.

### Conceptos previstos

- Metodo POST para crear recursos.
- Cuerpo JSON de una peticion.
- `@RequestBody` y conversion de JSON a Java.
- Codigo `201 Created`.
- Diferencia entre `Content-Type` y `Accept`.
- Falta de idempotencia de POST.
