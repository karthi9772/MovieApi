package dev.karthi.movieapi.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dev.karthi.movieapi.entity.Movie;

public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

	public Optional<Movie> findMovieByImdbId(String imdbId);
	
	
}
