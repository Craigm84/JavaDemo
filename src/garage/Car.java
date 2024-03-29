package garage;

public class Car extends Vehicle {

	public Car(String make, String model, String colour, boolean hasBoot) {
		super(make, model, colour);
		setHasBoot(hasBoot);

	}

	public Car() {
		super();
	}

	@Override
	public int calcBill() {
		return 500;
	}

	private boolean hasBoot;

	public boolean getHasBoot() {
		return hasBoot;

	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	@Override
	public String toString() {
		return "Car id=  " + getId() + ", Has Boot=" + hasBoot + ", Make=" + getMake() + ", Model=" + getModel()
				+ ", Colour=" + getColour() + "]";
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Has Boot : " + getHasBoot());
//	}

}
