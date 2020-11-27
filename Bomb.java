import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Bomb here.
 * 
 * @author Phuong Thanh Nguyen 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{   
  private GreenfootImage sprite = new GreenfootImage("bomb.png");    
  private GreenfootSound soundFX = new GreenfootSound("explosion.wav");  
  private SimpleTimer timer = new SimpleTimer();
  public Bomb() 
  { 
      setImage (sprite);
  }
    
  public void act() 
  {
      generateFire();
  } 
  
  /**
   * To turn a ghost into fire if it touch a bomb. 
   */
   private void generateFire()
  {
      Actor Ghosts = getOneIntersectingObject(Ghosts.class);
      if (Ghosts!= null) {
         timer.mark();
         if (timer.millisElapsed() == 1000) // delay for 1 second then change into a blank image then change into fire.
         {
              setImage("BLANK_ICON.png");
              World world = getWorld();
              getWorld().addObject(new Fire(), getX(), getY());
         }
      }
   }
}
