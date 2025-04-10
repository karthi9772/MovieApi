package dev.karthi.movieapi.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.karthi.movieapi.entity.Movies;
import dev.karthi.movieapi.repository.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movierepo;
	
	public List<Movies> getAllMovies(){
		return movierepo.findAll();
	}
	
	public Optional<Movies> getMovieByIMDB(ObjectId id){
		return movierepo.findById(id);
	}
}
