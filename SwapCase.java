// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Swaps letters' case in a sentence. 
// All non-letter characters remain the same.

import java.util.*;
import java.io.*;

public class SwapCase {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String result = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c >= 'a' && c <= 'z') {
					c = Character.toUpperCase(c);
				} else {
					c = Character.toLowerCase(c);
				}
				
				result += c;
			}
			System.out.println(result); 
		}
	}
}
