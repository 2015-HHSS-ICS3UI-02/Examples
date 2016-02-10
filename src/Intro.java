
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        
        Robot karel = 
                new Robot(kw, 3, 4, Direction.WEST);
        Robot tina = 
                new Robot(kw, 1, 3, Direction.SOUTH);
        
        new Wall(kw, 3, 4, Direction.WEST);
        new Wall(kw, 1,5, Direction.SOUTH);
        
        new Thing(kw, 2, 3);
        
        
        karel.setLabel("K");
        karel.setColor(Color.MAGENTA);
        karel.turnLeft();
        
        tina.move();
        tina.pickThing();
        tina.move();
        tina.putThing();
        tina.move();
    }
}
