import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLose here.
 * 
 * @author (Phuong Thanh Nguyen) 
 * @version (26-11-2020)
 */
public class GameLose extends World
{

    /**
     * Constructor for objects of class GameLose.
     * 
     */
    public GameLose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
        act();
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("enter")) 
            selectOption(); 
    }
    
    public void prepare() 
    {
        Selector selector = new Selector(315,295,505,290);
        addObject(selector, 395, 310);
    }

    /**
     * select quit or retry  
     */
    public void selectOption() 
      {
        Selector selector = getObjects(Selector.class).get(0); 
        int[] select1 = selector.getSelect1(); // the position of the first selection 
        int[] select2 = selector.getSelect2(); // the position of the second selection 
        
        World MainMenu = new MainMenu();
        World Level1 = new Level1();
        if (select1[0] == selector.getX() && select1[1] == selector.getY()) 
            Greenfoot.setWorld(new MainMenu()); // frist selection transfer to main menu world 
        if (select2[0] == selector.getX() && select2[1] == selector.getY())
            Greenfoot.setWorld(new  Level1()); // second selection transfer to level1 world
      }
}
