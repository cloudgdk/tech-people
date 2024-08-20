package java_inheritence;

import java.util.ArrayList;
import java.util.List;

public class CalcMain {
    public static final int age =10;
    public int rufage=20;
    
	public static void main(String[] args) {
		CalcMain cal1 = new CalcMain();
		CalcMain cal12 = new CalcMain();
		System.out.println("My age is " + age);
//		age=30;
		cal1.displayage();
	
	}
	
	public  void  displayage() {
		System.out.println("My age is " + rufage);
	}
	
	
	

}
