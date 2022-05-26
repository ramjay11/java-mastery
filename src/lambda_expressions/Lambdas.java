package lambda_expressions;

public final class Lambdas {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		// myCat.print();
		// printThing(myCat);
		Printable lambdaPrintable = () -> System.out.println("Meow!");
		// Lambda implementation
		//printThing(() -> System.out.println("Meow!"));
		printThing(lambdaPrintable);
	}

	static void printThing(Printable thing) {
		thing.print();
	}

}
