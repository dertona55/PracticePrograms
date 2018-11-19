package Practice;

/*File: KilosToLbsAndOz.java
 * This program converts a metric weight in kilograms to pounds and ounces.
 * 		1 kilogram = 2.2 pounds
 * 		1 pound = 16 ounces
 * 1. Request user for weight in kilograms (WEIGHT_KG).
 * 2. Declare a variable for converting WEIGHT_KG to lb and oz (WEIGHT_ENG = (WEIGHT_KG * 2)
 * 3. Declare a variable for converting LBS to OZ
 * Variables needed: 
 * 	
 */

import acm.program.*;
import java.awt.*;

/*File: AverageFourNumbers.java
 * This program computes and displays the average of four number input by the user. 	
 */

import acm.program.*;
import java.awt.*;

public class AverageFourNumbers extends ConsoleProgram
{
	public void run() 
	{
		//Declares variables for the four numbers input by users.
		double a = readDouble("a = ");
		double b = readDouble("b = ");
		double c = readDouble("c = ");
		double d = readDouble("d = ");
		
		//Declares a variable for the value of the average of four numbers.
		double average = (a + b + c + d) / 4;
		println("Average = " + average);
	}
}
