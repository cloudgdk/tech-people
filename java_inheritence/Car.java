package java_inheritence;

public class Car  implements Transport, Vehicle{
	
	private String carName ;
	private String carType;
	private String carMode;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarMode() {
		return carMode;
	}
	public void setCarMode(String carMode) {
		this.carMode = carMode;
	}
	
	public void display() {
		
		System.out.println("Car Name is  " +carName);
		System.out.println("Car Type is " +carType);
		System.out.println("Car Mode is  " +carMode);
		
	}
	@Override
	public String trnasportType(String tType) {
		// 
		if(carType =="Four") {
			return "Non-Transport";
		}
		return "Transport";
	}
	

}
