package CarManager;

import java.util.Objects;

public abstract class Car implements Serviceable{
	String Model;
	
	int YearOfRelease;
	
	int Price;

	int Weght;
	
	Color Color;
	
	private int distance = 0;
	protected int LastMaintenanceDistance = 0;

	public Car(String model, int yearOfRelease, int price, int weght, Color color) {
		Model = model;
		YearOfRelease = yearOfRelease;
		Price = price;
		Weght = weght;
		Color = color;
	}
	
	
	public void AddDistance (int AdditinalDistance) throws DistanceException {
		try {
		if (AdditinalDistance <= 0) {
			throw new DistanceException("Distance can be positive only");
		}else {
			distance +=  AdditinalDistance;
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
	

	@Override
	public String toString() {
		return "Car [Model=" + Model + ", YearOfRelease=" + YearOfRelease + ", Price=" + Price + ", Weght=" + Weght
				+ ", Color=" + Color + ", distance=" + distance + ", LastMaintenanceDistance=" + LastMaintenanceDistance
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Color, Model, Price, Weght, YearOfRelease);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Color == other.Color && Objects.equals(Model, other.Model) && Price == other.Price
				&& Weght == other.Weght && YearOfRelease == other.YearOfRelease;
	}
	
	
}
