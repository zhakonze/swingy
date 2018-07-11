package model.characters;

import lombok.Getter;
import lombok.Setter;
import model.artifacts.Armor;
import model.artifacts.Weapon;

@Getter
@Setter
public class Hero extends Character
{
    protected Weapon weapon;
    protected Armor armor;

    Hero() {
    }

    public Hero(String name)
    {
        //this._name = name;
        this._name = name;
        this._level = 1;
        this._hitPoint = 20;
        this.Xp = 0;
        this.Attack = 12;

    }

    public void Attack()
    {
        System.out.println(this._name + " is attacking");


    }

    public void Defend(Character person, int damage)
    {
        System.out.println("Your hero entered defence mode...");
    }


}
