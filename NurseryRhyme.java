package Practice;
/*File: NurseryRhyme
 * This program calculates how many representatives were coming from St. Ives in the following nursery rhyme:
 * 	As I was going to St. Ives,
	I met a man with seven wives,
	Each wife had seven sacks,
	Each sack had seven cats,
	Each cat had seven kits:
	Kits, cats, sacks, and wives,
	How many were going to St. Ives?
 * Man = 1
 * Calculate # of wives (WIVES)
 * Calculate # of sacks (SACKS)
 * Calculate # of cats (CATS)
 * Calculate # of kits (KITS)
 * Add all the above together.
 */

import acm.program.*;
import acm.graphics.*;

public class NurseryRhyme extends ConsoleProgram
{
	public void run() 
	{
		// Explains what the program does.
		println("This program ????????");
				
		//Declares variable for the total value of representatives.
		int reps = 0;
		
		//The 'for' statement executes the following 2 statements for each of the 3 input values:
		//Statement 1: Asks the user to input a new multiplier and declares a variable for each multiplier input by the user.
		//Statement 2: Changes the value of the variable.
		for (int i = 0; i < 3; i++) 
		{
			int multiplier = readInt("Now try entering a new value for the multiplier in the poem, and we'll compute the new number of representatives for you.");
			println("For example, instead of 7 wives, sacks, etc., enter a new number that replaces 7.");
			reps += multiplier;			
		}
		//Displays the new total number of representatives.
		println("The number of representatives coming from St. Ives is: " + reps + ".");
	}

	
	
	
	//public void run() 
	//{
		//Declares variables for each type of representative in the poem.
		//int multiplier = 7;
		/*
		int wives = man * multiplier ;
		int sacks = wives * multiplier;
		int cats = sacks * multiplier;
		int kits = cats * multiplier;
		*/
		
		
		//Adds all of the reps together using the value of the multipler variable. OR Multiplies REPS * itself.
		//int reps = (man + wives + sacks + cats + kits);
		//int reps = 0;
		//reps *= (reps + 1);
		
		//Displays the nursery rhyme and 
		//println("How many representatives are coming from St. Ives in the following nursery rhyme?");
		//println();
		//println("	As I was going to St. Ives,\r\n" + 
			//	"	I met a man with seven wives,\r\n" + 
				//"	Each wife had seven sacks,\r\n" + 
				//"	Each sack had seven cats,\r\n" + 
				//"	Each cat had seven kits:\r\n" + 
				//"	Kits, cats, sacks, and wives,\r\n" + 
				//"	How many were going to St. Ives?");
		//println();
		
		//Allows the user to enter a number for their guess of how many reps are coming from St. Ives, then displays a response based on whether what the user entered was correct or incorrect.
		//println("Type a guess below and press Enter.");
		//int user_guess = readInt("How many representatives are coming from St. Ives? ");
			//if (reps == 2801) 
			//{
				//println("Correct!");
			//} else 
			//{
				//println("Oops, that's incorrect."); //NOT WORKING
			//}
			
		//Declares variable for acknowledging the user's input answer.		
		//println();
		//println("Now try entering a new value for the multiplier in the poem, and we'll compute the new number of representatives for you.");
		//println("For example, instead of 7 wives, sacks, etc., enter a new number that replaces 7.");
		
		//The 'for' statement executes the following 2 statements for each time the user enters a new multipler value:
		//Statement 1: Asks the user to input an integer and declares a new value for the MULTIPLER variable.
		//Statement 2: Changes the value of the variable.
		//multiplier = readInt("New value: "); 
		
		//Adds the reps together using the new multiplier. NOT WORKING
		//reps = (man + wives + sacks + cats + kits);
		
		//Prints the new number of reps, using the new input value.
		//println("The number of representatives coming from St. Ives is: " + reps);
		

		
		//NOTE: I want to eventually make a loop out of this so that the user can input several different multipliers. 
		//Maybe use a for statement.
	//}
	
	private static final int man = 1;
	
}
