import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First level of the GhostRunner game.
 * 
 * @author (Reimar Rosas) 
 * @version (19-11-2020)
 */
public class Level1 extends World
{
    GreenfootSound bgMusic = new GreenfootSound("template.wav");
    
    /**
     * Constructor for objects of class Level1.
     */
    public Level1()
    {    
        super(13, 13, 50); 
        bgMusic.playLoop();
    }
    
    public void act()
    {
        transitionToAnotherWorld();
    }
    
    /**
     * transitionToAnotherWorld - transitions to one of the end results:
     * Win or Lose
     * ------------------------------------------------------------------
     * Remove the character object from the current world so this method
     * would run
     */
    public void transitionToAnotherWorld()
    {        
        MainCharacter mc = getObjects(MainCharacter.class).get(0);
        Exit exit = getObjects(Exit.class).get(0);
        
        if (mc == null)
        {
            bgMusic.stop();
            Greenfoot.setWorld(new GameLose());
        }
        else if (mc.getX() == exit.getX() && mc.getY() == exit.getY())
        {
            bgMusic.stop();
            Greenfoot.setWorld(new GameWin());
        }
    }
}
