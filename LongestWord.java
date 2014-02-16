// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Finds the longest word in a sentence and prints it
// If a sentence has more than one word of the same length, first one is picked
// Does this for every line

import java.io.*;
import java.util.*;

public class LongestWord {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String longest = ""; 
			String line = in.nextLine();
			Scanner lineScan = new Scanner(line); 
			while(lineScan.hasNext()) {
				String word = lineScan.next();
				if (word.length() > longest.length()) {
					longest = word;
				}
			}
			
			System.out.println(longest); 
		}
	}
}
