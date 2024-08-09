package com;

public class SmMain {

	public static void main(String[] args) {

		Application application1 = new Application();
		 application1.setName('X');
		 application1.setType("Social Media Platform");
		 int Bought= application1.Boughted(44);
		
		 
				 
		 Owner owner1 = new Owner();
		 owner1.setOwnerName("Elon Musk");
		 owner1.setBoughted(2022);
		 
		
		 
		 
		 System.out.println("This Application is "+  application1.getName()+ " and it's a " +  application1.getType());
		 System.out.println("The Owner is "+owner1.getOwnerName() +" and it is boughted in the year of " + owner1.getBoughted() );
		 System.out.println("X is boughted at the cost of " + Bought + " Billions ");
		 
	}

}
