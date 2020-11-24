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
        showTextWithPixeledFont("GHOST RUNNER", 50, 50, 150); 
    }
    
    /**
 * 
 */
public void showTextWithPixeledFont(String message, int size, int x, int y)
{
    getBackground().setFont( new  Font("Pixeled",size));
    getBackground().setColor(Color.WHITE);
    getBackground().drawString(message, x, y);
}

}
