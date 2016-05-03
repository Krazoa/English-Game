import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collectibles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collectibles extends Objects
{
    /**
     * Act - do whatever the Collectibles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public boolean touchingTriggerPad()
    {
        Actor doorUnlock = getOneObjectAtOffset(0, 0, triggerPoint.class);
        Actor triggerPoint = getOneObjectAtOffset(0, 0, doorUnlock.class);
        if(doorUnlock != null || triggerPoint != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
