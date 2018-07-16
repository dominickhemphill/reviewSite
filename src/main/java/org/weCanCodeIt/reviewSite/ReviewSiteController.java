package org.weCanCodeIt.reviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewSiteController {
	
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	ReviewRepository reviewRepo;
	@Autowired
	CommentsRepository commentRepo;
	@Autowired
	TagRepository tagRepo;
	
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
	
	@RequestMapping("/tags/{id}")
	public String getTag(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}

	@RequestMapping("/categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}
	
	@RequestMapping("/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}
	
	@RequestMapping(value = "/reviews/{movieId}", method = RequestMethod.POST)
	public String addComment(@PathVariable(name = "movieId") Long movieId, String userName, String contents) {
		commentRepo.save(new Comment(userName, contents, reviewRepo.findOne(movieId)));
		return "redirect:/reviews/{movieId}";
	
			}
	

}
