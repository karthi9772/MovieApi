package dev.karthi.movieapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.karthi.movieapi.entity.Movie;
import dev.karthi.movieapi.entity.Review;
import dev.karthi.movieapi.repository.ReviewRepo;


@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepo reviewRepo;	
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Review createReview(String reviewBody, String imdbId) {
		 Review review=  reviewRepo.insert(new Review(reviewBody));
		 mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push("reviewIds").value(review))
		 .first();
		 return review;
	}
	
}
