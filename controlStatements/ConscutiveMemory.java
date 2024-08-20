package controlStatements;

public class ConscutiveMemory {

	public static void main(String[] args) {
		//array size is static
		int marks_T_H_E_M_Si_SO[]= {35,40,50,60,70,80};
		
		int subjectMarks[] = new int[6];
		subjectMarks[0] = 35;
		subjectMarks[1] = 40;
		subjectMarks[2] = 50;
		subjectMarks[3] = 60;
		subjectMarks[4] = 70;
		subjectMarks[5] = 80;
		
		System.out.println("Your Marks are Below");
		System.out.println("Telugu " + marks_T_H_E_M_Si_SO[0]);
		System.out.println("Hindhi " + marks_T_H_E_M_Si_SO[1]);
		System.out.println("English " + marks_T_H_E_M_Si_SO[2]);
		System.out.println("Maths " + marks_T_H_E_M_Si_SO[3]);
		System.out.println("Science " + marks_T_H_E_M_Si_SO[4]);
		System.out.println("Social " + marks_T_H_E_M_Si_SO[5]);
		System.out.println("Your Marks Printing Again");
		System.out.println("Telugu " + subjectMarks[0]);
		System.out.println("Hindhi " + subjectMarks[1]);
		System.out.println("English " + subjectMarks[2]);
		System.out.println("Maths " + subjectMarks[3]);
		System.out.println("Science " + subjectMarks[4]);
		System.out.println("Social " + subjectMarks[5]);

		String day1="MON";
		String day2="TUE";
		String day3="WED";
		String day4="THU";
		String day5="FRI";
		String day6="SAT";
		String day7="SUN";
		System.out.println("Days in week are");
		System.out.println(day1 + "  " + day2 + "  " + day3 + " " + day4 + " " + day5 + " " + day6 + " " + day7);
		
		String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		System.out.println("Days in week printing again");
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);
		
		String []week = new String[7];
		week[0]="MON";
		week[1]="TUE";
		week[2]="WED";
		week[3]="THU";
		week[4]="FRI";
		week[5]="SAT";
		week[6]="SUN";
		System.out.println("weekly days are");
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week[2]);
		System.out.println(week[3]);
		System.out.println(week[4]);
		System.out.println(week[5]);
		System.out.println(week[6]);
		
		
		
	}

}
