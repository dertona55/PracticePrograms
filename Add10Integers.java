package Practice;
/*File: Add10Integers.java
 * This program adds 10 integers input by users, using a for statement and shorthand assignment operator.
 */
/* In this program, if you wanted to change the # of repetitions (10), you would have to go into the guts of the code and change both the initial message 
 * and the limit in the for loop. A better approach is to introduce a named constant, such as NVALUES. (See the AddNIntegers program.)
 * 
 */

import acm.program.*;

public class Add10Integers extends ConsoleProgram 
{
	public void run() 
	{
		println("This program adds 10 integers input you.");						
		int total = 0; //Declares variable for the total value of the 10 integers.
		
		//The 'for' statement executes the following 2 statements for each of the 10 input values:
		//Statement 1: Asks the user to input an integer and declares variable for each number input by the user.
		//Statement 2: Changes the value of the variable.
		for (int i = 0; i < 10; i++) 
		{
			int value = readInt("Enter an integer: ");
			total += value;			
		}
		println("The sum of all integers is " + total + ".");  		//Displays the sum of the 10 integers.
	}

}
