package org.weCanCodeIt.reviewSite;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


//review class
@Entity
public class Review {	
//instance variables
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;
	
	@ManyToMany(mappedBy = "reviews")
	private Collection<Tag> tags;
	
	@Id
	@GeneratedValue
	private Long movieId;
	private String name;
	private String imgUrL;
	
	@Lob
	private String description;
	
	public Review () {}
	
	public Review(String name, String imgUrL, String description, Category category){
		this.name = name;
		this.imgUrL = imgUrL;
		this.description = description;
		this.category = category;
	}
	public Long getMovieId() {
		return movieId;
	}
	public String getName() {
		return name;
	}
	public String getImgUrL() {
		return imgUrL;
	}
	public String getDescription() {
		return description;
	}

	public Category getCategory() {
		return category;
	}
	
	public Collection<Comment> getComments() {
		return comments;
	}

	public Collection<Tag> getTags() {
		return tags;
	}
	public void addComment(Comment comment) {
		comments.add(comment);	
	}
}
