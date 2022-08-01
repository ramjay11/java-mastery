package cryptography;

public class EncryptionDescriptionBasic {

	public static void main(String[] args) {
		// Ramjay -> original message
		// Sbnkbz -> encoded message
		// -1 -> key to decode
		// Ramjay -> decoded message
		
		int key = 6;
		
		//String text = "Hey, how you doing?";
		String text = "Nk2&nu}&u{&juotmE"; // Encrypted message
		
		System.out.println(text);
		
		char[] chars = text.toCharArray();
		
		for (char c : chars) {
			// int and char can work together
			//c += key; 
			c -= key; // decrypt
			System.out.print(c);
		}
		
	}
}
