package javabasics;

public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();//aggreation
		CompanyDeteails com1 = new CompanyDeteails();//aggreation
		int age;//Integer age;
		String name;
		
		
		emp1.setEmpId(123);
		emp1.setEmpName("Devendra");
		emp1.setMyFirdId(456);
		emp1.setCatagery("Textiles");
		System.out.println("=========Employee details and Firm Details======");
		System.out.println("my emp id is " + emp1.getEmpId());
		System.out.println("my emp id is " + emp1.getEmpName());
		System.out.println("firm id is " + emp1.getMyFirdId());
		System.out.println("This compmay comes Under " + emp1.getCatagery());
		
		int sal= emp1.empsalary(200,300);//method calling
		System.out.println("my salary is " + sal);
		
		emp1.coupenDetails();
		
		System.out.println("=========Compnay details and Firm Details======");
		com1.setCompnayName("Jayachandran Motors");
		com1.setCompanyId(78);
		com1.setMyFirdId(98);
		com1.setCatagery("Motors");
		System.out.println("this is from comapny " + com1.getCompanyId());
		System.out.println("this is from comapny " + com1.getCompnayName());
		System.out.println("this is from comapny " + com1.getMyFirdId());
		System.out.println("this is from comapny " + com1.getCatagery());
		
		
		

	}

}
