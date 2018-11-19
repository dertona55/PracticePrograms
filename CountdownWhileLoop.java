package Practice;
/*Filename: CountdownWhileLoop.java
 * 
 * This program counts backwards from START to 0.
 * 
 */

import acm.program.*;

public class CountdownWhileLoop extends ConsoleProgram
{
	//Defines the value from which to start the countdown.
	public static final int start = 10;
	public void run()
	{
		//Explains what the program does.
		println("This program counts backward from " + start + " to 0, and displays the countdown.");
		
		//Counts backward from START to 0.
		int count = start;
		while (count >= 0)
		{	println(count);
			count = count -1;			
		}		
		println("Liftoff!");
	}
}