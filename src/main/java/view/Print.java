package view;
import java.util.Scanner;

import controller.CharacterController;
import model.characters.Hero;
import model.characters.Villain;

public class Print {
    Print()
    {}

    public static void _menU()
    {
        System.out.println("|####################-[ Welcome to Swingy ]-####################|");
        System.out.println("| >> 1.Select your Hero                                         |");
        System.out.println("| >> 2.Create a new Hero                                        |");
        System.out.println("| >> 3.Switch to GUI                                            |");
        System.out.println("|[]*----------* Select option by chosing a number *----------*[]|");

        Scanner scanf = new Scanner(System.in);

        int _opt = scanf.nextInt();
        while (true)
        {
            if (_opt == 1)
            {
                _opt = Print._preVhero();
            }
            else if (_opt == 2)
            {
                int _printOpt = Print._neWhero();
                if (_printOpt == 1)
                    break;
            }
            else if (_opt == 3)
            {
                System.out.println("\\*------------------------------------------------------");
                System.out.println("WORK IN PROGRESS");
                System.out.println("------------------------------------------------------*/");
                break;
            }
            else
            {
                System.out.println("You Have Entered An Invalid Command");
                break;
            }

            Print._menU();
            _opt = scanf.nextInt();
        }
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
            Villain vili = new Villain();
            boolean gameContinues = true;
            while (gameContinues)
            {
                gameContinues = CharacterController.manageMovement(_newHero, map, vili);
            }

        }
        return (_opt);
    }

    public static void displayOptions(Map map)
    {
        map.displayMap();//displays map initial start point and after movement position.
        System.out.println("|-----# Movement #-----*|");
        System.out.println("| 1. Down               |");
        System.out.println("| 2. Up                 |");
        System.out.println("| 3. Right              |");
        System.out.println("| 4. Left               |");
        System.out.println("|----------------------*|");
        System.out.println("|----------------------*|");
        System.out.println("|  5. Exit Game         |");
        System.out.println("|----------------------*|");
    }

    public static void _levelUp(Map map)
    {
        map.displayMap();
        System.out.println("|-----------------------------------------|");
        System.out.println("| You Have Accomplished Your Mission And  |");
        System.out.println("| Reached The End Of The Wall, What Would |");
        System.out.println("| You Like To Do?                         |");
        System.out.println("| 1. Continue                             |");
        System.out.println("| 2. Exit Game                            |");
        System.out.println("|-----------------------------------------|");
    }

    public static void disEme(Map map)
    {
        map.displayMap();
        System.out.println("|--------------------------*|");
        System.out.println("| YOU HAVE ENCOUNTERED AN   |");
        System.out.println("| ENEMY WHAT DO YOU WANT TO |");
        System.out.println("| DO ?                      |");
        System.out.println("| 1. Fight                  |");
        System.out.println("| 2. Run                    |");
        System.out.println("|--------------------------*|");

    }


}
