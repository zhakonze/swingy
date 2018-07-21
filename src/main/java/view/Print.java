package view;
import java.util.Scanner;

import controller.CharacterController;
import model.characters.Hero;

public class Print {
    Print()
    {}

    public static void _menU()
    {
        System.out.println("|####################-< Welcome to Swingy >-####################|");
        System.out.println("| >> 1.Select your Hero                                         |");
        System.out.println("| >> 2.Create new Hero                                          |");
        System.out.println("| >> 3.Switch to GUI                                            |");
        System.out.println("|[]*----------* Select option by chosing a number *----------*[]|");
    }

    public static int _preVhero()
    {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Hero List: ");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| >> 1.Hero0                                            |");
        System.out.println("| >> 2.Hero1                                            |");
        System.out.println("| >> 3.Hero2                                            |");
        System.out.println("| << 4.Back                                             |");
        System.out.println("|-------------------------------------------------------|");
        int _opt = scanf.nextInt();
        if(_opt == 1) {
            System.out.println("Working on it");
        }
        return (_opt);
        //_newHero.Attack();
    }

    public static int _neWhero()
    {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Name: ");
        String _name = scanf.next();
        System.out.println("|------------------------------------------------------|");
        Hero _newHero = new Hero(_name);
        System.out.println("| Welcome to the depth of hell " + _newHero.get_name() + "\n" + "| A few things you must know before we start");
        System.out.println("|------------------------------------------------------|");
        System.out.println("| Name: " + _newHero.get_name());
        System.out.println("| Level: " + _newHero.get_level());
        System.out.println("| Hp: " + _newHero.get_healthPoint());
        System.out.println("| Attack: " + _newHero.getAttack());
        System.out.println("| Armor: " + _newHero.getArmor());
        System.out.println("| Xp : " + _newHero.getXp());
        System.out.println("|------------------------------------------------------|");
        System.out.println("|------------------------------------------------------|");
        System.out.println("| >> 1.Continue                                        |");
        System.out.println("| << 2.Back                                            |");
        System.out.println("|------------------------------------------------------|");
        //_newHero.Attack();
        int _opt = scanf.nextInt();
        if(_opt == 1){
            Map map = new Map(_newHero);
            boolean gameContinues = true;
            while (gameContinues)
            {
                gameContinues = CharacterController.manageMovement(_newHero, map);
            }

        }
        return (_opt);
    }

    public static void displayOptions(Map map)
    {
        map.displayMap();//displays map initial start point and after movement position
        System.out.println("|-----# Movement #-----*|");
        System.out.println("| 1. Down               |");
        System.out.println("| 2. Up                 |");
        System.out.println("| 3. Right              |");
        System.out.println("| 4. Left               |");
        System.out.println("|-----# Movement #-----*|");
        System.out.println("|--------------*|");
        System.out.println("|  5. Exit      |");
        System.out.println("|--------------*|");
    }

    public static void _levelUp()
    {
        System.out.println("|-----# Carry On #-----*|");
        System.out.println("| 1. Continue           |");
        System.out.println("| 2. Back to Menu       |");
        System.out.println("| 3. Exit               |");
        System.out.println("|-----# ~~~~~~~~ #-----*|");
    }


}
