
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    private int gold;
    
    String playerClass;
    
    public void setPlayerClass(String c)
    {
        playerClass = c;
    }
    
    public String getPlayerClass()
    {
        return playerClass;
    }
}
