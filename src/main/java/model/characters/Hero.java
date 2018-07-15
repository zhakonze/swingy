package model.characters;

import lombok.Getter;
import lombok.Setter;
import model.artifacts.Armor;
import model.artifacts.Weapon;

import java.util.Random;

@Getter
@Setter
public class Hero extends Character
{
    public Weapon weapon;
    public Armor armor;

    Hero() {
    }

    public Hero(String name)
    {
        //this._name = name;
        this._name = name;
        this._level = 1;
        this._healthPoint = 20;
        this.Xp = 0;
        this.Attack = 12;

    }

    public void Attack(Character person)
    {
        System.out.println(this._name + " is attacking");
       /* if(Villain.getArmor() == null)
        {
            Villain.get_healthPoint() -= 5;
        }*/

    }
    void setPosition(int _x, int _y)
    {
        _map = new int[_x/2][_y/2];
    }

    public void Defend(Character person, int damage)
    {
        System.out.println("Your hero entered defence mode...");
    }



    public String fight(Hero hero, Villain villain)
    {
        String msg;
        while (hero.get_healthPoint() != 0 && villain.get_healthPoint() != 0)
        {
            Random random = new Random();
            int hero_ran = random.nextInt(2);
            int villain_ran = random.nextInt(2);
            if (hero_ran == 0)
            {
                msg = "Your hero entered defence mode...";

            }
            else
            {
                msg = "Your hero entered defence mode...";

            }
            if (villain_ran == 0)
            {
                msg = "Your hero entered defence mode...";

            }
            else
            {
                msg = "Your hero entered defence mode...";

            }
            return msg;
        }
        return null;
    }
}
