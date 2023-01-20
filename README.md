# Simple API made with Spring Boot and MongoDB Atlas database

# GET Endpoints:
- "/api/v1/movies" -> Get all movies
- "/api/v1/movies/{imdbId}" -> Get movie by imdbId
- "/api/v1/movies/title/{title}" -> Get movie by title
- "/api/v1/movies/title/contains/{title}" -> Get movies by title containing word (ignore case)
- "/api/v1/movies/date/{releaseDate}" -> Get movie by release date
- "/api/v1/movies/genre/{genre}" -> Get movies by genre

# POST Endpoints:
- "/api/v1/reviews" -> Review movie by passing 'reviewBody' and 'imdbId'



