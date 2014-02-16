// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Reverses the word of an input sentence 

import java.io.*;
import java.util.*; 

public class ReverseWords {
	public static void main(String[] args) throws FileNotFoundException {
		 File file = new File(args[0]);
		 Scanner in = new Scanner(file); 
		 
		 while(in.hasNextLine()) {
			 String line = in.nextLine(); 
			 line = line.trim();
			 String result = ""; 
			 String[] current = line.split("[ \t]+");
			 for (int i = current.length - 1; i >= 0; i--) {
				 result += current[i] + " ";
			 }
			 
			 System.out.println(result.trim()); 
			 
		 }
	}
	
}
