package javabasics;

public class GirlFriendMain {

	public static void main(String[] args) {
		GirlFriend girl1 = new GirlFriend();
		
		girl1.setAge(12);
		girl1.setGirlFriendName("Surekha");
		
		
		girl1.diplaygirlDetails();
		
		int result = girl1.noofSarees(4,5);
		
		System.out.println("my girl having sarees " + result);
		
		String result1 =girl1.girlbreakup();
		
		System.out.println("Break up status" + result1);
		
		String result2 = girl1.girllovesucess("365", "good");
		
		System.out.println("Curent relation status  " + result2);
		
		boolean result3 = girl1.girlMaried(17);
		
		System.out.println("is girl Married   " + result3);
		
		String result4 = girl1.noofChild(1,1);
		
		System.out.println("eligiblity status for job   " + result4);

	}

}
