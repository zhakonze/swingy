
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

import static view.Colors.*;

public class CharacterController
{

    public static List<Villain> _newVillains = new ArrayList<>();
    public static List<Hero> _Heros = new ArrayList<Hero>();
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

    private static boolean dothethings(Hero _newHero, Map map, Villain villain)
    {
        int _input;
        Print.disEme(map);
        _input = scanf.nextInt();
        if(_input == 1)
        {
            fight(_newHero,map);
            if(_newHero.get_healthPoint() > 0)
            {
                return true;
            }
            else
                return false;
        }
        else if (_input == 2)
            Print.displayOptions(map);
        return false;
    }

    public static boolean checkEndMap(Hero _newHero, Map map)
    {
        int _mapSize = Map.get_cols();
        if (_newHero.getX() == _mapSize - 1  || _newHero.getY() == _mapSize - 1 || _newHero.getX() == 0|| _newHero.getY() == 0)
            return true;
        return false;
    }

    public static void fight(Hero hero, Map map) {
        String[] attacks = {"punch", "karate kick", "spear", "panga", "sword"};
        Random rand = new Random();

        Villain villain = getVillain(hero.getX(), hero.getY());
        System.out.println(ANSI_PURPLE + hero.get_name() + " Entered attack mode...");
        System.out.println("Your current opponent has the following stats..." + ANSI_RESET);
        System.out.println("Name             : " + villain.get_name());
        System.out.println("Health Points    : " + villain.get_healthPoint());
        System.out.println("Defence strength : " + villain.getDefense());
        System.out.println("Attack strength  : " + villain.getAttack());

        int hero_dmg = hero.getAttack() - villain.getDefense();
        int enemy_dmg = villain.getAttack() - hero.getDefense();

        if (hero_dmg < 0)
            hero_dmg = 0;
        if (enemy_dmg < 0)
            enemy_dmg = 0;


        while (hero.get_healthPoint() > 0 && villain.get_healthPoint() > 0) {
            int random_attack_name = rand.nextInt(5);
            int rand_attacker = rand.nextInt(2);
            switch (rand_attacker) {
                case 0:
                    System.out.println(ANSI_GREEN + hero.get_name() + ANSI_RESET + " attacks " + villain.get_name() + " with a " + attacks[random_attack_name] + " causing " + hero_dmg + " damage");
                    villain.set_healthPoint(villain.get_healthPoint() - hero_dmg);
                    break;
                case 1:
                    System.out.println(ANSI_RED + villain.get_name() + ANSI_RESET  + " attacks " + hero.get_name() + " with a " + attacks[random_attack_name] + " causing " + enemy_dmg + " damage");
                    hero.set_healthPoint(hero.get_healthPoint() - enemy_dmg);
                    break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ANSI_GREEN + "Hero HP = " + ANSI_RESET + hero.get_healthPoint() + ANSI_RED + " ------ Villain HP = " + ANSI_RESET + villain.get_healthPoint());
        }
        if (hero.get_healthPoint() <= 0)
            System.out.println("You were defeated.. YOU LOSE!!");
        else if (villain.get_healthPoint() <= 0)
        {
            map.get_grid()[hero.getY()][hero.getX()] = 0;
            System.out.println("You defeated the enemy");
            hero.setX(hero.getX() + 1);

            //do the pick up artifact logic here
        }
    }

    public static String fight2(Hero hero, Map map) {
        String[] attacks = {"punch", "karate kick", "spear", "panga", "sword"};
        Random rand = new Random();
        String fightString = "";

        Villain villain = getVillain(hero.getX(), hero.getY());
        fightString += hero.get_name() + " Entered attack mode...";
        fightString += "Your current opponent has the following stats...\n\n";

        fightString += "Name             : " + villain.get_name();
        fightString += "\nHealth Points    : " + villain.get_healthPoint();
        fightString += "\nDefence strength : " + villain.getDefense();
        fightString += "\nAttack strength  : " + villain.getAttack();


        int hero_dmg = hero.getAttack() - villain.getDefense();
        int enemy_dmg = villain.getAttack() - hero.getDefense();

        if (hero_dmg < 0)
            hero_dmg = 0;
        if (enemy_dmg < 0)
            enemy_dmg = 0;


        while (hero.get_healthPoint() > 0 && villain.get_healthPoint() > 0) {
            int random_attack_name = rand.nextInt(5);
            int rand_attacker = rand.nextInt(2);
            switch (rand_attacker) {
                case 0:
                    fightString += hero.get_name() + " attacks " + villain.get_name() + " with a " + attacks[random_attack_name] + " causing " + hero_dmg + " damage\n";
                    villain.set_healthPoint(villain.get_healthPoint() - hero_dmg);
                    break;
                case 1:
                    fightString += villain.get_name() + " attacks " + hero.get_name() + " with a " + attacks[random_attack_name] + " causing " + enemy_dmg + " damage\n";
                    hero.set_healthPoint(hero.get_healthPoint() - enemy_dmg);
                    break;
            }
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            fightString += "Hero HP = " + hero.get_healthPoint() + " ------ Villain HP = " + villain.get_healthPoint() + "  ";
        }
        if (hero.get_healthPoint() <= 0)
            fightString += "\nYou were defeated.. YOU LOSE!!";
        else if (villain.get_healthPoint() <= 0)
        {
            map.get_grid()[hero.getY()][hero.getX()] = 0;
            fightString += "\nYou defeated the enemy";
            hero.setX(hero.getX() + 1);
        }
        return (fightString);
    }

    public static void _Drops(Villain v)
    {
        System.out.println(v.get_name() + " dropped " + v.getArmor() + " and " + v.getWeapon());
        System.out.println("Would you like to add it to the hero's artifacts?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    public static void enemySpawn()
    {
        Random rand = new Random();
        float _mapSize = (Map.get_cols() * Map.get_rows());
        float numberV = (float)(_mapSize * 0.030);
        int cols;
        int rows;
        int _hel;
        int _att;
        int _def;
        String _Nemz[] = {"Takoyo", "Opatako", "Lokono", "ZaWata", "Mulugu"};
        String _Nem = _Nemz[new Random().nextInt(_Nemz.length)];

        for(int i = 0; i < numberV; i++)
        {
            _newVillains.add(new Villain());
            //Make sure two enemies do spawn on the same spot
        }

        for (Villain v : _newVillains)
        {
            cols = rand.nextInt(Map.get_cols());
            rows = rand.nextInt(Map.get_rows());
            _hel = rand.nextInt(80);
            _att = rand.nextInt(15);
            _def = rand.nextInt(20);


            v.set_name(_Nem);
            v.setX(rows);
            v.setY(cols);
            v.set_healthPoint(_hel);
            v.setAttack(_att);
            v.setDefense(_def);
        }
    }

    public static boolean manageMovement(Hero _newHero, Map map, Villain villain)
    {
        Print.displayOptions(map);
        int _input;

        if (checkCollision(_newHero) == true)
            return (dothethings(_newHero, map, villain));

        if (checkEndMap(_newHero, map) == true)
        {
            Print._levelUp(map);
            _input = scanf.nextInt();
            if(_input == 1)
            {
                _newHero.setXp(1000);
                _newHero.set_level(_newHero.get_level() + 1);
                Print._menU();
                return true;
            }
            else if (_input == 2)
                System.exit(1);
        }
        //Print.displayOptions(map);

        if(scanf.hasNextInt() == true)//can we read4
            _input = scanf.nextInt();
        else
            return(false);
        if(_input == 1 )
        {
            _newHero.setY(_newHero.getY() + 1);
            System.out.println(_newHero.get_name() + " Moved Down....");

            return true;
        }
        else if (_input == 2)
        {
            _newHero.setY(_newHero.getY() - 1);
            System.out.println(_newHero.get_name() + " Moved Up....");

            return true;
        }
        else if(_input == 3)
        {
            _newHero.setX(_newHero.getX() + 1);
            System.out.println(_newHero.get_name() + " Moved Right....");

            return true;
        }
        else if(_input == 4)
        {
            _newHero.setX(_newHero.getX() - 1);
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

