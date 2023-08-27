package CarManager;

public  class Tractor extends DistanceMetods{
	String Model;
	
	int YearOfRelease;
	
	int Price;

	int Weght;
	
	String TireTipe;
	
	int FuelConsInHour;
	
	int Power;
	
	Color Color;

	public Tractor(String model, int yearOfRelease, int price, int weght, String tireTipe, int fuelConsInHour,
			int power, Color color) {
		Model = model;
		YearOfRelease = yearOfRelease;
		Price = price;
		Weght = weght;
		TireTipe = tireTipe;
		FuelConsInHour = fuelConsInHour;
		Power = power;
		Color = color;
	}

	public Tractor(String model, int yearOfRelease, int price, int weght, String tireTipe, int fuelCons, int power,
		Color color, int distance, int lastMaintenanceDistance) {
		Model = model;
		YearOfRelease = yearOfRelease;
		Price = price;
		Weght = weght;
		TireTipe = tireTipe;
		FuelConsInHour = fuelCons;
		Power = power;
		Color = color;
		this.distance = distance;
		LastMaintenanceDistance = lastMaintenanceDistance;
	}

	@Override
	public String toString() {
		return "Tractor [Model=" + Model + ", YearOfRelease=" + YearOfRelease + ", Price=" + Price + ", Weght=" + Weght
				+ ", TireTipe=" + TireTipe + ", FuelCons=" + FuelConsInHour + ", Power=" + Power + ", Color=" + Color
				+ ", distance=" + distance + ", LastMaintenanceDistance=" + LastMaintenanceDistance + "]";
	}

}
