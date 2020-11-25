 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWin here.
 * 
 * @author (Danich Hang) 
 * @version (25-11-2020)
 */
public class GameWin extends World
{
    /**
     * Constructor for objects of class GameWin.
     * 
     */
    public GameWin()
      {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        displayText(); 
        prepare();
      }
    
    /**
     * press enter to activer the selctionOption() method  (replay or quit)
     */
    public void act() 
      {
        if (Greenfoot.isKeyDown("enter")) 
            selectOption(); 
      }
    
    /**
     *  have the selector object at a set location 
     */ 
    public void prepare() 
      {
        Selector selector = new Selector(200, 250, 40, 250);
        addObject(selector,144,245);
      }
    
    /**
     * print text with the pixel font 
     * and be able to get the size and location of the print
     */
    public void showTextWithPixeledFont
    (String message, boolean bold, boolean italic, int size, int x, int y)
      {
        getBackground().setFont( new Font("Pixeled",bold, italic, size));
        getBackground().setColor(Color.WHITE); // the print in white
        getBackground().drawString(message, x, y); // print the message
      }
    
    /**
     * diplay the text using (showTextWithPixeledFont()) 
     */  
    public void displayText() 
      {
        showTextWithPixeledFont("CONGRATULATION",false, false, 30, 30, 70);
        showTextWithPixeledFont("you win the game! ",false, false, 20, 200, 100);
        showTextWithPixeledFont("REPLAY",false, false, 13, 40, 250);
        showTextWithPixeledFont("QUIT",false, false, 13, 200, 250); 
      } 
    
    /**
     * select play or how to play  
     */
    public void selectOption() 
      {
        Selector selector = getObjects(Selector.class).get(0); 
        int[] select1 = selector.getSelect1(); // the position of the frist selection 
        int[] select2 = selector.getSelect2(); // the position of the second selection 
        
        if (select1[0] == selector.getX() && select1[1] == selector.getY()) 
            Greenfoot.setWorld(new SplashScreen()); // frist selection transfer to splash screen 
        if (select2[0] == selector.getX() && select2[1] == selector.getY())
            Greenfoot.setWorld(new  Level1()); // second selection transfer to level1 world
      }
}
