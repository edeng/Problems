/*
* Eden Ghirmai
* ReverseString.java
*
* Reverse a String - Enter a string and the program will reverse it and print it out.*/

public class ReverseString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What phrase would you like to reverse?: ");
		String phrase = in.nextLine();
		
		String result = "";
		
		for (int i = phrase.length() - 1; i >= 0; i--) {
			String letter = phrase.substring(i, i + 1);
			result += letter;
		}
		
		System.out.println("Reversed Phrase: " + result);
	}
}
