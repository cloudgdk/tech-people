package javabasics;

public class AgeGroup {
	
	public void ageCalc(int age) {
		if(age==0 && age <5) {
			System.out.println("Your are an infant, since your age is " + age);
		}
		
		else if(age>5 && age<=10) {
			System.out.println("Your are an Kid, since your age is " + age);
		}
		else if (age>10 && age<=20) {
			System.out.println("Your are a teenger, since your age is " + age);	
		}
		
		else if (age>20 && age<=30) {
			System.out.println("Your are Most elibgile batchler, since your age is " + age);	
		}
		
		else if (age>30 && age<=60) {
			System.out.println("Your are good family man, since your age is " + age);	
		}
		else if (age>60 && age<=100) {
			System.out.println("Your are Sr Cititzen, since your age is " + age);	
		}
		else if (age>=100 ) {
			System.out.println("Your are equile to god, since your age is  " + age);	
		}
		
	}

}
