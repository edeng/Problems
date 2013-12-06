/*
 * Eden Ghirmai
 * PigLatin.java
 * 
 * Pig Latin is a game of alterations played on the English language game.
 * To create the Pig Latin form of an English word the initial consonant sound is 
 * transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).*/

import java.util.*;

public class PigLatin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What word would you like to translate to Pig Latin?: ");
		String word = in.next();
		System.out.println("Original Word: " + word);
		System.out.println("Translation: " + solve(word));
	}
	
	
	public static String solve (String word) {
		String temp = word.toLowerCase();
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		char first = temp.charAt(0);

		
		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {
				return word + "way";
			}
		}
		
		word = word.substring(1);
		word += first + "ay";
		
		
		return word;
	}

}
