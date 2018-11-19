package Practice;
/*File: ThisOldMan.java
 * This program displays the verses of the song, "This Old Man."
 */

/*Program steps inside run():
 * println() to tell user what the program does.
 * println song title
 * Declare the variable, i, in a for statement. (The for statement increases 'number' by 1 in each verse.)
 * In the for statement:
 * 	Declare the variable, number, as equal to i. 	
 * 	Declare the variable, word.
 * 	Write switch statement to change the rhyming word for each verse.
 * 		expression = number
 * 		each case shows a value for 'word'.
 * println() to display verses, using 'i' & 'word' variables.
 */

import acm.program.*;

public class ThisOldMan extends ConsoleProgram
{
	//Runs the program.
	public void run() 
	{
		
		println("This program displays all 10 verses of the song, 'This Old Man.'"); //Displays what the program does.
		println();
		println("'This Old Man'"); //Displays the song title
		println();
		
		for (int i = 1; i < 11; i++)   	//Declares the variable i as the number in each verse; Adds 1 to i for each verse.
		{
			int number = i; //Declares a variable for the number in the switch statement, which is the same as the variable, i.
			String word = "word"; //Declares a variable for the rhyming word in the switch statement.
			switch (number) //Defines which rhyming word to use in each verse. //If caseN equals (number), then use the value for the variable, word.
			{
				case 1:  
					word = "on my thumb";
					break;
				case 2:
					word = "on my shoe";
					break;
				case 3:
					word = "on my knee";
					break;
				case 4:
					word = "on my door";
					break;
				case 5:
					word = "on my hive";
					break;
				case 6:
					word = "with my sticks";
					break;
				case 7:
					word = "up to heaven";
					break;
				case 8:
					word = "on my plate";
					break;
				case 9:
					word = "on my spine";
					break;
				case 10:
					word = "on my shin";
					break;
			}
			println("This old man, he played " + i + ". \r\n" + //Displays each verse.
					"He played knick-knack " + word + ". \r\n" +
					"With a knick-knack, paddy-whack,\r\n" + 
					"Give your dog a bone.\r\n" + 
					"This old man came rolling home.");
			println(); //Displays a blank line.
		}
	}
}
