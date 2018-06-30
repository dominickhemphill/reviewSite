package org.weCanCodeIt.reviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewPopulator implements CommandLineRunner {

	@Autowired
	ReviewRepository reviewRepo;
	@Autowired
	CategoryRepository categoryRepo;
	
	public ReviewPopulator () {}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category comedy = categoryRepo.save(new Category("comedy"));
		Category action = categoryRepo.save(new Category("action"));
		Category horror = categoryRepo.save(new Category("horror"));
		Category romance = categoryRepo.save(new Category("romance"));

		
		Review dumbanddumber = reviewRepo.save(new Review("Black Mamba","url","desc", comedy));
		Review harlemnights = reviewRepo.save(new Review("Jellyfish","url","desc", comedy));
		Review badboys = reviewRepo.save(new Review("Great White Shark","url","desc", action));
		Review XXX = reviewRepo.save(new Review("Sea Snake","url","desc", action));
		Review fridaythe13th = reviewRepo.save(new Review("African bee","url","desc", horror));
		Review amityvillehorror = reviewRepo.save(new Review("Mosquito","url","desc", horror));
		Review dirtydancing = reviewRepo.save(new Review("Falcon","url","desc", romance));
		Review jasonslyric = reviewRepo.save(new Review("Eagle","url","desc", romance));

		
		
		
	
	}


	
	
	
}
