/*
 * Eden Ghirmai
 * CountVowels.java
 * 
 * Enter a string and the program counts the number of vowels in the text.
 * For added complexity have it report a sum of each vowel found.*/

import java.util.*;

public class CountVowels {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int sum = 0;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int[] counts = new int[5];
		
		System.out.print("What word/phrase would you like to use? ");
		String word = in.nextLine().toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			char current = word.charAt(i);
			for (int j = 0; j < vowels.length; j++) {
				if (current == vowels[j]) {
					sum++;
					counts[j]++;
				}
			}
		}
		
		System.out.println("Total amount of vowels: " + sum);
		System.out.println("Amount of As: " + counts[0]);
		System.out.println("Amount of Es: " + counts[1]);
		System.out.println("Amount of Is: " + counts[2]);
		System.out.println("Amount of Os: " + counts[3]);
		System.out.println("Amount of Us: " + counts[4]);
		
	}
	
}
