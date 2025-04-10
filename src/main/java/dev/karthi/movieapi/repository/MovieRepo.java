package dev.karthi.movieapi.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dev.karthi.movieapi.entity.Movies;

public interface MovieRepo extends MongoRepository<Movies, ObjectId> {

	
	
	
}
