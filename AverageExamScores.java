package Practice;
/*File: AverageExamScores.java
 * The Art and Science of Java, PE 4.6: This program reads in a list of exam scores (as integers), lets the user indicate when he/she is done entering scores,
 *  and then prints the average of those scores. 
 *  
 * Program steps:
 * Print program description. ***
 * Read in and print a list of exam scores. (SCORE) ***
 * 		Declare a variable, SCORE. ***
 * 		Maintain a running total for the scores. (TOTAL += SCORE) ***
 * 			Declare a variable, TOTAL. ***
 * 			Declare a sentinel, SENTINEL (in the class). ***
 * Let user indicate when all scores have been entered. (read-until-sentinel) ***
 * 		Use a while statement. ***
 * Compute the average of all scores. (AVERAGE) ***
 * 		Count how many scores were entered.		 ***
 * 			Declare the variable, COUNT. ***
 * 			Use count++ ***
 * 		Declare the variable, AVERAGE.
 * Print the average.
 */

import acm.program.*;

public class AverageExamScores extends ConsoleProgram 
{
	public static final int SENTINEL = -1; //Allows user to indicate when he/she is done entering scores.
	
	//Runs the program.
	public void run() 
	{
		println("This program reads in a list of exam scores (as integers) and prints the average of those scores."); //Explains what the program does.
		println();
		println("Enter an exam score and press enter. When you are done entering scores, enter " + SENTINEL + " to compute the average of the scores.");
		println();
		
		double score; //Declares a variable for the scores.
		int count = 0;
		double total = 0; //Declares variable for the total of the scores entered.
		while ((score = readDouble("Score: ")) != SENTINEL)  //Reads in an exam score from the user and prints it.
		{		
			total += score; //Maintains a running total of the scores entered.		
			count++;			
		}
		
		//Computes the average of all all exam scores entered.
		double average = total / count; 
		
		//Prints the average.
		println(average);
	}
}
