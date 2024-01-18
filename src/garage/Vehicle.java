package garage;

import java.util.Objects;

public abstract class Vehicle {

	private String make;
	private String model;
	private String colour;

	public Vehicle(String make, String model, String colour) {
		super();
		setMake(make);
		setModel(model);
		setColour(colour);
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + "]";
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

}
