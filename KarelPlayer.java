import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class KarelPlayer extends Robot
{
   public KarelPlayer()
   {
      super(2,1,Display.EAST,0);
   }
   public void collision(KarelPlayer a)
   {
      if(a.nextToARobot())
         a.explode();
   }
}
