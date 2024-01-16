package garage;

public class Car extends Vehicle {

	public Car(String make, String model, String colour, boolean hasBoot) {
		setMake(make);
		setModel(model);
		setColour(colour);
		setHasBoot(true);

	}

	public Car() {

	}

	private boolean hasBoot;

	public boolean getHasBoot() {
		return hasBoot;

	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	@Override
	void print() {
		System.out.println(getMake());
		System.out.println(getModel());
		System.out.println(getColour());
		System.out.println("Has Boot : " + getHasBoot());
	}

}
