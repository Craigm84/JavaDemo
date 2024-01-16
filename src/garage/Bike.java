package garage;

public class Bike extends Vehicle {

	public Bike(String make, String model, String colour, boolean has2wheels) {
		setMake(make);
		setModel(model);
		setColour(colour);
		setHas2wheels(true);

	}

	public Bike() {

	}

	private boolean has2wheels;

	public boolean getHas2wheels() {
		return has2wheels;

	}

	public void setHas2wheels(boolean has2wheels) {
		this.has2wheels = has2wheels;
	}

	@Override
	void print() {
		System.out.println(getMake());
		System.out.println(getModel());
		System.out.println(getColour());
		System.out.println("Wheels: " + getHas2wheels());
	}

}
