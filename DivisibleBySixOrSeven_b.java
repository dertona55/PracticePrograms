package Practice;
/*File: DivisibleBySixOrSeven_b.java
 * From The Art and Science of Java, Chapter 4, PE 5, p.96):
 * This program displays the integers between 1 and 100 that are divisible by
either 6 or 7, but exclues integers that are divisible by both 6 and 7.
 */

/*Program steps:
 * Display program description.
 * Set criteria for program to look only at numbers between 1 and 100: Write a for loop that looks at number from 1-100.
 * 		Determine if each number is divisible by 6 but not by 7 (if statement).
 * 			If true, display number.
 * 			If false, do nothing.
 * 		Determine if each number is divisible by 7 but not by 6 (if statement).
 * 			If true, display number.
 * 			If false, do nothing.
 */

import acm.program.*;

public class DivisibleBySixOrSeven_b extends ConsoleProgram 
{
	//runs the program
	public void run() 
	{
		//Explains what the program does.
		println("This program displays the integers, between 1 and 100, that are divisible by either 6 or 7, but not both.");
		
		//Determines which numbers between 1 and 100 are divisible by 6 and not 7.
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 6 == 0) 
			{
				if (i % 7 != 0) 
				{
					println(i);
				}
			} 
			if (i % 7 == 0) 
			{
				if (i % 6 != 0) 
				{
					println(i);
				}
			} 

		}
		
		//WHY DOESN'T THIS WORK? IT SEEMS TO ME IT MEANS THE SAME THING AS THE CODE THAT WORKS. Determines which numbers between 1 and 100 are divisible by 6 and not 7.
		/*		for (int i = 1; i <= 100; i++) 
		{
			if ((i % 6 == 0) && (i % 7 != 0));
			{
				println(i);
			}
			if (i % 7 == 0 && i % 6 != 0) 
			{
				println(i);
			}
			
		} 
		 */

	}
}
