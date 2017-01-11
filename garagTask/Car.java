package garagTask;

public class Car extends Vehicle {

	// declare a unique car characteristic
	int carBoot = 1;

	// constructor

	public Car(String make, String colour, int vehicleID, String engine,
			int carBoot) {
		super(make, colour, vehicleID, engine);
		this.carBoot = carBoot;
	}

}
