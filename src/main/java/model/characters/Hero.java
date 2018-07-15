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
    void _setPosition(Map map)
    {
        map.get_grid()[map.get_rows()/ 2][map.get_cols()/ 2] == 1;
        this.set_xMovement(map.get_cols()/ 2);
        this.set_yMovement(map.get_rows()/ 2);
    }

    void _moveHero(int x, int y)
    {
        map.get_grid()[this.get_yMovement()][this.get_xMovement()] == 0;
        map.get_grid()[y][x] == 1;
        this.set_xMovement(x);
        this.set_yMovement(y);
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
