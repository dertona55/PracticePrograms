package Practice;
/*File name: CountdownForLoop.java
 * 
 * This program counts down from 10 to 0.
 */

import acm.program.*;

public class CountdownForLoop extends ConsoleProgram
{
	//Defines a named constant for the value from which to start the countdown.
	public static final int start = 15;

	//Runs the program.
	public void run() 
	{
		//Explains what the program does.
		println("This program counts down from 10 to 0.");
		
		//Counts backward from 10 to 0, and print each number as it counts down.
		for (int i = start; i >= 0; i--) 
		{
			println(i);
			
		}
		println("Liftoff!"); //Prints "Liftoff!"
	}
}