package abstracts_interfaces;

public class AbstractInterface {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Car Max Speed " + car.getSpeed());
		System.out.println("Number of Wheels " + car.getWheel());
	}
}
