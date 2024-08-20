package javabasics;

import java_inheritence.FoodCoupan;

public class Employee extends Firms implements FoodCoupan {

	private Integer empId;//Integer--int
	private String empName;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public static void empDisplay() {
		System.out.println("I am from static method");
	}
	
	public int empsalary(int basic,int hra) {//method decalaratin
		int salaray =basic+hra;
		//System.out.println("your salary is " + salaray);
		return salaray;
		
	}
	@Override
	public void coupenDetails() {
		// body of interfcae
		System.out.println("I am orgianlly calling from interface");
	}
	
	
	
}

//Integer,Long.Double,Character,Boolean,Short,Float,Byte
//Boxing Unboxing