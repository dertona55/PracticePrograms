package Practice;

// This code is copied from 

import acm.program.*;

public class FibonacciTest extends ConsoleProgram
{
	{ 
		static int fib(int n) 
		{ 
		if (n <= 1) 
		return n; 
		return fib(n-1) + fib(n-2); 
		} 
		
		public static void main (String args[]) 
		{ 
		int n = 9; 
		println(fib(n)); 
		} 
	} 
	/* This code is contributed by Rajat Mishra */


}