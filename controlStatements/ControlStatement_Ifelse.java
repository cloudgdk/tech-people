package controlStatements;

import java.util.Scanner;

public class ControlStatement_Ifelse {

	public static void main(String[] args) {
		Scanner userEnteredData = new Scanner(System.in);
		System.out.println("I am Identifer of Even Number or Odd Number");
		
		System.out.println("Enter a Number to check");
		int number =userEnteredData.nextInt();
		
		if(number%2==0) {
			System.out.println(number +" This Numbere is Even");
		}
		else {
			System.out.println(number +" This Numbere is Odd");
		}

	}

}
