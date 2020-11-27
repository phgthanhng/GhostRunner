import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Selector Class for selecting a menu option
 * set the 
 * 
 * @author (Reimar Rosas) 
 * @version (19-11-2020)
 */
public class Selector extends Actor
{
    private int select1[] = {0, 0};
    private int select2[] = {0, 0};
    
    private GreenfootImage sprite = new GreenfootImage("Selector.png");
    
    /**
     * Selector - Constructor that sets the coordinate for the two
     * menu options to select and sets the sprite of the Actor
     */
    public Selector(int select1X, int select1Y,
                    int select2X, int select2Y)
    {
        // sets the sprite for the selector
        setImage(sprite);
        
        // set the coordinates for the first option
        select1[0] = select1X;
        select1[1] = select1Y;
        
        //set the coordinates for the second option
        select2[0] = select2X;
        select2[1] = select2Y;
        
        // sets the initial location to the first option of the UI
        //setLocation(select1[0], select1[1]);
    }
    
    /**
     * getSelect1() method
     * returns an array of the coordinates specified as select1
     *  => select1[0] = X-coordinate, select1[1] = Y-coordinate if you set the return value
     *  of getSelect1 to an array int[] select1
     */
    public int[] getSelect1()
    {
        return select1;
    }
    
    /**
     * getSelect2() method
     * returns an array of the coordinates specified as select2
     *  => select2[0] = X-coordinate, select2[1] = Y-coordinate if you set the return value
     *  of getSelect2 to an array int[] select2
     */
    public int[] getSelect2()
    {
        return select2;
    }
    
    /**
     * act() method
     * implements the movement of the Selector object
     *  => on default, moves to the specified right and left coordinate,
     *  can be changed to up and down if needed
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(select1[0], select1[1]);
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setLocation(select2[0], select2[1]);
        }
    }    
}
