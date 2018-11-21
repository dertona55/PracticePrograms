package Practice;
/*File name: Practice.java
 * 
 * This program is for testing code before using it in another program.
 * 
 */

import acm.graphics.*;
import acm.program.*;

public class Practice extends GraphicsProgram
{
	public void run() 
	{
        int width = 30;
        int height = 30;
        int x = 0;
        int y = 0;
        int z = 1;      
        while ( z <= 4)
        {
           for ( int i = 1; i <= 8; i++)
           {
               if (  i % 2 == 0)
               {
                  add(new GOval (x +5, y+5, 20, 20));
               }
                  add(new GRect( x, y, width, height));
                     x+=width;
           }
                y+=height; 
           for ( int i = 1; i <= 8; i++)
           {
                  x-=width;;
              if (  i % 2 == 0)
              {
                  add(new GOval ( x+5, y+5, 20, 20));
              }
                  add(new GRect( x, y, width, height));
           }
               y+=height;
               z++;   
        }
	}

}


