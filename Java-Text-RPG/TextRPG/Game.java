import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main (String[] args)
    {
        System.out.println("~~~~~ Welcome to the amazing text-based RPG game! ~~~~~");
        System.out.println();
        System.out.println("Create a character to start your adventure.");
        System.out.println();
        
        Player player = new Player();
        Scanner keyboard = new Scanner(System.in);
        
        // System.out.println("Please enter a name: ");

        // String name = keyboard.nextLine();
        
        System.out.println("What class is your character? Pick one of three:\n"+
                           "Warrior, Thief, Mage");
        
        String playerClass = keyboard.nextLine();
        
        if (!playerClass.equals("Warrior") &&
            !playerClass.equals("Thief") &&
            !playerClass.equals("Mage"))
        {
            System.out.println("Please enter a valid character class.");
        }else
        {
            System.out.println("Your character is a " + playerClass);
        }
        
        
        // Player player = new Player();
        
        // player.setMaxHitPoints(10);
        
        // System.out.println(name + "'s has " + player.getMaxHitPoints() + " hit points.");
    }
}
