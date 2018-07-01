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
		Category insect = categoryRepo.save(new Category("insect"));
		Category mammal = categoryRepo.save(new Category("mammal"));
		Category reptiles = categoryRepo.save(new Category("reptiles"));
		Category invertebrates = categoryRepo.save(new Category("invertebrates"));
		Category fish = categoryRepo.save(new Category("fish"));
		Category bird = categoryRepo.save(new Category("bird"));
		

		
		Review blackmamba = reviewRepo.save(new Review("Black Mamba","url","desc", reptiles));
		Review jellyfish = reviewRepo.save(new Review("Jellyfish","url","desc", invertebrates));
		Review greatwhiteshark = reviewRepo.save(new Review("Great White Shark","url","desc", fish));
		Review seasnake = reviewRepo.save(new Review("Sea Snake","url","desc", reptiles));
		Review africanbee = reviewRepo.save(new Review("African bee","bee.jpeg","desc", insect));
		Review mosquito = reviewRepo.save(new Review("Mosquito","url","desc", insect));
		Review falcon = reviewRepo.save(new Review("Falcon","url","desc", bird));
		Review eagle = reviewRepo.save(new Review("Eagle","url","desc", bird));

		
		
		
	
	}


	
	
	
}
