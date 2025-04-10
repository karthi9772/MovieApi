package dev.karthi.movieapi.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	
	@Id
	private ObjectId id;
	
	private String body;
	
}
