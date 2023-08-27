package CarManager;

public class Bus extends Car {

	public Bus(String model, int yearOfRelease, int price, int weght, Color color) {
		super(model, yearOfRelease, price, weght, color);
	}
	@Override
	public boolean CheckLastMaintenanceDistance(){
		if(LastMaintenanceDistance > 50000) {
			return true;
		} 
		return false;
		
	}
}
