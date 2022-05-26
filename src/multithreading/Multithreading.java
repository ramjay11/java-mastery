package multithreading;

public class Multithreading {

	public static void main(String[] args) {
		// MultithreadThing myThing = new MultithreadThing();
		// MultithreadThing myThing2 = new MultithreadThing();
		for (int i = 0; i <= 3; i++) {
			MultithreadThing myThing = new MultithreadThing(i);

			myThing.start(); // Use start instead of run to run multiple concurrent threads
		}
		// myThing2.start();
	}
}
