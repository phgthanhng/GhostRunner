import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class GameWin here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class GameWin extends World
{
    private GreenfootImage bg = new GreenfootImage("template.png");
    private GreenfootSound bgMusic = new GreenfootSound("template.wav");
    /**
    * Constructor for objects of class GameWin.
    * 
    */
   public GameWin()
   {    
       /// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 650, 1);
   }
}
