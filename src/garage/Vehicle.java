package garage;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private static int count = 0;

	private int id;
	private String make;
	private String model;
	private String colour;

	public Vehicle(String make, String model, String colour) {
		super();
		setId(++count);
		setMake(make);
		setModel(model);
		setColour(colour);
	}

	public Vehicle() {
		super();
		setId(++count);
	}

	@Override
	public String toString() {
		return "Vehicle [id= " + id + "make=" + make + ", model=" + model + ", colour=" + colour + "]";
	}

// The above can be used instead of the print method below

//	public void print() {
//		System.out.println(make);
//		System.out.println(model);
//		System.out.println(colour);
//	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract int calcBill();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	sort by model ASC
	@Override
	public int compareTo(Vehicle o) {
		return model.compareTo(o.model);
	}

//	sort by model DESC
//	public int compareTo(Vehicle o) {
//		return o.model.compareTo(model);
//	}

//	sort by id ASC
//	public int compareTo(Vehicle o) {
//		return id - o.id;
//	}

//	sort by id DESC
//	public int compareTo(Vehicle o) {
//		return o.id - id;
//	}
}
