import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    private GreenfootImage bg = new GreenfootImage("template.png");
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 10x10 cells with a cell size of 50x50 pixels.
        super(600, 400, 1); 
    }
    
    public void act() 
    {
        transitionToMainMenu();
    }
    
    /**
     * transitionToMainMenu() method
     * Listens for a key press, if escape key is pressed, stops the music and sets the world to a 
     * new MainMenu class instance
     */
    private void transitionToMainMenu()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            timer.mark();
            if (timer.millisElapsed() == 3000) // delay for 3 seconds then set world to a Main Menu instance
            {
                 Greenfoot.setWorld(new MainMenu());
            }
        }
    }
}
