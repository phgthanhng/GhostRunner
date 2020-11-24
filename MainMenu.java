import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 650, 1); 
    }
    
    /**
 * 
 */
public void showTextWithBigRedFont(String message, int x, int y)
{
    getBackground().setFont( new  Font(50));
    getBackground().setColor(Color.RED);
    getBackground().drawString(message, x, y);
}

}
