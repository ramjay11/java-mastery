package recursion;

public class FactorialRecursion {

	public static void main(String[] args) {

		// Factorial is a number multiplied by each of its proceeding numbers
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
		// Recursion is a method called inside of itself
		if (n == 1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1; // Base case
		} else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
			return n * factorial(n - 1);
		}
		
	}
}
