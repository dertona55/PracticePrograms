package Practice;
/*File: FahrenheitToCelcius.java
 * This program converts a Fahrenheit temperature (provided by the user) to Celcius.
 * TEMP_C = 5/9(F-32)
 */

import acm.program.*;
import java.awt.*;
import java.text.DecimalFormat;

public class FahrenheitToCelcius extends ConsoleProgram 
{
	public void run() 
	{
		//Declare a variable for the Fahrenheit temperature (provided) by the user.
		double temp_f = readDouble("Enter the temperature in Fahrenheit degrees: ");
		
		//Declare variables for the parts of the conversion formula.
		double a = 5.0 / 9.0;
		double b = temp_f - 32.0;
		
		//Declare a variable for the Fahrenheit temp converted to Celcius. 
		double temp_c = a * b;	
		
		//Displays the converted Celcius temp.
		println("Celcius temperature: " + temp_c + " degrees");
		
		/*Possible way to format decimal:
		*DecimalFormat df = new DecimalFormat("###.###");
		*System.out.println(df.format(PI));
		 */

	}

}
