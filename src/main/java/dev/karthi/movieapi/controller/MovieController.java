package dev.karthi.movieapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.karthi.movieapi.entity.Movie;
import dev.karthi.movieapi.service.MovieService;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	
	@GetMapping
	public List<Movie> GetAllMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/{imdbId}")
	public Optional<Movie> GetSingleMovie(@PathVariable String imdbId) {
		return movieService.SingleMovie(imdbId);
	}
	
}
