import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Fire here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Fire extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
    * Act - do whatever the Fire wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {
       destroyed();
    } 
 
    /**
     * To destroy the fire after 2 seconds.
     */
    public void destroyed()
    {
        timer.mark();
        if (timer.millisElapsed() == 2000)
           {
               World world = getWorld();
               world.removeObject(this);
            }    
    }
}
