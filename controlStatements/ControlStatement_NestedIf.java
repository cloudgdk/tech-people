package controlStatements;

import java.util.Scanner;

public class ControlStatement_NestedIf {

	static double incomeStandard=150000;
	static String castCatStandard1= "BC";
	static String castCatStandard2= "SC";
	static String castCatStandard3= "ST";
	static short familyMembersStrandard=5;
	
	public static void main(String agrs[]) {
		Scanner userData = new Scanner(System.in);
		System.out.println("I am Eligibliy Checker for Ration Card");
		
		System.out.println("Enter your Yearly Income");
		double income= userData.nextDouble();
		if(income<=incomeStandard) {
			System.out.println("May I know your caste");
			String castCat =userData.next();
			if(castCat.equals(castCatStandard1) || castCat.equals(castCatStandard2)|| castCat.equals(castCatStandard3)) {
				System.out.println("How many family members you have");
				short memberCount = userData.nextShort();
				if(memberCount<=familyMembersStrandard) {
					System.out.println("Congratulation You are eligibel for Ration Card");
					System.out.println("Your Ration Card will be printed delivered to your registed address");
				}
				else {
				System.out.println("As per Govt Standard your family member count is not eligible for Ration Card");
				}
			}
			else {
			System.out.println("As per Govt Standard your cast is not eligible for Ration Card");
			}
			}
		else {
		System.out.println("You are not eligible for Ration Card");
		}
	}
}
