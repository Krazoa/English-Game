import greenfoot.*;

/**
 * Write a description of class Objects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objects extends Actor
{
    /**
     * Act - do whatever the Objects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        isTouchingVert();
        isTouchingHoriz();
        worldEdge();
        touchingBrickWall();
        touchingTriggerMainDoor();
        intersectingRoad();
    }    

    public void isTouchingVert()
    {
        if(isTouching(WallVert.class) && Greenfoot.isKeyDown("Left")) //Is the character touching the wall from the right side
        {
            setLocation(getX() + 8, getY()); // Then the X pos of the object will be set 10 pixels back of its position on the wall meaning the wall appears solid
        }	
        else if (isTouching(WallVert.class) && Greenfoot.isKeyDown("Right")) // Is the character touching the wall from the left side
        {
            setLocation(getX() -8, getY()); //Then the X pos of the objectwill be set back 10 pixels from its position on the wall
        }
    }

    public void isTouchingHoriz()
    {
        //Same procedure compared to above
        if(isTouching(WallHoriz.class) && Greenfoot.isKeyDown("Up")) 
        { 
            setLocation(getX(), getY() +8); 
        }	
        else if (isTouching(WallHoriz.class) && Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() -8);
        }
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

    public void touchingBrickWall()
    {
        if(isTouching(brickWall.class) && Greenfoot.isKeyDown("Left")) //Is the character touching the wall from the right side
        {
            setLocation(getX() + 25, getY()); // Then the X pos of the object will be set 10 pixels back of its position on the wall meaning the wall appears solid
        }	
        else if (isTouching(brickWall.class) && Greenfoot.isKeyDown("Right")) // Is the character touching the wall from the left side
        {
            setLocation(getX() -25, getY()); //Then the X pos of the objectwill be set back 10 pixels from its position on the wall
        }
    }

    public boolean touchingTriggerMainDoor()
    {
        Actor mainDoor = getOneIntersectingObject(Character.class);
        Actor Character = getOneIntersectingObject(mainDoor.class);
        if(mainDoor != null || Character != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void intersectingRoad()
    {
        if(isTouching(road.class) && Greenfoot.isKeyDown("Left")) //Is the character touching the wall from the right side
        {
            setLocation(getX() + 25, getY()); // Then the X pos of the object will be set 10 pixels back of its position on the wall meaning the wall appears solid
        }	
    }

    public boolean touchingPlantTrigger()
    {
        Actor doorUnlock = getOneIntersectingObject(Character.class);
        Actor Character = getOneIntersectingObject(doorUnlock.class);
        if(doorUnlock != null || Character != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public void Control()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            move(4);
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            move(4);
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            move(4);
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            move(4);
            setRotation(0);
        }
    }
}	

