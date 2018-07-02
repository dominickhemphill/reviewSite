package org.weCanCodeIt.reviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Lob
	@OneToMany(mappedBy = "category")
	protected Collection<Review>reviews;
	
	public Category() {}

	public Category(String title, Review... reviews){
		
		this.title = title;
		this.reviews = Arrays.asList(reviews);
		
	}
	

	@Override
	public String toString() {
		return title;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
}