// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Takes in a text file, and prints the next-to-last word for each line

import java.io.*;
import java.util.*;

public class PenulimateWord {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] words = line.split("[ \t]+");
			System.out.println(words[words.length - 2]);
		}
	}
}
