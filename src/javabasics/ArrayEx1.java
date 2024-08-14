package javabasics;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int arraLength=0;
		String names[]; 
		
		String type="start";
		
		while(!(type.equals("exit"))) {
			
			System.out.println("Enter element type you want store");
			type =input.next();
			System.out.println("Enter how many elements want store for "+type);
			arraLength =input.nextInt();
			names= new String[arraLength];
					
		for (int i=0;i<names.length;i++) {
			System.out.println("Enter name " +i);
			String name = input.next();
			names[i]= name;
		}
		for (int i = 0; i > 0; i--) {
			System.out.println(names[i-1]);
		}
		
		System.out.println("do want to exit");
		type =input.next();
		
		}
		
		


		
	}
}
