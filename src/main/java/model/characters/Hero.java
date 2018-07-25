package model.characters;

import model.artifacts.Armor;
import model.artifacts.Weapon;

import java.util.Map;
import java.util.Random;


public class Hero extends Character
{
    public Weapon weapon;
    public Armor armor;
    private float x;
    private float y;


    Hero()
    {

    }

    public Hero(String name)
    {
        this._name = name;
        this._level = 7;
        this.x = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this.y = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this._healthPoint = 100;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

}
