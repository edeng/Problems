/*
* Eden Ghirmai
* Factorial.java
*
* Factorial Finder - The Factorial of a positive integer, n,
* is defined as the product of the sequence n, n-1, n-2, ...1 and the factorial of zero, 0,
* is defined as being 1. Solve this using both loops and recursion. */

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
	
	System.out.println("Find with recursion:");
	System.out.println("1 factorial is: " + findRecurse(1));
	System.out.println("5 factorial is: " + findRecurse(5));	
	System.out.println("10 factorial is: " + findRecurse(10));
	System.out.println();
	
	System.out.println("Find with loops:");
	System.out.println("1 factorial is: " + findLoop(1));
	System.out.println("5 factorial is: " + findLoop(5));	
	System.out.println("10 factorial is: " + findLoop(10));
	
	
	}
	
	// finds factorial with recursion
	// pre-condition: n >= 0
	public static int findRecurse(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * findRecurse(n - 1);	
		} 
	}
	
	// finds factorial with loops
	// pre-condition: n >= 0
	public static int findLoop(int n) {
		int product = 1;
		
		while (n != 0) {
			product *= n;
			n--;
		}
		
		return product;
	}
	
}
