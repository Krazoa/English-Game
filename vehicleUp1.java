import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vehicleUp1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vehicleUp1 extends Objects
{
    /**
     * Act - do whatever the vehicleUp1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }   

    public void movement()
    {
        setLocation(getX(), getY() - 5);
        if(worldEdge()== true)
        {
            setLocation(47, 896);
            setLocation(getX(), getY() - 5);
        }
    }

}
