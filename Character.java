import greenfoot.*;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Objects
{
    int  mainDoorKey = 0;
    int Notebook_Status = 0;
    int Notebook_Open = 0;
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Control();
        Notepad();
        IntersectWallVert();
        IntersectWallHoriz();
        collectKey();
        mainDoor();
        intersectBrickWall();
        intersectRoad();
        touchingPlant();
        openUpstairsDoor();
    }  
    public void Notepad()
    {
        //reinsert all this in movement
        if(Greenfoot.isKeyDown("q") && Notebook_Open == 0)
        {
            Notebook_Open = 1;
            if(Notebook_Status == 0)
            {
                Notebook_Status = 1;
            }
            if(Notebook_Status == 1)
            {
                Notebook_Status = 2;
            }
            if(Notebook_Status == 2)
            {
                Notebook_Status = 3;
            }
            if(Notebook_Status == 3)
            {
                Notebook_Status = 4;
            }
            if(Notebook_Status == 4)
            {
                Notebook_Status = 5;
            }
            if(Notebook_Status == 5)
            {
                
            }
        }
        if(Greenfoot.isKeyDown("w") && Notebook_Open == 1)
        {
            Notebook_Open = 0;
            if(Notebook_Status == 0)
            {
                //remove notepad here
            }
            if(Notebook_Status == 1)
            {
                
            }
            if(Notebook_Status == 2)
            {

            }
            if(Notebook_Status == 3)
            {

            }
            if(Notebook_Status == 4)
            {

            }
            if(Notebook_Status == 5)
            {
                
            }
        }
    }
    public void IntersectWallVert()
    {
        Actor Character = getOneIntersectingObject(WallVert.class);

        if(Character != null)
        {
            isTouchingVert();
        }
    }

    public void IntersectWallHoriz()
    {
        Actor Character = getOneIntersectingObject(WallHoriz.class);

        if(Character != null)
        {
            isTouchingHoriz();
        }
    }

    public void intersectRoad()
    {
        Actor Character = getOneIntersectingObject(road.class);

        if(Character != null)
        {
            intersectingRoad();
        }
    }

    public void collectKey()
    {
        Actor key;
        key= getOneObjectAtOffset(0, 0, keyMainDoor.class);

        if(key != null)
        {
            World world;
            world = getWorld();
            world.removeObject(key);
            mainDoorKey +=1; //Complete the varible which will open the door
            Greenfoot.playSound("coin.wav");
        }
    }

    public void mainDoor()
    {
        World world;
        world = getWorld();
        if(mainDoorKey <=0 && touchingTriggerMainDoor())
        {
            world.showText("To open your notepad, press 'Q' and 'W' to close it. Your notes and objectives will be shown here.", 750, 20);
            setLocation(getX() , getY() + 20);
            // Greenfoot.playSound("error.wav");
        }

        if(touchingTriggerMainDoor()== true)
        {
            world.showText(" ", 750, 20);
        }
    }

    public void intersectBrickWall()
    {
        touchingBrickWall();
    }

    public void touchingPlant()
    {
        if(touchingPlantTrigger()==true)
        {
            setLocation(getX() - 3, getY()); 
        }
    }

    public void openUpstairsDoor()
    {
        World world;
        world = getWorld();

        if(world.getObjects(doorUnlock.class).isEmpty() == false && isTouching(doorUpstairs.class))
        {
            setLocation(getX() + 10, getY());
            // Greenfoot.playSound("error.wav");
        }
    }
    
}

