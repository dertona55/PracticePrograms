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

public class KilosToLbsAndOz extends ConsoleProgram{
	public void run() 
	{
		println("This program converts a metric weight in kilograms to a English weight in pounds and an English weight in ounces.");
		//Request user to enter a weight in kg.
		double weight_kg = readDouble("Enter the weight in kilograms: ");
		
		//Declare a variable for converting WEIGHT_KG to lb (WEIGHT_LB = (WEIGHT_KG * 2.2)
		double weight_lb = weight_kg * 2.2;
		println("Weight in pounds: " + weight_lb + "lb");
		
		//Declare a variable for converting WEIGHT_LB to oz (WEIGHT_OZ = (WEIGHT_LB * 16)
		double weight_oz = weight_lb * 16;
		println("Weight in ounces: " + weight_oz + "oz");
		
		
	}

}
