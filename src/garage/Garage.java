package garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehs = new ArrayList<>();

	public Garage(String name) {
		super();
	}

	public void park(Vehicle vehicle) {
		vehs.add(vehicle);
	}

	public void collect(Vehicle vehicle) {
		vehs.remove(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [Vehicles=" + vehs + "]";
	}

	public void fix() {
		int sum = 0;
		for (Vehicle vBill : vehs) {
			System.out.println("Bill: " + vBill.calcBill());
			sum = sum + vBill.calcBill();
		}
		System.out.println("Total Bill: " + sum);
	}

//	public void print() {
//		for (Vehicle vehs : vehs) {
//			vehs.print();
//		}
//	}
}
