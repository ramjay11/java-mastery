package reflections_basics;

public class Main {

	public static void main(String[] args) {
		// Class reference for primitives
		Class c1 = int.class;
		Class c2 = double.class;
		Class c3 = long.class;
		Class c4 = void.class;
		System.out.println(c4.getName());
	}
}
