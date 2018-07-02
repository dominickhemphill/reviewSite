package org.weCanCodeIt.reviewSite;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


//review class
@Entity
public class Review 
//instance variables
{	
	@ManyToOne
	private Category category;

	@Id
	@GeneratedValue
	private Long movieId;
	private String name;
	private String imgUrL;
	@Lob
	private String description;
	
	
	
	
	public Review () {}
	
	
	
	public Review(String name, String imgUrL, String description, Category category)
	{
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

}
