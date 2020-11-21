import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First level of the GhostRunner game.
 * 
 * @author (Reimar Rosas) 
 * @version (19-11-2020)
 */
public class Level1 extends World
{
    private GreenfootImage bg = new GreenfootImage("template.png");
    private GreenfootSound bgMusic = new GreenfootSound("template.wav");
    
    /**
     * Constructor for objects of class Level1
     * sets the background image and plays the background music
     */
    public Level1()
    {    
        super(13, 13, 50); 
        bgMusic.playLoop();
        setBackground(bg);
    }
    
    /**
     * transitonToGameLoseWorld() method
     * sets the world to a new GameLose instance
     *  => can be called in MainCharacter class if that object encountered
     *  a Ghosts object
     */
    public static void transitionToGameLoseWorld()
    {
        Greenfoot.setWorld(new GameLose());
    }
    
    /**
     * (static) transitionToGameWinWorld() method
     * sets the world to a new GameWin instance
     *  => can be called in MainCharacter class if that object encountered
     *  an Exit object
     */
    public static void transitionToGameWinWorld()
    {
        Greenfoot.setWorld(new GameWin());
    }
}
