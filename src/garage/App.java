package garage;

public class App {

	public static void main(String[] args) {

		Plane aero = new Plane("Boeing", "737", "Silver", true);

		Plane aero2 = new Plane();
		aero2.setMake("Boeing");
		aero2.setModel("747");
		aero2.setColour("White");
		aero2.setHasWings(true);

		aero.print();
		aero2.print();

		Car myCar = new Car("Jaguar", "i-Pace", "Blue", false);
		myCar.print();

		Car wifeCar = new Car("Mercedez", "EQC", "Black", true);
		wifeCar.print();

		Bike myBike = new Bike("Ducati", "500", "Red", true);
		myBike.print();

		Bike friendsBike = new Bike("Yamaha", "250", "Green", true);
		friendsBike.print();

	}
}
