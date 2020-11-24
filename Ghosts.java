import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghosts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghosts extends Actor
{
    /**
     * Act - do whatever the Ghosts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
<<<<<<< Updated upstream
=======
    
    /**
    * movement() method
    * 
    * Uses Depth First Search pathfinding algorithm to track the player.
    * 
    * Only activates every second: Generates the current map and stores it to "map" array,
    * calls the searchPath method in the PathFinding class using the current "map" array,
    * the current position of Ghosts object, and the integer list "path", and sets the 
    * next location to the first x and first y of the "path" list
    */
    private void movement()
    {
        timer.mark();
        
        if (timer.millisElapsed() >= 1000)
        {
            generateMap();
            PathFinding.searchPath(map, getX(), getY(), path);
            
            if (!path.isEmpty())
            {
                setLocation(path.get(path.size() - 4), path.get(path.size() - 3));
            }
        }
    }

    /**
     * destructible() method
     * 
     * Allows the Ghosts object to be destructible if the player obtains a power up.
     * 
     * If the Ghosts object intersects a Bomb object, sets the current sprite to a blank
     * image, reset the location to (0, 0), and after 5 seconds, relocate it back to the
     * default (x, y)
     */
    private void destructible()
    {
        if (getOneIntersectingObject(Bomb.class) != null)
        {
            destroyed();
        }
    }

    /**
     * destroyed() method
     * 
     * What happens if the ghosts object got destroyed.
     * 
     * starts the timer.mark() at method call, sets the currentImage to a blank png, set the location to (0, 0), 
     * after 5 seconds, sets the image to sprite field and reset to default location
     */
    private void destroyed()
    {
        timer.mark();
        setImage("BLANK_ICON.png");
        setLocation(0, 0);
        if (timer.millisElapsed() == 5000)
        {
            setImage(sprite);
            setLocation(defaultX, defaultY);
        }
    }
    
    /**
     * generateMap() method
     * 
     * Generates a 2D array representation of the current Level Instance, sets the traversable cells
     * to 0, non-traversable cells to 1, traversed cells to 2, and goal cell to 9
     */
    private void generateMap()
    {
        for (int j = 0; j < map.length; j++)
        {
            for (int i = 0; i < map[0].length; i++)
            {
                if (getWorld().getObjectsAt(j, i, Wall.class).isEmpty())
                {
                    map[j][i] = 0;
                }
                else
                {
                    map[j][i] = 1;
                }
            }
        }
        
        int goalX = getWorld().getObjects(MainCharacter.class).get(0).getX();        
        int goalY = getWorld().getObjects(MainCharacter.class).get(0).getY();

        map[goalY][goalX] = 9;
    }

>>>>>>> Stashed changes
}
