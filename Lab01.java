import edu.fcps.karel2.Robot;

public class Lab01
{
  public Lab01() {}
  
  public static void main(String[] args)
  {
    edu.fcps.karel2.Display.openWorld("maps/school.map");
    edu.fcps.karel2.Display.setSize(10, 10);
    edu.fcps.karel2.Display.setSpeed(5);
    
    Robot lisa = new Robot();
    Robot pete = new Robot(4, 5, 3, 0);
    
    lisa.move();
    lisa.move();
    lisa.turnLeft();
    lisa.move();
    lisa.turnLeft();
    lisa.move();
    lisa.pickBeeper();
    lisa.turnLeft();
    lisa.turnLeft();
    lisa.move();
    lisa.turnLeft();
    lisa.turnLeft();
    lisa.turnLeft();
    lisa.move();
    lisa.turnLeft();
    lisa.move();
    lisa.move();
    lisa.move();
    lisa.turnLeft();
    lisa.move();
    lisa.move();
    lisa.move();
    lisa.turnLeft();
    lisa.move();
    lisa.move();
    lisa.putBeeper();
    lisa.turnLeft();
    lisa.turnLeft();
    lisa.turnLeft();
    lisa.move();
    
    pete.move();
    pete.pickBeeper();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.turnLeft();
    pete.turnLeft();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.turnLeft();
    pete.move();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.turnLeft();
    pete.turnLeft();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.turnLeft();
    pete.move();
    pete.move();
    pete.putBeeper();
    pete.turnLeft();
    pete.turnLeft();
    pete.move();
  }
}