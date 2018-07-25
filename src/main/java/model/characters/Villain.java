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
        this._name = "Hero Slayer";
        this._healthPoint = 50;
        this.Attack = 10;
        this.Defense = 15;

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

}
