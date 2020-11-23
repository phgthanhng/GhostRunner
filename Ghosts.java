import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy class
 * 
 * @author (Reimar Rosas) 
 * @version (23-11-2020)
 */
public class Ghosts extends Actor
{
    private GreenfootImage sprite = new GreenfootImage("template.png");
    private final int defaultX = getX();
    private final int defaultY = getY();
    private SimpleTimer timer = new SimpleTimer();

    public Ghosts()
    {
        setImage(sprite);
    }

    /**
     * Act - do whatever the Ghosts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        if (MainCharacter.isPoweredUp)
        {
            destructible();
        }
    }    

    private void movement()
    {

    }

    private void destructible()
    {
        if (getOneIntersectingObject(Bomb.class) != null)
        {
            timer.mark();
            setImage("BLANK_ICON.png");
            setLocation(0, 0);
            if (timer.millisElapsed() == 5000)
            {
                respawn();
                getWorld().removeObject(this);
            }
        }
    }

    private void respawn()
    {
        getWorld().addObject(new Ghosts(), defaultX, defaultY);
    }
}
