import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Selector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selector extends Actor
{
    private int selectX = 0;
    private int selectY = 0;
    
    public void selectX(int selectX)
    {
        this.selectX = selectX;
    }
    
    public void selectY(int selectY)
    {
        this.selectY = selectY;
    }
    
    public int getSelectX()
    {
        return selectX;
    }
    
    public int getSelectY()
    {
        return selectY;
    }
    
    /**
     * Act - do whatever the Selector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            selectX = 0;
            selectY = 0;
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            selectX = 0;
            selectY = 0;
        }
        
        setLocation(selectX, selectY);
    }    
}
