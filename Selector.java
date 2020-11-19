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
    
    private GreenfootImage sprite = new GreenfootImage("template.png");
    
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
    }
    
    /**
     * Act - do whatever the Selector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
