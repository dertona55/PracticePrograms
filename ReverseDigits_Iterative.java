package Practice;
/*File name: ReverseDigits_Iterative.java
 * 
 * This program reads in a positive integer that is 2 or more digits, reverses the digits, and prints the reversed number.
 * The program then allows the user to continue entering integers until he/she enters the SENTINEL.
 * 
 Program algorithm:
 
 	A) Define a named constant for SENTINEL.
 	1) Explain what the program does.
 	2) Read in an integer (2 or more digits) and print it. (NUMBER)
 	
 	B)Tell program to keep running run() until the SENTINEL is entered.
 	WHILE LOOP: 
 	while (number != SENTINEL) {WHILE LOOP 3-5)}
 	
 	WHILE LOOP: Repeat steps 4, 5, & 5 until there are no more digits (places) in NUMBER.
 	3) Isolate the last digit, which is the ones column. (lastDigit) isolateLastDig()
		• The ones place can never be divided by 10, while all other places can be.
		• Therefore: The remainder of NUMBER divided by 10 will be the ones place digit.
	(lastDigit = number % 10)

	4) Append lastDigit to REVERSE. (REVERSE) appendLastDigToReverse()
		• Multiply REVERSE (initially 0) * 10, so that the ones place (initially 0) becomes the tens place. 
		• Now we can put lastDigit in the ones place by adding lastDigit.
	REVERSE = (REVERSE * 10) + lastDigit 
	or
	REVERSE += (REVERSE * 10) + lastDigit
	
	5) Remove last digit from number.
	NUMBER = NUMBER - lastDigit   OR    NUMBER -= lastDigit
	
	6) Print the reversed number.
	7) Tell user to try again or enter SENTINEL.
	 */

import acm.program.*;

public class ReverseDigits_Iterative extends ConsoleProgram
{
	//Defines the value of SENTINEL. When SENTINEL is entered by user, the program exits the loop.
	public static final int sentinel = -1;
 
	//Runs the program:
	public void run() 
	{		
		//Defines variables for the number input by the user, the last digit of 'number,' and the reversed number.
		int lastDigit = 0;
		int reverse = 0;
		
		//1) & 2): Explains what the program does and reads in an integer from the user.
		println("This program reads in a positive integer that is 2 or more digits, reverses the digits, and prints the reversed number.");
		int number = readInt("Enter a positive integer that contains two or more digits, and then press Enter: ");
		
		//Loop for reversing number. (Methods are defined below.)	I WANT TO REPEAT THIS LOOP - HOW DO I DO IT????????
	 		while (number > 0) 
			{
				//3) Isolates the last digit (the ones place digit) in NUMBER.
				lastDigit = number % 10;	
				
				//4) & 5) Appends the last digit to the reversed number while removing it from the original number.
				reverse = (reverse * 10) + lastDigit;		
				number /= 10;
			}			
			
			println ("The original number reversed is: " + reverse + ".");
			println();
			println("Enter another integer to see its reverse, or enter " + sentinel + " to end the program.");

		
	}
}