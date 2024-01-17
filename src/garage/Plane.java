package garage;

public class Plane extends Vehicle {

	public Plane(String make, String model, String colour, boolean hasWings) {
		super(make, model, colour);
		setHasWings(hasWings);

	}

	public Plane() {
		super();
	}

	private boolean hasWings;

	public boolean getHasWings() {
		return hasWings;

	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Has Wings: " + getHasWings());
	}

}
