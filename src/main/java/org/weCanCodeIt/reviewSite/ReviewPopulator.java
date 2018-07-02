package org.weCanCodeIt.reviewSite;

import javax.persistence.Lob;

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
	
	String blackmamba = getBlackMambaDescription();
	String jelly = getJellyFishDescription();
	String brownbear = getBrownBearDescription();
	String mosquit = getMosquitoDescription();
	String greatwhite = getGreatWhiteSharkDescription();
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category mammal = categoryRepo.save(new Category("Mammal"));
		Category bird = categoryRepo.save(new Category("Bird"));
		Category reptile = categoryRepo.save(new Category("Reptile"));
		Category insect = categoryRepo.save(new Category("Insect"));
		Category invertebrates = categoryRepo.save(new Category("Invertebrates"));
		Category fish = categoryRepo.save(new Category("Fish"));
		
		
		
		
		Review blackMamba = reviewRepo.save(new Review("Black Mamba","blackMamba.jpg", blackmamba , reptile));
		Review jellyfish = reviewRepo.save(new Review("Jellyfish","jellyfish.jpg", jelly , invertebrates));
		Review brownBear = reviewRepo.save(new Review("Brown Bear","brownBear.jpg", brownbear , mammal));
		Review mosquito = reviewRepo.save(new Review("Mosquito","mosquito.jpg", mosquit, insect));
		Review greatWhiteShark = reviewRepo.save(new Review("Great White Shark","great.jpg", greatwhite , fish));
		

	

		
		
		
	
	}
	public String getBlackMambaDescription() {
		String str = "	The black mamba (Dendroaspis polylepis) is a highly venomous snake endemic to parts of sub-Saharan Africa. Skin colour varies from grey to dark brown. Juvenile black mambas tend to be paler than adults and darken with age. It is the longest species of venomous snake indigenous to the African continent; mature specimens generally exceed 2 meters (6.6 ft) and commonly attain 3 meters (9.8 ft). Specimens of 4.3 to 4.5 meters (14.1 to 14.8 ft) have been reported.\r\n" + 
				"\r\n" + 
				"Although most mamba species are tree-dwelling snakes, the black mamba is not generally arboreal, preferring lairs in terrestrial habitats in a range of terrains. These include savannah, woodlands, rocky slopes and, in some regions, dense forest. It is diurnal and chiefly an ambush predator, known to prey on hyrax, bushbabies and other small mammals, as well as birds. It is also a pursuit predator; in this it resembles other long, speedy, highly venomous species with well-developed vision. Over suitable surfaces it is possibly the fastest species of snake, capable of at least 11 km/h (6.8 mph) over short distances. Adult mambas have few natural predators.\r\n" + 
				"\r\n" + 
				"In a threat display, the mamba usually opens its inky-black mouth, spreads its narrow neck-flap and sometimes hisses. It is capable of striking at considerable range and may occasionally deliver a series of bites in rapid succession. Its venom is primarily composed of potent neurotoxins that may cause a fast onset of symptoms. Despite its reputation as formidable and highly aggressive, it usually attempts to flee from humans unless threatened or cornered. The black mamba is rated as least concern on the International Union for Conservation of Nature (IUCN)'s Red List of Endangered species.";
		return str;
	}
	public String getJellyFishDescription() {
		String str = "	Jellyfish or sea jelly[a] is the informal common name given to the medusa-phase of certain gelatinous members of the subphylum Medusozoa, a major part of the phylum Cnidaria. Jellyfish are mainly free-swimming marine animals with umbrella-shaped bells and trailing tentacles, although a few are not mobile, being anchored to the seabed by stalks. The bell can pulsate to provide propulsion and highly efficient locomotion. The tentacles are armed with stinging cells and may be used to capture prey and defend against predators. Jellyfish have a complex life cycle; the medusa is normally the sexual phase, the planula larva can disperse widely and is followed by a sedentary polyp phase.\r\n" + 
				"\r\n" + 
				"Jellyfish are found all over the world, from surface waters to the deep sea. Scyphozoans (the \"true jellyfish\") are exclusively marine, but some hydrozoans with a similar appearance live in freshwater. Large, often colorful, jellyfish are common in coastal zones worldwide. The medusae of most species are fast growing, mature within a few months and die soon after breeding, but the polyp stage, attached to the seabed, may be much more long-lived. Jellyfish have roamed the seas for at least 500 million years, and possibly 700 million years or more, making them the oldest multi-organ animal group.\r\n" + 
				"\r\n" + 
				"Jellyfish are eaten by humans in certain cultures, being considered a delicacy in some Asian countries, where species in the Rhizostomae are pressed and salted to remove excess water. They are also used in research, where the green fluorescent protein, used by some species to cause bioluminescence, has been adapted as a fluorescent marker for genes inserted into other cells or organisms. The stinging cells used by jellyfish to subdue their prey can also injure humans. Many thousands of swimmers are stung every year, with effects ranging from mild discomfort to serious injury or even death; small box jellyfish are responsible for many of these deaths. When conditions are favourable, jellyfish can form vast swarms. These can be responsible for damage to fishing gear by filling fishing nets, and sometimes clog the cooling systems of power and desalination plants which draw their water from the sea.";
		return str;
	}public String getMosquitoDescription() {
		String str = "	Mosquitoes[a] are small, midge-like flies that constitute the family Culicidae. Females of most species are ectoparasites, whose tube-like mouthparts (called a proboscis) pierce the hosts' skin to consume blood. The word \"mosquito\" (formed by mosca and diminutive -ito)[2] is Spanish for \"little fly\".[3] Thousands of species feed on the blood of various kinds of hosts, mainly vertebrates, including mammals, birds, reptiles, amphibians, and even some kinds of fish. Some mosquitoes also attack invertebrates, mainly other arthropods. Though the loss of blood is seldom of any importance to the victim, the saliva of the mosquito often causes an irritating rash that can be a serious nuisance. Much more serious though, are the roles of many species of mosquitoes as vectors of diseases. In passing from host to host, some transmit extremely harmful infections such as malaria, yellow fever, Chikungunya, West Nile virus, dengue fever, filariasis, Zika virus and other arboviruses, rendering it the deadliest animal family in the world.";
		return str;
	}public String getGreatWhiteSharkDescription() {
		String str = "	The great white shark (Carcharodon carcharias), commonly known as the great white or the white shark, is a species of large mackerel shark which can be found in the coastal surface waters of all the major oceans. The great white shark is notable for its size, with larger female individuals growing to 6.1 m (20 ft) in length and 1,905 kg (4,200 lb) in weight at maturity.[3][4][5] However most are smaller, males measuring 3.4 to 4.0 m (11 to 13 ft) and females 4.6 to 4.9 m (15 to 16 ft) on average. According to a 2014 study the lifespan of great white sharks is estimated to be as long as 70 years or more, well above previous estimates, making it one of the longest lived cartilaginous fish currently known.[8] According to the same study, male great white sharks take 26 years to reach sexual maturity, while the females take 33 years to be ready to produce offspring.[9] Great white sharks can swim at speeds of over 56 km/h (35 mph),[10] and can swim to depths of 1,200 m (3,900 ft).[11]\r\n" + 
				"\r\n" + 
				"The great white shark has no known natural predators other than, on very rare occasions, the killer whale.[12] The great white shark is arguably the world's largest known extant macropredatory fish, and is one of the primary predators of marine mammals. It is also known to prey upon a variety of other marine animals, including fish and seabirds. It is the only known surviving species of its genus Carcharodon, and is ranked first in having the most recorded shark bite incidents on humans.\r\n" + 
				"\r\n" + 
				"The species faces numerous ecological challenges which has resulted in international protection. The IUCN lists the great white shark as a vulnerable species,[2] and it is included in Appendix II of CITES.[15] It is also protected by several national governments such as Australia (as of 2018).[16]\r\n" + 
				"\r\n" + 
				"The novel Jaws by Peter Benchley and the subsequent film by Steven Spielberg depicted the great white shark as a \"ferocious man eater\". Humans are not the preferred prey of the great white shark,[17] but, nevertheless, the great white is responsible for the largest number of reported and identified fatal unprovoked shark attacks on humans.[18] The great white shark has also been called the white pointer or white death.";
		return str;
	}
	
	public String getBrownBearDescription() {
		String str = "	The brown bear (Ursus arctos) is a bear that is found across much of northern Eurasia and North America.[2][1] It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly larger on average.[3][4][5][6][7]\r\n" + 
				"\r\n" + 
				"The brown bear's principal range includes parts of Russia, Central Asia, China, Canada, the United States (mostly Alaska), Scandinavia, and the Carpathian region (especially Romania), Anatolia, and Caucasus.[1][8] The brown bear is recognized as a national and state animal in several European countries.[9]\r\n" + 
				"\r\n" + 
				"While the brown bear's range has shrunk and it has faced local extinctions, it remains listed as a least concern species by the International Union for Conservation of Nature (IUCN) with a total population of approximately 200,000. As of 2012, this and the American black bear are the only bear species not classified as threatened by the IUCN.[1][2][10] However, the Californian, North African and Mexican subspecies were hunted to extinction in the nineteenth and early twentieth centuries and many of the southern Asian subspecies are highly endangered.[1][7] One of the smaller-bodied subspecies, the Himalayan brown bear, is critically endangered, occupying only 2% of its former range and threatened by uncontrolled poaching for its parts.[11] The Marsican brown bear, one of several currently isolated populations of the main Eurasian brown bear population, in central Italy is believed to have a population of just 30 to 40 bears.";
		return str;
	}
	


	
	
	
}
