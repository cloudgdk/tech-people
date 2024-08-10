package com;

public class Dragon extends Kgf implements Salaar,Movies {
	
	private String heroName ;
	private String directorName ;
	private int movieBudget ;
	
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getMovieBudget() {
		return movieBudget;
	}
	public void setMovieBudget(int movieBudget) {
		this.movieBudget = movieBudget;
	}
	
	public void dragondisplay() {
		System.out.println("The movie hero name is " + getHeroName() + getDirectorName() + getMovieBudget()) ;
		
	}
	@Override
	public void NoOfDaysRunInTheatres(int days) {
		// TODO Auto-generated method stub
		System.out.println("The Movie shoot completed days:" + days) ;
	}
	@Override
	public void NoOfSongs(int Songs) {
		// TODO Auto-generated method stub
		System.out.println("The Movie has:" + Songs + "Songs") ;
		
	}
	@Override
	public void MovieType(String Type) {
		// TODO Auto-generated method stub
		System.out.println("The Movie type is:" + Type) ;
		
		
	}
	@Override
	public void SecondMainLead(String Name) {
		// TODO Auto-generated method stub
		System.out.println("The Movie second main lead name is:" + Name) ;
		
	}
	@Override
	public void Villain(String Name) {
		// TODO Auto-generated method stub
		System.out.println("The Movie villain name is:" + Name) ;
		
	}
	@Override
	public void NoOfShootDays(int days) {
		// TODO Auto-generated method stub
		System.out.println("The Movie shoot completed in days of:" + days) ;
		
	}
	
	

}
