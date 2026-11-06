package com.bhumi.movie_ticket_booking.service;

import com.bhumi.movie_ticket_booking.entity.Movie;
import com.bhumi.movie_ticket_booking.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
