package Practice;
/*
 * This program draws a checkerboard with checkers in their start positions (as in a game).
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GraphicsCheckerboard2 extends GraphicsProgram
{
	//Defines variables that need to be used in multiple methods.
	int rect_width = 75;
	int rect_height = 75;
	int rect_x = 50;
	int rect_y = 50;


	
	
	//Runs the program
	public void run()
	{
		showIntro();
		drawCheckerboard();	
		drawCheckers();
	}
	
	//Define showIntro(): Print the title and description of the program.
	private void showIntro()
	{
		GLabel title = new GLabel("Checkerboard", 275, 30); //Create new GLabel object (title).
		Font title_font = new Font("Calibri", Font.BOLD, 32); //Create new font
		title.setFont(title_font); //Set font for title
		add(title);
	}
	
	//Define drawCheckerboard(): Print the checkerboard and checkers.
	private void drawCheckerboard()
	{
		int max_rows = 1; //Define variable for the maximum number of rows.
		{
			while (max_rows <= 8)
			{
				drawRectangles();
				repositionForNextRow();
				max_rows++;
			}

		}
	}
	
	//Define drawRectangles(): Print the checker spaces (rectangles) for 8 rows.
	private void drawRectangles()
	{
		for (int i = 1; i <= 8; i++)
		{
			GRect rectangle = new GRect(rect_x, rect_y, rect_width, rect_height);
			add(rectangle);
			rect_x = rect_x + rect_width;
		}
	}
	

	//Define repositionForNextRow(): Define the start position of the rectangle for the next row.
	private void repositionForNextRow()
	{
		rect_y = rect_y + rect_height;
		if (rect_x > rect_width) {
			rect_x = 50;
		}
	}
	
	//Define drawCheckers(): Print the checkers (circles) for all rows.
	private void drawCheckers()
	{
		int max_rows = 1; //Define variable for the maximum number of rows.
		{
			while (max_rows <= 8)
			{
				drawOvals();
				max_rows++;
			}

		}
	}
	
	//Define drawOvals(): Print the checker (ovals) for 8 rows.
	private void drawOvals()
	{
		//Define variables for the drawOvals() method.
		int oval_x = rect_width - 13;
		int oval_y = rect_width - 13;
		int oval_width = rect_width - 25;
		int oval_height = rect_height - 25;
		
		for (int i = 1; i <= 8; i++) //Draws the ovals in the rows going east.
		{
			GOval oval = new GOval(oval_x, oval_y, oval_width, oval_height);
			if (i % 2 == 0)
			{
				add(oval);
			}
			oval_x = oval_x + rect_width;
		}
		
		//Define the start position of the oval for the next row (going west).
		oval_y = oval_y + rect_height;
		if (oval_x > oval_width) 
		{
			oval_x = rect_width - 13;
		}
		
		for (int i = 1; i <= 8; i++)//Draws the ovals in the rows going west.
		{
			GOval oval = new GOval(oval_x, oval_y, oval_width, oval_height);
			if (i % 2 != 0)
			{
				add(oval);
			}
			oval_x = oval_x + rect_width;
		}
		
		//Define the start position of the oval for the next row (going east).
		oval_y = oval_y + rect_height;
		if (oval_x > oval_width) 
		{
			oval_x = rect_width - 13;
		}
	}	
}
