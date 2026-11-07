package com.bhumi.movie_ticket_booking.service;

import com.bhumi.movie_ticket_booking.entity.Movie;
import com.bhumi.movie_ticket_booking.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Movie not found with id: " + id
                ));
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
