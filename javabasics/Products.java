package javabasics;

public class Products {

	public void catgery(int product) {
		if(product%2==0) {
			System.out.println("You are Even Number");
			System.out.println("you are " + product);
		}
		else {
			System.out.println("You are Odd Number");
			System.out.println("You are " +product);
		}
	}
}
