package abstracts_interfaces;

public class Vehicle implements Drivable {
	
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;
	

	@Override
	public int getWheel() {
		return this.numOfWheels;
	}

	@Override
	public void setWheel(int numWheels) {
		this.numOfWheels = numWheels;
		
	}

	@Override
	public double getSpeed() {
		return this.theSpeed;
	}

	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;
		
	}
	
	public Vehicle(int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

}
