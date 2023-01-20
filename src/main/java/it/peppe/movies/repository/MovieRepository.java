package it.peppe.movies.repository;

import it.peppe.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // NAMING IT LIKE THIS WILL AUTOMATICALLY MAKE IT WORK
    Optional<Movie> findMovieByImdbId(String imdbId);

    Optional<Movie> findMovieByTitle(String title);

    Optional<List<Movie>> findMovieByTitleContainsIgnoreCase(String title);

    Optional<Movie> findMovieByReleaseDate(String releaseDate);

    Optional<List<Movie>> findMovieByGenresContains(String genre);

}
