import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import java.lang.Math; 

public class KarelBlocker extends Robot
{
   public KarelBlocker(int x)
   {
      super(10,x,Display.WEST,0);
   }
   public void collision(KarelBlocker a)
   {
      if(a.nextToARobot())
         a.explode();
   }
}