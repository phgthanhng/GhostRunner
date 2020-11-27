import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (Phuong Thanh Nguyen) 
 * @version (26-11-2020)
 */
public class SplashScreen extends World
{ 
   private SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
   public SplashScreen()
   {
       super(800, 450, 1); 
       timer.mark();
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
     if (timer.millisElapsed() == 3000) // delay for 3 seconds then set world to a Main Menu instance
     {
        World MainMenu = new MainMenu();
        Greenfoot.setWorld(new MainMenu());
     }
   }
}
