// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Print out the grade school multiplication table up to 12*12.
// Print out the table in a matrix like fashion, each number formatted to a width of 4 
// The numbers are right-aligned and strip out leading/trailing spaces on each line

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.print(i);
			for (int j = 2; j <= 12; j++) {
				for (int k = 0; k < 4 - length(i * j); k++) {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}			
			System.out.println();
		}
	}
	
	// returns the amount of digits of a given integer 
	public static int length(int n) {
		if (n < 10) {
			return 1;
		} else {
			return 1 + length(n / 10);
		}
	}
}
