import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import java.lang.Math; 

public class KarelBlocker extends Robot
{
   public KarelBlocker(int x, KarelBlocker a)
   {
      super(10,x,Display.WEST,0);
      for(int i = 0; i < 9; i++)
         a.forward(a); 
   }
   public void checkCollision(KarelBlocker a)
   {
      if(a.nextToARobot())
         a.explode();
   }
   public void forward(KarelBlocker a)
   {
      a.move();
      a.checkCollision(a);
      if(a.getX() < 1)
         a.explode();
   }
}
