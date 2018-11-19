package Practice;

/*File: Snowman.java
 * This program displays a snowman.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.color.*;
import java.awt.*;

public class Snowman  extends GraphicsProgram
{
	
	public void run() 
	{
		/*GLabel label = new GLabel("hello, world");
		* label.setFont("Helvetica-24");
		* add(label, 100, 75);
		*/
		
		
		//Creates bottom part of snowman's body. 
		//1st int moves the circle to the right.
		//2nd int moves the circle down.
		//3rd int
		//4th int
		GOval body_large = new GOval(275, 250, 40, 40);
		body_large.setSize(200, 200);
		add(body_large);
				
		//Creates middle part of snowman's body. 
		//150 moves the circle to the right.
		GOval body_medium = new GOval(300, 100, 40, 40);
		body_medium.setSize(150, 150);
		add(body_medium);
	
		
		//Creates the snowman's head. 
		//200 moves the circle to the right.
		GOval head = new GOval(338, 25, 40, 40);
		head.setSize(75, 75);
		add(head);
		
		//Declares new variables for the size of the eyes, since this size will be used for both eyes.
		int eye_size = 17;
		
		//Declares new variable for eye's y-position.
		int eye_y_pos = 40; 
		
		//Creates the snowman's eyes.
		GOval eye1 = new GOval(350, eye_y_pos, 0, 0);
		GOval eye2 = new GOval(385, eye_y_pos, 0, 0);
		eye1.setColor(Color.blue);
		eye2.setColor(Color.blue);
		eye1.setSize(eye_size, eye_size);
		eye2.setSize(eye_size,  eye_size);
		add(eye1);
		add(eye2);
		
		//Declares new variables for the size of the buttons.
		int button_size = 15;
		
		//Declares new variable for the buttons' x position.
		int button_x_pos = 368;
		
		//Declares new variable for the buttons' y position, to help with centering.
		int button_y_pos = 165;
		
		//Creates new objects for the snowman's buttons.
		GRect button1 = new GRect(button_x_pos, (button_y_pos + 30), 0, 0);
		GRect button2 = new GRect(button_x_pos, button_y_pos, 0, 0);
		GRect button3 = new GRect(button_x_pos, (button_y_pos - 30), 0, 0);
		button1.setSize(button_size, button_size);
		button2.setSize(button_size, button_size);
		button3.setSize(button_size, button_size);
		button1.setColor(Color.magenta);
		button2.setColor(Color.magenta);
		button3.setColor(Color.magenta);
		add(button1);
		add(button2);
		add(button3);
		
		//Creates new object for the snowman's mouth.
		GOval mouth = new GOval(button_x_pos, eye_y_pos + 40, 0, 0);
		mouth.setSize(button_size, button_size);
		add(mouth);
		
		//Create new object for the snowman's nose.
		GLabel nose = new GLabel("V", button_x_pos + 6, eye_y_pos + 30);
		add(nose);
		
		
		

		
	}
}
