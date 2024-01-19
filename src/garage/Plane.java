package garage;

public class Plane extends Vehicle {

	public Plane(String make, String model, String colour, boolean hasWings) {
		super(make, model, colour);
		setHasWings(hasWings);

	}

	public Plane() {
		super();
	}

	@Override
	public int calcBill() {
		return 1000;
	}

	private boolean hasWings;

	public boolean getHasWings() {
		return hasWings;

	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	@Override
	public String toString() {
		return "Plane [id= " + getId() + ", Has Wings=" + hasWings + ", Make=" + getMake() + ", Model=" + getModel()
				+ ", Colour=" + getColour() + "]";
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Has Wings: " + getHasWings());
//	}

}
