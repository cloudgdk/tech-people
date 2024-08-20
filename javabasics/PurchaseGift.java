package javabasics;

public class PurchaseGift {

	public void valueGift(int purchasedAmount) {
		if (purchasedAmount>0 ) {
			if(purchasedAmount<=10000 ) 
				System.out.print("You are eligble for 20% disocunt on next purchase");
				if(purchasedAmount<=5000)
					System.out.print("You are eligble for 10% disocunt on next purchase");
						if(purchasedAmount<=1000)
							System.out.print("You are eligble for 5% disocunt on next purchase");
				
				
			
		}
	}
	public static void valueGift1(int purchasedAmount) {
	    if (purchasedAmount > 0) {
	        if (purchasedAmount < 1000) {
	            System.out.println("Sorry, you don't have any return gift.");
	        }  if (purchasedAmount > 5000) {
	            System.out.println("You are eligible for a 10% discount on your next purchase.");
	        }
	         if (purchasedAmount > 5000 && purchasedAmount <= 10000) {
	            System.out.println("You are eligible for a 20% discount on your next purchase.");
	         }
	    }	    }
}
