package com.bhumi.movie_ticket_booking.controller;

import com.bhumi.movie_ticket_booking.dto.MovieRequest;
import com.bhumi.movie_ticket_booking.entity.Movie;
import com.bhumi.movie_ticket_booking.service.MovieService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody MovieRequest movieRequest) {

        Movie movie = new Movie();
        movie.setTitle(movieRequest.getTitle());

        return movieService.addMovie(movie);
    }
}
