package Practice;
/*File: Interest1.java
 * This program calculates an account balance based on the annual interest rate.
 * Write a program that reads in two numbers: an account balance and an annual
interest rate expressed as a percentage. Your program should then display the new
balance after a year. There are no deposits or withdrawals—just the interest payment.
 */

import acm.program.*;
import java.awt.*;

/*Calculates the account balance after one year of paying interest payments with the specified (by user) interest rate.
 * Interest rate is determined by programming the following: 
 * 1. Convert INT_RATE to percent: 
 * 		INT_RATE_PERCENT = INT_RATE \ 100
 * 2. Calculate the interest payment for year 1: Multiply INT_RATE_PERCENT times BALANCE.
 * 		INT_PAYMENT = BALANCE * INT_RATE_PERCENT
 * 3. Calculate the Y1 balance by adding the interest payment to the balance: 
 * 		BALANCE_Y1 = BALANCE + INT_PAYMENT
 * 4. Calculate the interest payment for year 2: Mutlipy INT_RATE_PERCENT times BALANCE_Y1.
 * 		INT_PAYMENT = INT_RATE_PERCENT * BALANCE_Y1
 * 5. Calculate the Y2 balance by adding the Y2 interest payment to BALANCE_Y1
 * 		BALANCE_Y2 = BALANCE_Y1 + INT_PAYMENT
 */
public class Interest1 extends ConsoleProgram
{
	public void run() 
	{
		println("Interest Calculation Program");
		double balance = readDouble("Enter starting balance: $");
		double int_rate = readDouble("Enter annual interest rate: ");
		//Convert interest rate to percent.
		double int_rate_percent = int_rate / 100;
		//Calculate the year1 interest payment:
		double int_payment = int_rate_percent * balance;
		//Calculate year1 balance
		double balance_y1 = balance + int_payment;
		//Calculate the year2 interest payment.
		int_payment = int_rate_percent * balance_y1;
		//Calculate the year2 balance.
		double balance_y2 = balance_y1 + int_payment;
		println("Balance after one year: $" + balance_y1);
		println("Balance after two years: $" + balance_y2);
	}
}
