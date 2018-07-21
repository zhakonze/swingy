package model.characters;
import lombok.Getter;
import lombok.Setter;
import model.artifacts.Armor;
import model.artifacts.Weapon;
import model.characters.Character;

import java.util.Random;

@Getter
@Setter
public class Villain extends Character
{
    public Weapon weapon;
    public Armor armor;
    private float x;
    private float y;


    public Villain()
    {

    }

    public Villain(String name)
    {
        this._name = name;
        this._level = 4;
        this.x = (((get_level() - 1) * 5 + 10 - (get_level() % 2))  );
        this.y = (((get_level() - 1) * 5 + 10 - (get_level() % 2))  );
        this._healthPoint = 20;
        this.Xp = 0;
        this.Attack = 12;

    }

    public void Attack(Character person)
    {
        System.out.println(this._name + " is attacking");
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void Defend(Character person, int damage)
    {
        System.out.println("Your hero entered defence mode...");
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public Armor getArmor()
    {
        return armor;
    }

    public void setArmor(Armor armor)
    {
        this.armor = armor;
    }



//    public String fight(Villain villain, Hero hero)
//    {
//        String msg;
//        while (villain.get_healthPoint() != 0 && hero.get_healthPoint() != 0)
//        {
//            Random random = new Random();
//            int hero_ran = random.nextInt(2);
//            int villain_ran = random.nextInt(2);
//            if (hero_ran == 0)
//            {
//                msg = "Your hero entered defence mode...";
//
//            }
//            else
//            {
//                msg = "Your hero entered defence mode...";
//
//            }
//            if (villain_ran == 0)
//            {
//                msg = "Your hero entered defence mode...";
//
//            }
//            else
//            {
//                msg = "Your hero entered defence mode...";
//
//            }
//            return msg;
//        }
//        return null;
//    }
}
