package org.weCanCodeIt.reviewSite;
//review class
public class Review 
//instance variables
{
	private long movieId;
	private String title;
	private String imgUrL;
	private String category;
	private String content;
	
	
	public Review(long movieId, String title, String imgUrL, String category, String content)
	{
		super();
		this.movieId = movieId;
		this.title = title;
		this.imgUrL = imgUrL;
		this.category = category;
		this.content = content;
	}
	public long getMovieId() {
		return movieId;
	}
	public String getTitle() {
		return title;
	}
	public String getImgUrL() {
		return imgUrL;
	}
	public String getCategory() {
		return category;
	}
	public String getContent() {
		return content;
	}

}
