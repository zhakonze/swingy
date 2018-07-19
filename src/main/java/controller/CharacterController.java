
package controller;
import model.characters.Hero;
import view.Map;

import java.util.Scanner;

public class CharacterController
{
    static Scanner scanf = new Scanner(System.in);

    private static void displayOptions(Map map)
    {
        map.displayMap();
        System.out.println("----- MovemenT -----*/");
        System.out.println("1. Right");
        System.out.println("2. Left");
        System.out.println("3. Down");
        System.out.println("4. Up");
        System.out.println("5. Exit");
        System.out.println("--------------*/");
    }

    public static boolean manageMovement(Hero _newHero, Map map)
    {
        displayOptions(map);
        int _input;

        if(scanf.hasNextInt() == true)//can we read4
            _input = scanf.nextInt();
        else
            return(false);
        if(_input == 1)
        {
            _newHero.setX(_newHero.getX() + 1);
            map.displayMap();
            System.out.println("Moving Right....");
            return true;
        }
        else if (_input == 2)
        {
            _newHero.setX(_newHero.getX() - 1);
            map.displayMap();
            System.out.println("Moving Left....");
            return true;
        }
        else if(_input == 3)
        {
            _newHero.setY(_newHero.getY() + 1);
            map.displayMap();
            System.out.println("Moving Down....");
            return true;
        }
        else if(_input == 4)
        {
            _newHero.setY(_newHero.getY() - 1);
            map.displayMap();
            System.out.println("Moving Up....");
            return true;
        }
        else if (_input == 5)
        {
            System.out.println("Exiting current game...");
            return false;
        }
        else
        {
            System.out.println("Invalid command: Please select from the above listed");
            return true;
        }
    }
}

