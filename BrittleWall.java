import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class BrittleWall here.
* 
* @author Phuong Thanh Nguyen
* @version (26-11-2020)
*/
public class BrittleWall extends Wall
{
    private GreenfootImage sprite = new GreenfootImage("template.png");
    private SimpleTimer timer = new SimpleTimer();

    public BrittleWall() 
    {
        setImage (sprite);
    }

    /**
    * Act - do whatever the BrittleWall wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {
        breaking();
    }    

    /**
     * If a bomb is implemented, it will destroy the brittle wall only.
     */
    private void breaking()
    {
      Actor Ghosts = getOneIntersectingObject(Ghosts.class);
      if (Ghosts!= null) {
            timer.mark();
            if (timer.millisElapsed() == 1000)
            {
                isLucky();
            }
        }
    }
    
    /**
     * If the wall is breakable, then a power up will appear.
     */
    private void isLucky()
    {
        int chance = Greenfoot.getRandomNumber(10);
        if (chance == 10)
        {
            World world = getWorld();
            world.removeObject(this);
            getWorld().addObject(new PowerUp(), getX(), getY());
        }
    }
}
