import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
