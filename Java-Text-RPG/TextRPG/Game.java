import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String[] args)
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
                           "[1]Warrior [2]Thief [3]Mage");
        
        int playerClass = keyboard.nextInt();
        
        if (playerClass == 1)
        {
            System.out.print("success");
            //player.setPlayerClass("Warrior");
        }else{
            System.out.println("Please enter a valid numerical input.");
        }
        
        
        // Player player = new Player();
        
        // player.setMaxHitPoints(10);
        
        // System.out.println(name + "'s has " + player.getMaxHitPoints() + " hit points.");
    }
}
