import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Static here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Static extends Objects
{
    /**
     * Act - do whatever the Static wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    

    public boolean worldEdge()
    {
        if (getX() <= 5 || getX() >= getWorld() . getWidth() -5)
        {
            return true;
        }
        if (getY() <= 5 || getY() >= getWorld() . getHeight() -5) 
        {  
            return true;
        }
        else
            return false;
    }
}
