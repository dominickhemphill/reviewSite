package org.weCanCodeIt.reviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController {
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	ReviewRepository reviewRepo;

	@RequestMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/reviews/{movieId}")
	public String getReview(@PathVariable(name = "movieId") Long movieId, Model model) {
		model.addAttribute("review", reviewRepo.findOne(movieId));
		return "review";
	}

	@RequestMapping("/categories/{id}")
	public String getCategory(@PathVariable(name = "id") Long id, Model model) {

		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

}
