# API de Gestion de Inventario

Este proyecto es una API RESTful desarrollada con Spring Boot, para gestionar un inventariode productos organizados por categorias.


## Tecnologias Utilizadas
* Java 21
* Spring Boot 3
* Spring Data JPA : Para la persistencia de datos.
* H2 Database : Base de datos en memoria para desarrollo.
* Springdoc-openapi (swagger) : Para la documentacion interactiva.

## Funcionalidades (CRUD)
* Productos : Crear, consultar, actualizar y eliminar.
* Categorias : Gestion completa de categorias.
* Filtrado : Enpoint especifico para buscar productos por categoria.
* Validaciones : Control de stock y campos obligatorios.


## Instrucciones de Ejecucion
1. Clonar el repositorio o descargar el codigo fuente.
2. Abrir el proyecto en un IDE (Intellij IDEA o VS Code).
3. Asegurarse de tener instalado el JDK 21.
4. Ejecutar la aplicacion mediante Maven o desde la clase principal.


## Documentacion de la API
Una vez ejecutado el proyecto puedes acceder a la documentacion interactiva en : 'http://localhost:8080/swagger-ui.html'