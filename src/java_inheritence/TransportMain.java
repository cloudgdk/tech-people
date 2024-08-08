package java_inheritence;

public class TransportMain {

	public static void main(String args[]) {
		Car maruthi = new Car();

		maruthi.setCarName("SwitDezire");
		maruthi.setCarMode("Manula");
		maruthi.setCarType("Four");
		maruthi.display();
		
		String result = maruthi.trnasportType("Four");
		
		System.out.println(result);
	}
}
