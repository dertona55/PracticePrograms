package Practice;
/*File: DivisibleBySixOrSeven.java
 * From The Art and Science of Java, Chapter 4, PE 4, p.96):
 * This program displays the integers between 1 and 100 that are divisible by
either 6 or 7.
 */

/*Program steps:
 * Display program description.
 * Set criteria for program to look only at numbers between 1 and 100: Write a loop that looks at number from 1-100.
 * 		In that loop, determine if each number is divisible by 6 or by 7.
 * 		Show the number if it is divisible by 6 or 7.
 */

import acm.program.*;

public class DivisibleBySixOrSeven extends ConsoleProgram 
{
	//runs the program
	public void run() 
	{
		//Explains what the program does.
		println("This program displays the integers, between 1 and 100, that are divisible by either 6 or 7.");
		
		//Determines which numbers between 1 and 100 are divisible by 6 or 7, and displays those numbers.
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 6 == 0 || i % 7 == 0) 
			{
				println(i);
			}
		}
	}
}
