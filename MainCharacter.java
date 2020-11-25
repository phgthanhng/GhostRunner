

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacter extends Actor
{
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveAround(); 
       addBomb(); 
       touchGhost(); 
    }    
    
    /**
     * to move character 
     */
    public void moveAround() 
    {
      int dx = 0; 
      int dy = 0; 
      if (Greenfoot.isKeyDown("up"))
        dy--;         // substract one to y when the character is move up 
      if (Greenfoot.isKeyDown("down"))
        dy++;         // add one to y when the character is move down 
      if (Greenfoot.isKeyDown("left"))
        dx--;         // substract one to x when the character is move letf 
      if (Greenfoot.isKeyDown("right"))
        dx++;         // add one to x when the character is move right
      if ( dx != 0 || dy != 0)
        setLocation(getX() + dx, getY() + dy); // location depend on the + and - on X Y
      if (isTouching(UnbreakableWall.class) && isTouching(BrittleWall.class))
        setLocation(getX() - dx, getY() - dy); // not move the character when touch the walls   
    }
    
    /**
     * add a bomb everytime we press space
     */
    public void addBomb() 
    {
        if (Greenfoot.isKeyDown("space"))
            getWorld().addObject(new Bomb(), getX(), getY()); 
            //add a bomb at the place they press space 
    }
    
    /**
     * remove the main character when touch the ghost 
     * this would also means is game over 
     */
    public void touchGhost() 
    { 
        if (getOneIntersectingObject(Ghosts.class) != null)
           Level1.transitionToGameLoseWorld();  
           // transfer to game lose would when the main character thouch the ghost
    }
    
    /**
     * when character arrive to exit = win
     */
    public void touchExit() 
    {
        if (getOneIntersectingObject(Exit.class) != null)
            Level1.transitionToGameWinWorld(); 
    }
    
    /**
     * 
     */
    public boolean isPowerdUp () {
         return getOneIntersectingObject(PowerUp.class) != null;
    }
}
