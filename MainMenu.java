import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (Danich Hang) 
 * @version (25-11-2020)
 */
public class MainMenu extends World
{
    /**
      * Constructor for objects of class MainMenu.
      * 
      */
    public MainMenu()
      {    
                // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(600, 400, 1);
        displayText();
        prepare();
        act();
      }
      
     /**
      * press enter to activer the selctionOption() method (play or how to play)
      */
    public void act() 
      {
        if (Greenfoot.isKeyDown("enter"))
        selectOption();
      }
        
    /**
     * have the selector object at a set location 
     */
    public void prepare() 
      {
        Selector selector = new Selector(430, 230, 60, 230);
        addObject(selector,309,231);
      }
    
    /**
      * 
      */
    public void showTextWithPixeledFont
    (String message, boolean bold, boolean italic, int size, int x, int y)
      {
        getBackground().setFont( new Font("Pixeled",bold, italic, size));
        getBackground().setColor(Color.WHITE);
        getBackground().drawString(message, x, y);
      }
    
    /**
     * print text with the pixel font 
     * and be able to get the size and location of the print
     */
    public void displayText() 
       {
         showTextWithPixeledFont("GHOST RUNNER !",false, true, 35, 80, 350);
         showTextWithPixeledFont("HOW TO PLAY!",false, false, 13, 60, 230);
         showTextWithPixeledFont("LET PLAY!",false, false, 13, 430, 230);
       } 
       
    /**
     * select play or how to play
     */
    public void selectOption() 
      {
        Selector selector = getObjects(Selector.class).get(0); 
        int[] select1 = selector.getSelect1();  // the position of the frist selection 
        int[] select2 = selector.getSelect2();  // the position of the second selection
            
        if (select1[0] == selector.getX() && select1[1] == selector.getY()) 
             Greenfoot.setWorld(new Level1());  // frist selection transfer to level1 world
        if (select2[0] == selector.getX() && select2[1] == selector.getY())
             Greenfoot.setWorld(new HowToPlay());   // second selection transfer to how to play World
      }
}
