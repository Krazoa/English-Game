import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doorUnlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doorUnlock extends Collectibles
{
    /**
     * Act - do whatever the doorUnlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }

    public void move()
    {
        if(touchingPlantTrigger()== true)
        {
            setLocation(getX() + 1, getY());
        }

        World world;
        world = getWorld();

        if(touchingTriggerPad() == true)
        {
            world.removeObject(this);
        }
    }
}
