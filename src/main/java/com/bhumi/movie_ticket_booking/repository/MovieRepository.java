package com.bhumi.movie_ticket_booking.repository;

import com.bhumi.movie_ticket_booking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
