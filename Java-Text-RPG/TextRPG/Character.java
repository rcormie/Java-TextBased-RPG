
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    // instance variables
    private double maxHitPoints;
    private int level;
    private String name;
    
    // rpg stats
    private int strength;
    private int agility;
    private int wisdom;

    public void setMaxHitPoints(double h)
    {
        maxHitPoints = h;
    }
    
    public double getMaxHitPoints()
    {
        return maxHitPoints;
    }
    
    public void setLevel(int l)
    {
        level = l;
    }
    
    public int getLevel()
    {
        return level;
    }
}
