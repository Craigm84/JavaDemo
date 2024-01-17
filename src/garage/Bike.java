package garage;

public class Bike extends Vehicle {

	public Bike(String make, String model, String colour, boolean has2wheels) {
		super(make, model, colour);
		setHas2wheels(has2wheels);

	}

	public Bike() {
		super();
	}

	private boolean has2wheels;

	public boolean getHas2wheels() {
		return has2wheels;

	}

	public void setHas2wheels(boolean has2wheels) {
		this.has2wheels = has2wheels;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("2 Wheels: " + getHas2wheels());
	}

}
