package dev.karthi.movieapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.karthi.movieapi.entity.Movie;
import dev.karthi.movieapi.repository.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movierepo;
	
	public List<Movie> getAllMovies(){
		return movierepo.findAll();
	}
	
	public Optional<Movie> SingleMovie(String imdbId){
		return movierepo.findMovieByImdbId(imdbId);
	}
	
	
}
