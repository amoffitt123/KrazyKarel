import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab02
{
   public static void main(String[] args)
   {
   Display.openWorld("maps/maze.map");
   Display.setSize(10, 10);
   Display.setSpeed(5);
   
   Athlete john = new Athlete();
   
   john.succ();
   john.turnRight();
   john.succ();
   john.turnRight();
   john.succ();
   john.turnLeft();
   john.succ();
   john.turnLeft();
   john.succ();
   john.turnRight();
   john.succ();
   john.succ();
   john.turnRight();
   john.succ();
   john.turnLeft();
   john.succ();
   john.turnLeft();
   john.succ();
   john.succ();
   john.succ();
   john.succ();
   john.turnRight();
   john.succ();
   john.succ();  
   }
}