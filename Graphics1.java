package Practice;
/*File: Graphics1.java
 * This program displays "I love Java" on teh screen.
 */

//Note to self when starting new project: Put .jar file in build path, and possibly import it as well into project.
/*Note: A component is an object having a graphical representation that can be displayed on the screen and that can interact with the user. 
 *Examples of components are buttons, checkboxes, and scrollbars of a typical graphical user interface.
*/ 


import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Graphics1 extends GraphicsProgram 
{
	public void run() 
	{
		//Display "I love Java on the screen.
		add(new GLabel ("I love Java"), 100, 75);
		
		
	}
}