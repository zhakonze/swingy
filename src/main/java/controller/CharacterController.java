
package controller;
import model.characters.Hero;
import view.Map;
import view.Print;
import view.Map;
import model.characters.Villain;

import java.util.Scanner;

public class CharacterController
{
    static Scanner scanf = new Scanner(System.in);

    public static boolean checkCollision(Hero _newHero, Map map) {
        for (int i = 0; i < map.get_newVillains().size(); i++)
        {
            if (_newHero.getX() == map.get_newVillains().get(i).getX() && _newHero.getY() == map.get_newVillains().get(i).getY())
                return true;
            System.out.println("Hero : x = "+ _newHero.getX() + " : y = " + _newHero.getY());
            System.out.println("Enemy: x = " + map.get_newVillains().get(i).getX() + " : y = "  + map.get_newVillains().get(i).getY());
        }
        return false;
    }
    public static boolean manageMovement(Hero _newHero, Map map, Villain villain)
    {
        Print.displayOptions(map);
        int _input;

        if(scanf.hasNextInt() == true)//can we read4
            _input = scanf.nextInt();
        else
            return(false);
        if(_input == 1 )
        {
            _newHero.setY(_newHero.getY() + 1);
            if (checkCollision(_newHero, map) == true)
                System.out.println("Enemy infront");
            System.out.println(_newHero.get_name() + " Moved Down....");
            if (_newHero.getX() == villain.getX() && _newHero.getY() == villain.getY())
            {
                System.out.println(" FIGHT.....");
            }

            return true;
        }
        else if (_input == 2)
        {
            System.out.println("Y = " + _newHero.getY());
            _newHero.setY(_newHero.getY() - 1);
            if (checkCollision(_newHero, map) == true)
                System.out.println("Enemy infront");
            System.out.println(_newHero.get_name() + " Moved Up....");
            if (_newHero.getX() == villain.getX() && _newHero.getY() == villain.getY())
            {
                System.out.println(" FIGHT.....");
            }
            return true;
        }
        else if(_input == 3)
        {
            _newHero.setX(_newHero.getX() + 1);
            if (checkCollision(_newHero, map) == true)
                System.out.println("Enemy infront");
            System.out.println(_newHero.get_name() + " Moved Right....");
            if (_newHero.getX() == villain.getX() && _newHero.getY() == villain.getY())
            {
                System.out.println(" FIGHT.....");
            }
            return true;
        }
        else if(_input == 4)
        {
            _newHero.setX(_newHero.getX() - 1);
            if (checkCollision(_newHero, map) == true)
                System.out.println("Enemy infront");

            System.out.println(_newHero.get_name() + " Moved Left....");
            if (_newHero.getX() == villain.getX() && _newHero.getY() == villain.getY())
            {
                System.out.println(" FIGHT.....");
            }
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

