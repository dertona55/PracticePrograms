package Practice;

/*File: InchesToCentimeters.java
 * This program converts feet and inches to centimeters.
 */

import java.awt.*;
import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram
{		
	public void run() 
	{
		println("This program converts inches to centimeters.");
		double inches_n = readDouble("Enter the number of inches to convert: ");
		double cm = inches_n * cm_per_in;
		println(inches_n + "inches = " + cm + "centimeters.");
	}
private static final double cm_per_in = 2.54;
}