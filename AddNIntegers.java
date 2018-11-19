package Practice;
/*File: AddNIntegers.java
 * From The Art and Science of Java, Chapter 4: This program adds a predefined number of integers and then displays the sum at the end. 
 * To change the number of integers, change the definition of NVALUES.
 */

/* In the Add10Integers program, if you wanted to change the # of repetitions (10), you would have to go into the guts of the code and change both the initial message 
 * and the limit in the for loop. 
 * This program, however, allows you to easily change only the NVALUES value in the named constant.
 * 
 * However, although making the change is easy compared to Add10Integers, updating the program so that it 
 * adds a different number of integers still requires an explicit change in the program and a recompilation. 
 * 
 * Therefore, it would be better to create a more general program that can add any number of input values and where that number does not have to be specified in
advance. 
 */

import acm.program.*;

public class AddNIntegers extends ConsoleProgram 
{
	//Specifies the number of values by defining a named constant.
	private static final int NVALUES = 5;
	
	//Runs the program.
	public void run() 
	{
		println("This program adds " + NVALUES + " integers input by the user.");
		int total = 0;
		for (int i = 0; i < NVALUES; i++) 
		{
			int value = readInt("Enter an integer: ");
			total += value;
		}
		println("The total is " + total + ".");

		
	}
}
