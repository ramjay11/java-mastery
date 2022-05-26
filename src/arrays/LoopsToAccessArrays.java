package arrays;

public class LoopsToAccessArrays {

	public static void main(String[] args) {
		double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
		int numbers[] = new int[10];
		int i;
		
		for (i = 0; i <= 5; i++) {
			System.out.println("Grade number " + i + " is " + grades[i]);
		}
		
		for (i = 0; i <= 9; i++) {
			//numbers[i] = i + 10;
			numbers[i] = i;
		}
		
		for (i = 0; i <= 9; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
