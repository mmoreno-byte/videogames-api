# 🎮 Videogames API

API REST para gestionar una colección de videojuegos, construida con Spring Boot y autenticación JWT.

## 🌐 URL en producción
`https://videogames-api-production-16b1.up.railway.app`

## 📖 Documentación Swagger
`https://videogames-api-production-16b1.up.railway.app/swagger-ui.html`

## ✨ Características
- Autenticación con JWT (registro e inicio de sesión)
- CRUD completo de videojuegos
- Búsqueda por título, género y plataforma
- Validación de datos con Jakarta Validation
- Documentación automática con Swagger/OpenAPI
- Base de datos PostgreSQL persistente
- Desplegada en Railway

## 🛠️ Tecnologías
- Java 21
- Spring Boot 3.4
- Spring Security + JWT
- Spring Data JPA
- PostgreSQL
- Lombok
- SpringDoc OpenAPI

## 🔐 Endpoints principales

### Auth
- `POST /api/auth/register` — Registrar usuario
- `POST /api/auth/login` — Obtener token JWT

### Videojuegos (requieren token Bearer)
- `GET /api/games` — Listar todos
- `GET /api/games/{id}` — Buscar por id
- `GET /api/games/search?title=` — Buscar por título
- `GET /api/games/genre/{genre}` — Filtrar por género
- `GET /api/games/platform/{platform}` — Filtrar por plataforma
- `POST /api/games` — Crear videojuego
- `PUT /api/games/{id}` — Actualizar videojuego
- `DELETE /api/games/{id}` — Eliminar videojuego

## ⚠️ Demo pública
Esta API es una demo. Cualquier usuario puede registrarse y gestionar el contenido. No almacenes información sensible.

## 📦 Instalación local
\`\`\`bash
./mvnw spring-boot:run
\`\`\`

## 👤 Autora
mmorenodev — [GitHub](https://github.com/mmoreno-byte) · [Portfolio](https://mmoreno-byte.github.io/mmorenodev/)