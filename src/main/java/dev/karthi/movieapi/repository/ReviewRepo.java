package dev.karthi.movieapi.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.karthi.movieapi.entity.Review;


@Repository
public interface ReviewRepo extends MongoRepository<Review, ObjectId>{

}
