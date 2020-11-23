import java.util.List;

/**
 * PathFinding algorithm for the Ghosts class
 * Uses Depth First Search algorithm
 * 
 * @author (Reimar Rosas) 
 * @version (23-11-2020)
 */
public class PathFinding  
{
    /**
     * searchPath() method
     * 
     * Recursive method that returns true and calls itself if (x, y) is traversable and returns true
     * if (x, y) contains the goal
     */
    public static boolean searchPath(int[][] map, int x, int y, List<Integer> path)
    {
        // default value of the recursion and returns the path if goal is located
        if (map[y][x] == 9)
        {
            path.add(x);
            path.add(y);
            
            return true;
        }
        
        // returns true if path is traversable and recurses to the neighboring cells
        if (map[y][x] == 0)
        {
            map[y][x] = 2;
            
            // left neighbor
            int dx = -1;
            int dy = 0;
            if (searchPath(map, x + dx, y + dy, path))
            {
                path.add(x);
                path.add(y);
                
                return true;
            }
            
            // right neighbor
            dx = 1;
            dy = 0;            
            if (searchPath(map, x + dx, y + dy, path))
            {
                path.add(x);
                path.add(y);
                
                return true;
            }
            
            // down neighbor
            dx = 0;
            dy = -1;            
            if (searchPath(map, x + dx, y + dy, path))
            {
                path.add(x);
                path.add(y);
                
                return true;
            }
            
            // up neighbor
            dx = 0;
            dy = 1;            
            if (searchPath(map, x + dx, y + dy, path))
            {
                path.add(x);
                path.add(y);
                
                return true;
            }
        }
        
        return false; // returns false if the neighbors are non-traversable
    }
}
