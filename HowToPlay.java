import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HowToPlay class that shows the controls and tips on how to play the game
 * 
 * @author (Reimar Rosas) 
 * @version (19-11-2020)
 */
public class HowToPlay extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("template.wav");

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        super(650, 650, 1); 
        bgMusic.playLoop();
    }
    
    private void transitionToMainMenu()
    {
        if (Greenfoot.isKeyDown("escape"))
        {
            bgMusic.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
