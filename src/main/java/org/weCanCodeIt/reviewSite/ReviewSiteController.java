package org.weCanCodeIt.reviewSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController 
{
	@Autowired
	ReviewSiteRepository reviewRepository;
	
	@RequestMapping("/reviews")
	public String getReviews(Model model)
	{
		model.addAttribute("reviews", reviewRepository.getReviews());
		return "reviews";
	}
	@RequestMapping("/reviews/{movieId}")
	public String getReview(@PathVariable(name = "movieId")long movieId, Model model) 
	{
		model.addAttribute("review", reviewRepository.findById(movieId));
		return "review";
	}
	
}
