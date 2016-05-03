import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainDoor extends Static
{
    /**
     * Act - do whatever the mainDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        open();
    }

    public void open()
    {
        World world;
        world = getWorld();

        if(touchingTriggerMainDoor()== true)
        {
            setLocation(getX() + 1, getY());
        }
        if(worldEdge() == true)
        {
            world.removeObject(this);
        }
    }
}
