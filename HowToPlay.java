import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HowToPlay class that shows the controls and tips on how to play the game
 * 
 * @author (Reimar Rosas) 
 * @version (19-11-2020)
 */
public class HowToPlay extends World
{
    private GreenfootImage bg = new GreenfootImage("how_to_play_650x650.png");
    private GreenfootSound bgMusic = new GreenfootSound("template.wav");

    /**
     * Constructor for objects of class HowToPlay
     * Sets the background image and plays the background music at object creation
     * 
     */
    public HowToPlay()
    {    
        super(650, 650, 1); 
        bgMusic.playLoop();
        setBackground(bg);
    }
    
    /**
     * act() method 
     * Calls transitionToMainMenu() method
     */
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
        if (Greenfoot.isKeyDown("escape"))
        {
            bgMusic.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
