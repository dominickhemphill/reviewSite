package org.weCanCodeIt.reviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@ManyToMany
	private Collection<Review> reviews;
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	private Tag() {}
	
	public Tag(String name, Review... reviews) {		
		this.name = name;
		this.reviews = Arrays.asList(reviews);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
	
	

	


