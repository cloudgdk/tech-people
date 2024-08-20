package javabasics;

public class GirlFriend {
	
	private String girlFriendName;
	private int age;
	public String getGirlFriendName() {
		return girlFriendName;
	}
	public void setGirlFriendName(String girlFriendName) {
		this.girlFriendName = girlFriendName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void diplaygirlDetails() {
		System.out.println("my girl name is" + girlFriendName);
		System.out.println("my girl age is " + age);
	}
	
	public int noofSarees(int silkSarees, int cottonSarees) {
		int totalsarees = silkSarees + cottonSarees;
		return totalsarees;//return statement
		
	}
	
	public String girlbreakup() {
		return "Not yet";
	}
	
	public String girllovesucess(String noofDayslivin, String relationship) {
		String currentstatus = noofDayslivin + relationship;
		return currentstatus;
	}
	
	public boolean girlMaried (int currentAge) {
		if(currentAge>18) {
			return true;
		}
		return false;
	}
	
	public String noofChild(int girlChild, int boyChild) {
		int totalChild = girlChild + boyChild;
		if(totalChild>2) {
			return "You are not eligible for goverment job";
		}
		return "You are eligible for government job";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
