package increment_decrement;

public class IncrementDemo {

	public static void main(String[] args) {
		int age = 81;
		
		//age--; Prefix or Postfix doesn't change because it's only 1 statement
		
		//System.out.println(--age); Prefix change right away
		//System.out.println(age);
		
		System.out.println(age--); // Postfix change on the next line
		System.out.println(age);
	}
	
}
