package Practice;

/*File: AddNOddIntegers.java
 * This program reads in a positive integer N and then calculates and prints the sum of the first N odd integers.
 *  For example, if N is 4, your program should display the value 16, which is 1 + 3 + 5 + 7.
 */

/*Program steps:
 * Print program description.
 * Read in and print N (number of times through the loop).
 * Repeat N times with a while loop:
 * 	Start at 1 (i)
 * 	Is i an odd number?
 * 		If true:
 * 			Print (DELETE LATER)
 * 			Add i to running total (RT = i + RT)
 * 	Go to next number
 * 			i = i + 2
 * 	Count iterations through the loop until you reach N. COUNT++
 * Print the RT.
 */


import acm.program.*;

public class AddNOddIntegers extends ConsoleProgram 
{
	//Declare variables.
	int i = 1; //Odd numbers to add together, starting with 1.
	int runTotal = 0; //Running total of N odd numbers. 
	int count = 0; //Counts the number of iterations through the loop.
	
	//Runs the program.
	public void run() 
	{
		//Prints program description.
		println("This program reads in a positive integer N and then calculates and prints the sum of the first N odd integers.");
		println("For example, if N is 4, 16 is displayed, which is the sum of 1 + 3 + 5 + 7.");
		
		//Reads in n from the user.
		int n = readInt("Enter a positive integer and press Enter: ");
		
		while (count < n) 
		{
			runTotal += i;
			i += 2;
			count++;
		}
		//Prints the sum of n odd integers.
		println("The sum of the first " + n + " odd integers is " + runTotal + ".");
	}	
}
