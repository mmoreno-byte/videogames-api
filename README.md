# 🎮 Videogames API

API REST para gestionar una colección de videojuegos, construida con Spring Boot y autenticación JWT.

## 🌐 URL en producción
`https://videogames-api-production-16b1.up.railway.app`

## 📖 Documentación
`https://videogames-api-production-16b1.up.railway.app/swagger-ui.html`

## ✨ Características
- Autenticación con JWT
- CRUD completo de videojuegos
- Búsqueda por título, género y plataforma
- Validación de datos
- Documentación con Swagger
- Desplegada en Railway

## 🛠️ Tecnologías
- Java 21
- Spring Boot 3.4
- Spring Security
- Spring Data JPA
- H2 Database
- JWT (jjwt)
- Lombok
- SpringDoc OpenAPI

## 🔐 Endpoints principales

### Auth
- `POST /api/auth/register` — Registrar usuario
- `POST /api/auth/login` — Obtener token JWT

### Videojuegos (requieren token)
- `GET /api/games` — Listar todos
- `GET /api/games/{id}` — Buscar por id
- `GET /api/games/search?title=` — Buscar por título
- `GET /api/games/genre/{genre}` — Filtrar por género
- `GET /api/games/platform/{platform}` — Filtrar por plataforma
- `POST /api/games` — Crear videojuego
- `PUT /api/games/{id}` — Actualizar videojuego
- `DELETE /api/games/{id}` — Eliminar videojuego

## 📦 Instalación local
```bash
./mvnw spring-boot:run
```

## 👤 Autor
mmorenodev — [GitHub](https://github.com/mmoreno-byte)
