package garage;

public class App {

	public static void main(String[] args) {

		Plane aero = new Plane("Boeing", "737", "Silver", true);

		Plane aero2 = new Plane();
		aero2.setMake("Boeing");
		aero2.setModel("747");
		aero2.setColour("White");
		aero2.setHasWings(true);
//
//		aero.print();
//		aero2.print();

		Car myCar = new Car("Jaguar", "i-Pace", "Blue", false);
//		myCar.print();

		Car wifeCar = new Car("Mercedez", "EQC", "Black", true);
//		wifeCar.print();

		Bike myBike = new Bike("Ducati", "500", "Red", true);
//		myBike.print();

		Bike friendsBike = new Bike("Yamaha", "250", "Green", true);
//		friendsBike.print();

		Vehicle vCar = new Car("BMW", "4 Series", "White", true);
		Vehicle vBike = new Bike("Suzuki", "Ninja", "Gold", true);
		Vehicle vPlane = new Plane("Tornado", "RAF", "Grey", true);

		Vehicle[] vehicles = { vCar, vBike, vPlane, friendsBike, myCar, wifeCar, myBike, aero, aero2 };

		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

		Garage myGarage = new Garage("The World is a Garage");
		myGarage.park(new Car("Ford", "Escort", "Orange", true));
		myGarage.park(vBike);
		myGarage.park(vPlane);
		myGarage.collect(vBike);
		myGarage.park(wifeCar);

		myGarage.print();

	}

}
