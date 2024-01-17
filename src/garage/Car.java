package garage;

public class Car extends Vehicle {

	public Car(String make, String model, String colour, boolean hasBoot) {
		super(make, model, colour);
		setHasBoot(hasBoot);

	}

	public Car() {
		super();
	}

	private boolean hasBoot;

	public boolean getHasBoot() {
		return hasBoot;

	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Has Boot : " + getHasBoot());
	}

}
