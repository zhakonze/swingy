
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
            {
                Print.disEme(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Down....");

            return true;
        }
        else if (_input == 2)
        {
            _newHero.setY(_newHero.getY() - 1);
            if (checkCollision(_newHero, map) == true)
            {
                Print.disEme(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Up....");

            return true;
        }
        else if(_input == 3)
        {
            _newHero.setX(_newHero.getX() + 1);
            if (checkCollision(_newHero, map) == true)
            {
                Print.disEme(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Right....");

            return true;
        }
        else if(_input == 4)
        {
            _newHero.setX(_newHero.getX() - 1);
            if (checkCollision(_newHero, map) == true)
            {
                Print.disEme(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Left....");

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

