package it.peppe.movies.service;

import it.peppe.movies.model.Movie;
import it.peppe.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    // INJECT REPO
    // WITH AUTOWIRED CLASS WILL BE INIT FOR US
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

    public Optional<Movie> movieByTitle(String title){
        return movieRepository.findMovieByTitle(title);
    }

    public Optional<List<Movie>> movieByTitleContains(String title){
        return movieRepository.findMovieByTitleContainsIgnoreCase(title);
    }

    public Optional<Movie> movieByReleaseDate(String releaseDate){
        return movieRepository.findMovieByReleaseDate(releaseDate);
    }

    public Optional<List<Movie>> moviesByGenres(String genre){
        return movieRepository.findMovieByGenresContains(genre);
    }

    //public Optional<Movie> singleMovie(ObjectId id){
    //    return movieRepository.findById(id);
    //}

}
