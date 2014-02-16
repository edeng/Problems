// Eden Ghirmai, 2/15/2014, www.codeeval.com
// Prints the biggest prime palindrome under 1000.

public class PrimePalindrome {
    public static void main (String[] args) {
    
    	int max = 0; 
    	for (int i = 0; i < 1000; i++) {
    		if (isPrime(i) && i == reverseNumber(i)) {
    				max = Math.max(i, max); 
    		}
    	}
    	
    	System.out.println(max);
	   
  }
    
    // reverses the digits of the given integer and returns the reverse
    public static int reverseNumber(int n) {
    	int remainder = 0;
    	int reverse = 0; 
    	while (n > 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
    	}
        return reverse;
    }
    
    // returns whether the given integer is prime
    public static boolean isPrime(int n) {
    	for (int i = 2; i < n / 2; i++) {
    		if (n % i == 0) 
    			return false; 
    	}
    	return true;
    }
}
