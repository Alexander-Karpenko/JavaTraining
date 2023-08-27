package CarManager;

public class DistanceMetods implements Serviceable{
	
	protected int distance = 0;
	
	protected int LastMaintenanceDistance = 0;
	
	public void AddDistance (int AdditinalDistance) throws DistanceException {
		try {
		if (AdditinalDistance > 0) {
			distance +=  AdditinalDistance;
		}else {
			throw new DistanceException("Distance can be positive only");
		}
		}
		catch (DistanceException ex) {
			
			System.out.println(ex.getMessage());
		}	
	}
	
	public void AddLastMaintenanceDistance (int AdditinalDistance) throws DistanceException {
		try {
		if (AdditinalDistance <= 0) {
			throw new DistanceException("Distance can be positive only");
		}else {
			LastMaintenanceDistance +=  AdditinalDistance;
		}
		}
		catch (DistanceException ex) {
			System.out.println(ex.getMessage());
		}	
	}
		
	public int Service() {
		LastMaintenanceDistance = 0;
		return LastMaintenanceDistance;
	}
	
	
	public int getDistance() {
		return distance;
	}
	public int getLastMaintenanceDistance() {
		return LastMaintenanceDistance;
	}
	public boolean CheckLastMaintenanceDistance(){
		if(LastMaintenanceDistance > 50000) {
			return true;
		} 
		return false;
		}
	
	

}
