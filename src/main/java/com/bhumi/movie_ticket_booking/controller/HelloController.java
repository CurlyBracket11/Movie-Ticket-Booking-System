package com.bhumi.movie_ticket_booking.controller;

import com.bhumi.movie_ticket_booking.dto.MovieRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Movie Ticket Booking API is working.";
    }

    @PostMapping("/movies")
    public String addMovie(@RequestBody MovieRequest movieRequest) {
        return "Movie added: " + movieRequest.getTitle();
    }
}
