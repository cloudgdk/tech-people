package com;

public class Dragon implements Salaar,Movies {
	
	private String Name;
	private String Director;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public void DragonDisplay() {
		System.out.println("The director is " + getDirector() + " and hero is " + getName());

	}
	@Override
	public void MovieType(String MovieType) {
		// TODO Auto-generated method stub
		System.out.println("The movietype is " + MovieType);
		
		
	}
	@Override
	public void MovieLength(String Length) {
		// TODO Auto-generated method stub
		System.out.println("The movielength is " + Length);
		
	}
	@Override
	public void MovieHas(String Has) {
		// TODO Auto-generated method stub
		System.out.println("The movie has " + Has);
		
	}
	@Override
	public void MovieHad(String Had) {
		// TODO Auto-generated method stub
		System.out.println("The movie had " + Had);

		
	}
	@Override
	public void HeroName(String HeroName) {
		// TODO Auto-generated method stub
		System.out.println("The movie hero is " + HeroName);

		
	}
	@Override
	public void DirectorName(String DirectorName) {
		// TODO Auto-generated method stub
		System.out.println("The movie director is " + DirectorName);

	}
	@Override
	public void MoviesDisplay() {
		// TODO Auto-generated method stub
		

		
	}
	@Override
	public void SalaarDisplay() {
		// TODO Auto-generated method stub
		

		
	}
	

}
