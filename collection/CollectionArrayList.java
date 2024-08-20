package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String args[]) {
		ArrayList<String> laptopList = new ArrayList<String>();	
		laptopList.add("Lenovo");
		laptopList.add("Dell");
		laptopList.add("HP");
		laptopList.add("ACER");
		laptopList.add("Thoshiba");
		
		
		System.out.println("List of laptops");
		System.out.println(laptopList);
		laptopList.remove("Thoshiba");
		
		System.out.println("List of laptops after romove");
		System.out.println(laptopList);
		
		ArrayList<MobilePhone> phoneList = new ArrayList<MobilePhone>();
		
		//setting or storing in list through for loop
		Scanner phoneData = new Scanner(System.in);
		System.out.println("How many mobiles you want to store");
		int totalPhones = phoneData.nextInt();
		for(int i=0; i<totalPhones;i++ ) {
			MobilePhone mphone = new MobilePhone();
			System.out.println("Please enter phones Data as");
			System.out.println("Mobile Model");
			String phmodel = phoneData.next();
			System.out.println("Mobile Price");
			long mprice = phoneData.nextLong();
			mphone.setPhoneModel(phmodel);
			mphone.setPhoneCost(mprice);
			
			phoneList.add(mphone);
			
		}
		
		for(MobilePhone mdata :phoneList ) {
			System.out.println("Available Phones in Store");
			System.out.println(mdata.getPhoneModel());
			System.out.println(mdata.getPhoneCost());
			
		}
		
		
		
		
		
	}
	
}
