package it.peppe.movies.controller;

import it.peppe.movies.service.MovieService;
import it.peppe.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Optional<Movie>> getMovieWithTitle(@PathVariable String title){
        return new ResponseEntity<Optional<Movie>>(movieService.movieByTitle(title),HttpStatus.OK);
    }

    @GetMapping("/title/contains/{title}")
    public ResponseEntity<Optional<List<Movie>>> getMovieWithTitleContains(@PathVariable String title){
        return new ResponseEntity<Optional<List<Movie>>>(movieService.movieByTitleContains(title),HttpStatus.OK);
    }

    @GetMapping("/date/{releaseDate}")
    public ResponseEntity<Optional<Movie>> getMovieWithReleaseDate(@PathVariable String releaseDate){
        return new ResponseEntity<Optional<Movie>>(movieService.movieByReleaseDate(releaseDate),HttpStatus.OK);
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<Optional<List<Movie>>> getMoviesWithGenres(@PathVariable String genre){
        return new ResponseEntity<Optional<List<Movie>>>(movieService.moviesByGenres(genre),HttpStatus.OK);
    }


}
