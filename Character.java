import greenfoot.*;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Objects
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Control();
    }    
    public void Control()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            move(2);
            setRotation(270);
        }
         if (Greenfoot.isKeyDown("Down"))
        {
            move(2);
            setRotation(90);
        }
         if (Greenfoot.isKeyDown("Left"))
        {
            move(2);
            turn(4);
        }
         if (Greenfoot.isKeyDown("Right"))
        {
            move(2);
            turn(-4);
        }
    }
}

