import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FOV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FOV extends Objects
{
    int CharX;
    int CharY;
    /**
     * Act - do whatever the FOV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getPlayerPos();
        // setToPlayerPos();
        setLocation(CharX, CharY);
    }    
    public void getPlayerPos()
    {
        World world;
        world = getWorld();
        Object obj = world.getObjects(Character.class).get(0);
        Character Character = (Character) obj;
        CharX = Character.getX();
        CharY = Character.getY();
        
    }
    public void setToPlayerPos()
    {
        World world;
        world = getWorld();
        Object FOV = world.getObjects(FOV.class).get(1);
        // FOV.setLocation(CharX,CharY);
        // fov.setLocation(773,741);
    }
    public void setLocation(int x, int y) {  
       if (Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("Right"))
       {
        Actor actor = getOneIntersectingObject(Character.class);
        // if (actor != null) {  
            // actor.setLocation(actor.getX() + (x - getX()), actor.getY() + (y - getY()));
        // }  
        super.setLocation(CharX, CharY);
       }
    } 
}
