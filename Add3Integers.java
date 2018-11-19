package Practice;

/* File: Add3Integers.java
 * This program adds 3 integers and prints their sum. * 
 */

import acm.program.*;

public class Add3Integers extends ConsoleProgram 
{
public void run() 
{
	println("This program adds three integers.");
	int a = readInt("Enter a value for a: ");
	int b = readInt("Enter a value for b: ");
	int c = readInt("Enter a value for c: ");
	int sum = (a + b + c);
	println("The sum of a + b + c = " + sum + ".");
	}
}
