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

	public void print() {
		for (Vehicle vehicle : vehs) {
			vehicle.print();
		}
	}
}
