package Practice;
/* File name: FibonacciSequence.java
 * 
 * This program calculates and prints the first 16 values in the Fibonacci sequence, starting at 0.
 */

import acm.program.*;

public class FibonacciSequence extends ConsoleProgram 
{
	//Runs the program.
	public void run() 
	{
		//Explains what the program does.
		println("This program calculates and prints the first 16 values in the Fibonacci sequence, starting at 0.");
		fib();		
	}
	
	//Defines the fib() method, which calculates the values in the Fib sequence.
	public void fib(int n) 
	{
		if (n <= 1)
		{
			println(n);
			println fib(n-1) + fib(n-2);
		}

		
		//Takes care of the first 2 values in the sequence (0 & 1).
		int n = 0;		
		println(n);
		println(n + 1);
			
		for (int i=1; i <= 15; i++) //Each time through the loop, calculates and prints the next Fibonnaci sequence value.
		{				
			int fib = (n-1) + (n-2);
			println("New fib: " + fib);
		}
	}
	
}