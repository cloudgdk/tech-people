package controlStatements;

import java.util.Scanner;

public class ControlStatement_IfelseLader {

	static int marksStandard = 35;
	static int teluguM = 0;
	static int hindiM = 0;
	static int englishM = 0;
	static int mathsM = 0;
	static int scienceM = 0;
	static int socialM = 0;
	static boolean result = false;

	public static void main(String args[]) {
		Scanner studentData = new Scanner(System.in);

		System.out.println("I am SSC Exam Result Identifier");
		System.out.println("Enter your marks in Telugu");
		int telmarks = studentData.nextInt();
		teluguM = telmarks;

		System.out.println("Enter your marks in Hindhi");
		int hinmarks = studentData.nextInt();
		hindiM = telmarks;

		System.out.println("Enter your marks in English");
		int engmarks = studentData.nextInt();
		englishM = engmarks;

		System.out.println("Enter your marks in Maths");
		int mathmarks = studentData.nextInt();
		mathsM = mathmarks;

		System.out.println("Enter your marks in Science");
		int scimarks = studentData.nextInt();
		scienceM = scimarks;

		System.out.println("Enter your marks in Social");
		int socmarks = studentData.nextInt();
		socialM = socmarks;

		if(telmarks>=marksStandard && hinmarks>=marksStandard && engmarks>= marksStandard && mathmarks >=marksStandard && scimarks>=marksStandard && socmarks>=marksStandard) {
			result=true;
			System.out.println("Congratulationss You passed");
			
		}
		else {
			System.out.println("You are failed");
		}
		
		System.out.println("Your Score card is below");
		int total=0;
		if(result) {
			total = telmarks+hinmarks+engmarks+mathmarks+scimarks+socmarks;
			if(total>=420) {
				System.out.println("Your passed in Distinction and your Grade is A");
				System.out.println("TELEUGU                         "  +telmarks);
				System.out.println("HINDHI(SECOND LANGUAGE)         "  +hinmarks);
				System.out.println("ENGLISH(THIRD LANGUAGE)         "  +engmarks);
				System.out.println("MATHAMATICS                     "  +mathmarks);
				System.out.println("SCIENCE                         "  +scimarks);
				System.out.println("SOCIAL                          "  +socmarks);
			}
			
			else if(total>=360 && total<420) {
				System.out.println("Your passed in First Class and your Grade is B");
				System.out.println("TELEUGU                         "  +telmarks);
				System.out.println("HINDHI(SECOND LANGUAGE)         "  +hinmarks);
				System.out.println("ENGLISH(THIRD LANGUAGE)         "  +engmarks);
				System.out.println("MATHAMATICS                     "  +mathmarks);
				System.out.println("SCIENCE                         "  +scimarks);
				System.out.println("SOCIAL                          "  +socmarks);
			}
			else if(total>=300 && total<360) {
				System.out.println("Your passed in Second Class and your Grade is C");
				System.out.println("TELEUGU                         "  +telmarks);
				System.out.println("HINDHI(SECOND LANGUAGE)         "  +hinmarks);
				System.out.println("ENGLISH(THIRD LANGUAGE)         "  +engmarks);
				System.out.println("MATHAMATICS                     "  +mathmarks);
				System.out.println("SCIENCE                         "  +scimarks);
				System.out.println("SOCIAL                          "  +socmarks);
			}
			else {
				System.out.println("Your passed in Third Class and your Grade is D");
				System.out.println("TELEUGU                         "  +telmarks);
				System.out.println("HINDHI(SECOND LANGUAGE)         "  +hinmarks);
				System.out.println("ENGLISH(THIRD LANGUAGE)         "  +engmarks);
				System.out.println("MATHAMATICS                     "  +mathmarks);
				System.out.println("SCIENCE                         "  +scimarks);
				System.out.println("SOCIAL                          "  +socmarks);
			}
			
		}
	}
}
