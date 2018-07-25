
package controller;
import model.characters.Hero;
import view.Map;
import view.Print;
import view.Map;
import model.characters.Villain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CharacterController
{

    public static List<Villain> _newVillains = new ArrayList<>();
    public static List<Villain> get_newVillains()
    {
        return _newVillains;
    }

    public void set_newVillains(List<Villain> _newVillains)
    {
        this._newVillains = _newVillains;
    }


    static Scanner scanf = new Scanner(System.in);

    public static boolean checkCollision(Hero _newHero)
    {
        for (int i = 0; i < get_newVillains().size(); i++)
        {
            if (_newHero.getX() == get_newVillains().get(i).getX() && _newHero.getY() == get_newVillains().get(i).getY())
                return true;
        }
        return false;
    }

    private static Villain getVillain(float x, float y)
    {
        for (Villain v : _newVillains)
        {
            if (v.getX() == x && v.getY() == y)
                return v;
        }
        return null;
    }

    public static void fight(Hero hero)
    {

        Villain villain = getVillain(hero.getX(), hero.getY());
        System.out.println(hero.get_name() + " Entered attack mode...");
        System.out.println("your current opponate has the following stats...");
        System.out.println("Name             : " + villain.get_name());
        System.out.println("Health Points    : " + villain.get_healthPoint());
        System.out.println("Defence strength : " + villain.getDefense());
    }

    public static void enemySpawn()
    {
        Random rand = new Random();
        float _mapSize = (Map.get_cols() * Map.get_rows());
        float numberV = (float)(_mapSize * 0.030);
        int cols;
        int rows;

        for(int i = 0; i < numberV; i++)
        {
            _newVillains.add(new Villain());
            //Make sure two enemies do spawn on the same spot
        }

        for (Villain v : _newVillains)
        {
            cols = rand.nextInt(Map.get_cols());
            rows = rand.nextInt(Map.get_rows());


            v.setX(rows);
            v.setY(cols);
            v.set_healthPoint(75);
            v.setAttack(5);
            v.setDefense(20);
        }
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
            if (checkCollision(_newHero) == true)
            {
                Print.disEme(map);
                _input = scanf.nextInt();
                if(_input == 1)
                    fight(_newHero);
                else if (_input == 2)
                    Print.displayOptions(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Down....");

            return true;
        }
        else if (_input == 2)
        {
            _newHero.setY(_newHero.getY() - 1);
            if (checkCollision(_newHero) == true)
            {
                Print.disEme(map);
                _input = scanf.nextInt();
                if(_input == 1)
                    fight(_newHero);
                else if (_input == 2)
                    Print.displayOptions(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Up....");

            return true;
        }
        else if(_input == 3)
        {
            _newHero.setX(_newHero.getX() + 1);
            if (checkCollision(_newHero) == true)
            {
                Print.disEme(map);
                _input = scanf.nextInt();
                if(_input == 1)
                    fight(_newHero);
                else if (_input == 2)
                    Print.displayOptions(map);
                return false;
            }
            System.out.println(_newHero.get_name() + " Moved Right....");

            return true;
        }
        else if(_input == 4)
        {
            _newHero.setX(_newHero.getX() - 1);
            if (checkCollision(_newHero) == true)
            {
                Print.disEme(map);
                _input = scanf.nextInt();
                if(_input == 1)
                    fight(_newHero);
                else if (_input == 2)
                    Print.displayOptions(map);
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

