import model.artifacts.Armor;
import model.artifacts.Weapon;
import model.characters.Character;

//package model.characters;
//
public class Villain extends Character
{
    protected Weapon weapon;
    protected Armor armor;


    public Villain()
    {
        //this._name = name;
        this._name = "Evil spiral";
        this._level = 1;
        this._hitPoint = 25;
        this.Xp = 17;
        this.Attack = 30;

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
