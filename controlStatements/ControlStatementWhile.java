package controlStatements;

import java.util.Scanner;

public class ControlStatementWhile {

	public static void main(String args[]) {
		Scanner operandsData = new Scanner(System.in);
		CalcCall callcal = new CalcCall();
		System.out.println("I am Calculator");
		int operaion=1;
		while(operaion>=1 && operaion<=4 ) {
					
		System.out.println("Enter your choice of  Operation");
		System.out.println("Choose 1 for addition");
		System.out.println("Choose 2 for subtraction");
		System.out.println("Choose 3 for muliplication");
		System.out.println("Choose 4 for division");
		
		operaion = operandsData.nextInt();
		switch(operaion) {
		
		case 1: 
			System.out.println("please give 1 number for addition");
			int firstaddOperend = operandsData.nextInt();
			System.out.println("please give 2 number for addition");
			int secondaddOperend = operandsData.nextInt();
			callcal.addition(firstaddOperend, secondaddOperend);
		break;
		
		case 2: 
			System.out.println("please give 1 number for subtraction");
			int firstsubOperend = operandsData.nextInt();
			System.out.println("please give 2 number for subtraction");
			int secondsubOperend = operandsData.nextInt();
			callcal.subtraction(firstsubOperend, secondsubOperend);
		break;
		
		case 3: 
			System.out.println("please give 1 number for multiplication");
			int firstmulOperend = operandsData.nextInt();
			System.out.println("please give 2 number for multiplication");
			int secondmulOperend = operandsData.nextInt();
			callcal.multiplication(firstmulOperend, secondmulOperend);
		break;
		
		case 4: 
			System.out.println("please give 1 number for division");
			int firstdivOperend = operandsData.nextInt();
			System.out.println("please give 2 number for division");
			int seconddivOperend = operandsData.nextInt();
			callcal.division(10, 2);
		
		}
		}
	}
}
