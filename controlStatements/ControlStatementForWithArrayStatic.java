package controlStatements;

public class ControlStatementForWithArrayStatic {

	public static void main(String args[]) {
		int ageGroups[]= {10,20,30,40,50,60,70,80,90,100};
		//array will store elements based on index
		//we can run the loop based on index location for reading the value or storing the value
		int indexloactionstart;
		int indexCurrentLocation=0;
		
		for(indexloactionstart=0;indexCurrentLocation<10;indexCurrentLocation++) {
			System.out.println(ageGroups[indexCurrentLocation]);
		}
		
		System.out.println("Printing the Age groups Again");
		
		for(int i=0;i<10;i++) {
			System.out.println(ageGroups[i]);
		}
		
		String topperList[] = new String[5];
		topperList[0]="Raja";
		topperList[1]="Gopal";
		topperList[2]="Surekha";
		topperList[3]="Krishna";
		topperList[4]="Devendra";
		
		System.out.println("Toppers in Java Pritting Normal");
		System.out.println(topperList[0]);
		System.out.println(topperList[1]);
		System.out.println(topperList[2]);
		System.out.println(topperList[3]);
		System.out.println(topperList[4]);
		
		
		System.out.println("Toppers in Java  Printing throug loop");
		for (int i=0;i<topperList.length;i++) {
			System.out.println(topperList[i]);
		}
		
		
	}
}
