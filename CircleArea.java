package Practice;

/*File: CircleArea.java
 * This program calculates the area of a circle given the radius by the user.
 * CIRCLE_AREA = PIr2
 */

import acm.program.*;
import java.awt.*;

public class CircleArea extends ConsoleProgram
{
	public void run() 
	{
		//Declares a variable for the radius of a circle, while asking the user to input the radius.
		double r = readDouble("Circle radius: ");
		
		//Declares a variable for the formula for a circle's area.
		double circle_area = pi * (r*r);
		
		//Displays the area of the circle.
		println("Cirle area: " + circle_area);
	}

	//Defines a named constant for the value of pi.
	private static final double pi = 3.14;
}
