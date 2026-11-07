package com.bhumi.movie_ticket_booking.controller;

import com.bhumi.movie_ticket_booking.dto.MovieRequest;
import com.bhumi.movie_ticket_booking.entity.Movie;
import com.bhumi.movie_ticket_booking.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {

    private final MovieService movieService;

    public HelloController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Movie Ticket Booking API is working.";
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody MovieRequest movieRequest) {

        Movie movie = new Movie();
        movie.setTitle(movieRequest.getTitle());

        return movieService.addMovie(movie);
    }
}
