package garage;

public class Plane extends Vehicle {

	public Plane(String make, String model, String colour, boolean hasWings) {
		setMake(make);
		setModel(model);
		setColour(colour);
		setHasWings(true);

	}

	public Plane() {

	}

	private boolean hasWings;

	public boolean getHasWings() {
		return hasWings;

	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	@Override
	void print() {
		System.out.println(getMake());
		System.out.println(getModel());
		System.out.println(getColour());
		System.out.println("Has Wings: " + getHasWings());
	}

}
