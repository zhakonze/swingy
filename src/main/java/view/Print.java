package view;
import java.util.Scanner;
import model.characters.Hero;

public class Print {
    Print()
    {}

    public static void _menU()
    {
        System.out.println("##################### Welcome to Swingy #####################");
        System.out.println(" >> 1.Select your Hero");
        System.out.println(" >> 2.Create new Hero");
        System.out.println(" >> 3.Switch to GUI");
    }

    public static void _preVhero()
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Hero List: ");
        System.out.println("\\*------------------------------------------------------");
        System.out.println(">> 1.Hero0 ");
        System.out.println(">> 2.Hero1 ");
        System.out.println(">> 3.Hero2 ");
        System.out.println("<< 4.Back");
        System.out.println("------------------------------------------------------*/");
        int _opt = scanf.nextInt();
        if(_opt == 1) {
            System.out.println("Working on it");
        }
        //_newHero.Attack();
    }

    public static void _neWhero()
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Name: ");
        String _name = scanf.next();
        System.out.println("\\*------------------------------------------------------");
        Hero _newHero = new Hero(_name);
        System.out.println("Welcome " + _newHero.get_name());
        System.out.println("You are currently at Level: " + _newHero.get_level());
        System.out.println("Xp: " + _newHero.getXp());
        System.out.println("------------------------------------------------------*/");
        System.out.println("\\*------------------------------------------------------");
        System.out.println(" >> 1.Continue");
        System.out.println(" << 2.Back");
        System.out.println("------------------------------------------------------*/");
        //_newHero.Attack();
        int _opt = scanf.nextInt();
        if(_opt == 1) {
            System.out.println("Working on it");
        }


    }
}
