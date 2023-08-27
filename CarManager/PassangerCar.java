package CarManager;

public class PassangerCar extends Car {

	public PassangerCar(String model, int yearOfRelease, int price, int weght, Color color) {
		super(model, yearOfRelease, price, weght, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean CheckLastMaintenanceDistance() {
		if(LastMaintenanceDistance > 10000) {
			return true;
		} 
		return false;
		
	}
	
}
