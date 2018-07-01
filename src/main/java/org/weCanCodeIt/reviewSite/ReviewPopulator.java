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
		Category mammal = categoryRepo.save(new Category("mammal"));
		Category bird = categoryRepo.save(new Category("bird"));
		Category reptile = categoryRepo.save(new Category("reptile"));
		Category insect = categoryRepo.save(new Category("insect"));

		
		Review blackMamba = reviewRepo.save(new Review("Black Mamba","blackMamba.jpg","desc", reptile));
		Review jellyfish = reviewRepo.save(new Review("Jellyfish","jellyfish.jpg","desc", mammal));
		Review africanBee = reviewRepo.save(new Review("African bee","africanBee.jpg","desc", insect));
		Review mosquito = reviewRepo.save(new Review("Mosquito","mosquito.jpg","desc", insect));

	

		
		
		
	
	}


	
	
	
}
