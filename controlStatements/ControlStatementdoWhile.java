package controlStatements;

import java.util.Scanner;

public class ControlStatementdoWhile {

	public static String userResponseStandard="MENU";
	public static void main(String[] args) {
		Scanner orderData = new Scanner(System.in);
		String userResponse= null;
		int orderCount=0;
		String orderItems[];
		boolean loopRun=false;
		System.out.println("I am Menu Displayer");
		do {
			System.out.println("Idly(2)         -->   20");
			System.out.println("Poori(2)        -->   30");
			System.out.println("Dosa            -->   40");
			System.out.println("Vada            -->   50");
			System.out.println("Mysore Bajji    -->   30");
			System.out.println("Choose your items");
			System.out.println("how many plates you want");
			orderCount = orderData.nextInt();
			orderItems= new String[orderCount];
			for(int i=0;i<orderItems.length;i++) {
				System.out.println("Tell me your  item " +(i+1));
				orderItems[i]=orderData.next();
			}
			
			System.out.println("you want me show the menu again or bill");
			userResponse = orderData.next();
			if(userResponse.equalsIgnoreCase(userResponseStandard)) {
				loopRun=true;
			}
			
			
		}
		
		while(loopRun) ;

	}

}
