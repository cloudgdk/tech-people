package com;

public class DragonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dragon dragon1 = new Dragon() ;
		dragon1.setDirectorName("Prashant Neil");
		dragon1.setHeroName("NTR");
		dragon1.setMovieBudget(400);
		dragon1.dragondisplay() ;
		
		dragon1.setHero("Yash");
		dragon1.setHeroine("Srinidhi");
		dragon1.setMovieDuration(180);
		
		dragon1.SecondMainLead("PruthviRaj");
		dragon1.Villain("JagguBhai");
		dragon1.NoOfShootDays(365);
		
		dragon1.NoOfDaysRunInTheatres(175);
		dragon1.NoOfSongs(6);
		dragon1.MovieType("Action");
		
		
	}

}
