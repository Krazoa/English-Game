import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doorUpstairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doorUpstairs extends Static
{
    /**
     * Act - do whatever the doorUpstairs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDoor();
    } 

    public void moveDoor()
    {
        World world;
        world = getWorld();

        if(world.getObjects(doorUnlock.class).isEmpty() && isTouching(Character.class))
        {
            setLocation(getX() - 6, getY());
        }

    }
}
