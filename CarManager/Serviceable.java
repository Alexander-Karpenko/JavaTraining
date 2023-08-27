package CarManager;

public interface Serviceable {
	public boolean CheckLastMaintenanceDistance();

	public int getDistance();

	public int getLastMaintenanceDistance();

	public void AddLastMaintenanceDistance(int AdditinalDistance) throws DistanceException;

	public void AddDistance(int AdditinalDistance) throws DistanceException;
}
