package dev.karthi.movieapi.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collation = "reviews")
public class Review {
	
	@Id
	private ObjectId id;
	
	private String reviewBody;
	
	

	public ObjectId getId() {
		return id;
	}



	public void setId(ObjectId id) {
		this.id = id;
	}



	public String getReviewBody() {
		return reviewBody;
	}



	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}



	public Review(String body) {
		super();
		this.reviewBody = body;
	}



	public Review(ObjectId id, String reviewBody) {
		super();
		this.id = id;
		this.reviewBody = reviewBody;
	}



	public Review() {
		super();
	}
	
	
	
	
	
}
