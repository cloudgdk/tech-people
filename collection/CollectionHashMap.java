package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionHashMap {
	public static void main(String args[]) {
		HashMap<String, Long> laptopList = new HashMap<String, Long>();
		laptopList.put("Dell",10000l);
		laptopList.put("Lenovo", 20000l);
		laptopList.put("Hp", 30000l);
		laptopList.put("Acer", 40000l);
		laptopList.put("Samsung", 50000l);
		
		System.out.println(laptopList);
		
		HashMap<PhoneModel, PhoneCost> phoneList = new HashMap<PhoneModel, PhoneCost>();
		
		Scanner phoneData = new Scanner(System.in);
		System.out.println("Enter how many phones you want to Store");
		int totPhones = phoneData.nextInt();
		for (int i=0;i<totPhones;i++) {
			PhoneModel pmodel = new PhoneModel();
			PhoneCost pcost = new PhoneCost(); 
			System.out.println("Enter Phone Data as");
			System.out.println("Model");
			pmodel.setPhoneModel(phoneData.next());
			System.out.println("Cost");
			pcost.setPhoneCost(phoneData.nextLong());
			
			phoneList.put(pmodel, pcost);
		}
		
		System.out.println("Available phones in Store");
		for (Map.Entry phone : phoneList.entrySet()) {
			PhoneModel pmodel = new PhoneModel();
			PhoneCost pcost = new PhoneCost(); 
			pmodel = (PhoneModel) phone.getKey();
			pcost = (PhoneCost)phone.getValue();
			System.out.println(pmodel.getPhoneModel() + "  " + pcost.getPhoneCost());
		}
		
	}

}
