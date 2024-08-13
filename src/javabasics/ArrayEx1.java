package javabasics;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size for storing array elements");
		int arraLength =input.nextInt();
		String names[] = new String[arraLength];
		
		for (int i=0;i<names.length;i++) {
			System.out.println("Enter name " +i);
			String name = input.next();
			names[i]= name;
		}
		

		// printing array
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}

		
	}
}
