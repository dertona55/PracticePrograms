package Practice;

/* File: AddIntegerList.java
 * 
 * This program reads integers one per line until the user enters a special sentinel value to signal the end of the input. 
 * At that point, the program prints out the sum of the numbers entered so far.
 */

import acm.program.*;

public class AddIntegerList extends ConsoleProgram
{
	//Defines the value of the sentinel.
	private static final int SENTINEL = -1;
	
	//Runs the program:
	public void run() 
	{
		println("This program adds a list of numbers.");
		println("Enter the numbers, one per line. When you are finished entering numbers, enter " + SENTINEL + " to indicate you are done."
				+ "The total will not include the number, -1.");
		int total = 0;
		while (true) 
		{
			int value = readInt("Enter a number: ");
			if (value == SENTINEL) break;
			total += value;
		}
		println("The total is " + total + ".");
	}
}
