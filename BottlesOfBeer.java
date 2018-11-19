package Practice;

import acm.program.*;
import java.awt.Font;
import acm.graphics.*;

public class BottlesOfBeer extends ConsoleProgram 
{	
	//Declares a variable for the song title.
	String title = "99 Bottles of Beer on the Wall";
	
	//Specifies the value from which to start counting down in the lyrics.
	private static final int START = 99;
	
	// Runs the program.
	public void run() 
	{
		displayTitle();
		displayLyrics();
		indicateFinished();
	}
	
	//Display the song title.
	private void displayTitle() 
	{	println(title);
		println();
	}
	
	//Display all verses for the song.
	private void displayLyrics() 
	{
		for (int bottles = START; (bottles > -1); bottles--) 
		{
			if (bottles > 1 || bottles == 0) 
			{
				println(bottles + " bottles of beer on the wall.");
				println(bottles + " bottles of beer.");
				println("You take one down, pass it around.");
				println(bottles + " bottles of beer on the wall.");
				println();				
			} else 
			{ 
				println(bottles + " bottle of beer on the wall.");
				println(bottles + " bottle of beer.");
				println("You take one down, pass it around.");
				println(bottles + " bottle of beer on the wall.");
				println();
			}
		}
	}
	
	//Displays text indicating the program is finished.
	private void indicateFinished() 
	{
		println("Hooray, we're done!");
	}

}