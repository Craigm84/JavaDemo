package garage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Plane aero = new Plane("Boeing", "737", "Silver", true);

		Plane aero2 = new Plane();
		aero2.getId();
		aero2.setMake("Spitfire");
		aero2.setModel("RAF");
		aero2.setColour("Green");
		aero2.setHasWings(true);

		Car carA = new Car();
		carA.getId();
		carA.setMake("Ford");
		carA.setModel("Mustang");
		carA.setColour("White");
		carA.setHasBoot(true);

		Bike bikeA = new Bike();
		bikeA.getId();
		bikeA.setMake("Kawasaki");
		bikeA.setModel("Ninja");
		bikeA.setColour("Black");
		bikeA.setHas2wheels(true);

//		aero.print();
//		aero2.print();

		Car myCar = new Car("Jaguar", "i-Pace", "Blue", true);
//		myCar.print();

		Car wifeCar = new Car("Mercedez", "EQC", "Black", true);
//		wifeCar.print();

		Bike myBike = new Bike("Ducati", "500", "Red", true);
//		myBike.print();

		Bike friendsBike = new Bike("Yamaha", "250", "Green", true);
//		friendsBike.print();

		Vehicle vCar = new Car("BMW", "4 Series", "White", false);
		Vehicle vBike = new Bike("Suzuki", "Ninja", "Gold", true);
		Vehicle vBike2 = new Bike("Suzuki", "Ninja", "Gold", true);
		Vehicle vPlane = new Plane("Tornado", "RAF", "Grey", true);

		Vehicle[] vehicles = { vCar, vBike, vPlane, friendsBike, myCar, wifeCar, myBike, aero, aero2 };

		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
		}

		Garage myGarage = new Garage("The World is a Garage");
		myGarage.park(new Car("Ford", "Escort", "Orange", true));
		myGarage.park(aero);
		myGarage.park(vBike);
		myGarage.park(vPlane);
		myGarage.park(vCar);
		myGarage.park(friendsBike);

//		System.out.println(myGarage);

//		myGarage.print();

		myGarage.collect(vBike);
		myGarage.park(vBike2);
		myGarage.park(myBike);
		myGarage.park(wifeCar);
		myGarage.park(aero2);
		myGarage.park(carA);
		myGarage.park(bikeA);

//		System.out.println(myGarage);
//		System.out.println(myCar);

//		myGarage.print();

//		System.out.println("vBike.equals(vBike2): " + (vBike.equals(vBike2)));

//		List<Vehicle> vehicles1 = List.of(vBike, vPlane, myCar);

//		for (Vehicle v : vehicles1) {
//			System.out.println(v.calcBill());
//		}
//
//		myGarage.fix();

		List<Vehicle> vList = new ArrayList<>(0);
//		vList.add(bikeA);
//		vList.add(carA);
//		vList.add(myBike);
//		vList.add(aero2);
		vList.add(aero);
		vList.add(friendsBike);
		vList.add(myCar);
		vList.add(vBike);
		System.out.println(vList);
		Collections.sort(vList);
		System.out.println(vList);
	}

}
