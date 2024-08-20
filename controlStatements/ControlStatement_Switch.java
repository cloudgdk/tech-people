package controlStatements;

public class ControlStatement_Switch {

	public static void main(String[] args) {
		System.out.println("I am Month Idetifier");
		int mon=8;
		String month=null;
		
		switch(mon) {
		
		case 1: month="JANUARY";
		break;
		case 2: month="FEBRUARY";
		break;
		case 3: month="MARCH";
		break;
		case 4: month="APRIL";
		break;
		case 5: month="MAY";
		break;
		case 6: month="JUNE";
		break;
		case 7: month="JULY";
		break;
		case 8: month="AUGUST";
		break;
		case 9: month="SEPTEMBER";
		break;
		case 10: month="OCTOBER";
		break;
		case 11: month="NOVEMBER";
		break;
		case 12: month="DECEMBER";
		break;
		default: System.out.println("This is not valid month Number");
		
		
		}
		System.out.println("This month is " + month);

	}

}
