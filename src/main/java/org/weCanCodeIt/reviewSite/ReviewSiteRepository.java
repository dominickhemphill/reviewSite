
package org.weCanCodeIt.reviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository
{
	private Map<Long, Review> reviewRepository = new HashMap<Long,Review>();
	
	public ReviewSiteRepository() 
	{
		
		Review pictureOneReview = new Review(1L,"The Stature of a King", "dominick-1.jpg","Action","this is a dom. shh, i'm going to go touch him!");
		Review pictureTwoReview = new Review(2L,"The Hunger of a Lion","dominick-2.jpg","Adventure", "this is also a dom. seems as though he may have ate a baby lion.");
		Review pictureThreeReview = new Review(3L,"The Focus of a Warrior", "dominick-final.jpg", "Horror", "this else if is a dom. find and grasp onto the grey nose hair of hope.");
		
		this.addReview(pictureOneReview);
		this.addReview(pictureTwoReview);
		this.addReview(pictureThreeReview);
		
	}
	public int getSizeOfRepository()
	{
		return reviewRepository.size();
	}
	
	public void addReview(Review review) 
	{
		reviewRepository.put(review.getMovieId(), review);
	}

	public Collection<Review> getReviews() 
	{
		return reviewRepository.values();
	}
	public Review findById(Long movieId)
	{
		return reviewRepository.get(movieId);
	}
	public Map<Long, Review> getReviewRepo(){
		return reviewRepository;
	}


}
