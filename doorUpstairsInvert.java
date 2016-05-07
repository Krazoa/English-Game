import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doorUpstairsInvert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doorUpstairsInvert extends Static
{
    /**
     * Act - do whatever the doorUpstairsInvert wants to do. This method is called whenever
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
            setLocation(getX(), getY() - 6);
        }

    }   
}
