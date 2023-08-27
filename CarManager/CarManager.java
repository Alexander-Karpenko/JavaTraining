package CarManager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) throws DistanceException {
		Car Toyota_Prius = new PassangerCar("Toyota_Prius", 2008, 150000, 1200, Color.GREEN);
		
		Car Renualt = new PassangerCar("Renualt Laguna", 2000, 97000, 1600, Color.WHITE);
		
		Car Renualt2 = new Bus("Renualt Laguna", 2000, 97000, 1600, Color.WHITE);
		
		Car Mercedes = new Bus("Mercedes CL2", 2000, 150000, 3000, Color.BLUE);
		
		Tractor Vaz = new Tractor("Vaz",1986, 10000, 6000, "Big", 5, 300, Color.BLACK); 
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(Mercedes);
		cars.add(Toyota_Prius);
		cars.add(Renualt);
		cars.add(Renualt2);
		
		
		
		
		Toyota_Prius.AddDistance(100000);
		Toyota_Prius.AddLastMaintenanceDistance(10001);
		Renualt.AddLastMaintenanceDistance(1000);
		Mercedes.AddLastMaintenanceDistance(100000);
		Vaz.AddDistance(-100000);
		Vaz.AddLastMaintenanceDistance(100000);
		
		System.out.println("Need " + Renualt.Model  + " for maintenance " + Renualt.CheckLastMaintenanceDistance());
		System.out.println("Need " + Mercedes.Model  + " for maintenance " + Mercedes.CheckLastMaintenanceDistance());
		
		System.out.println("Need " + Vaz.Model  + " for maintenance " + Vaz.CheckLastMaintenanceDistance());
		
		Mercedes.Service();
		
		System.out.println("Need " + Mercedes.Model  + " for maintenance " + Mercedes.CheckLastMaintenanceDistance());
		
		System.out.println(Vaz);
		System.out.println(Toyota_Prius);
		System.out.println(Renualt);
		
		//System.out.println(Toyota_Prius.equals(Renualt2) );
		//System.out.println(Renualt.equals(Renualt2));
		
		System.out.println(cars);
	}

}
