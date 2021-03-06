package model.characters;

import model.artifacts.Armor;
import model.artifacts.Weapon;

import java.util.Map;
import java.util.Random;


public class Hero extends Character
{
    public Weapon weapon;
    public Armor armor;
    private int x;
    private int y;


    public Hero(String name)
    {

        this._name = name;
        this._level = 1;
        this.x = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this.y = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this._healthPoint = 100;
        this.Defense = 25;
        this.Xp = 0;
        this.Attack = 12;

    }

    public Hero(String name, int level, int attack, int Def, int hp, int Xpr)
    {
        this._name = name;
        this._level = level;
        this.x = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this.y = (((get_level() - 1) * 5 + 10 - (get_level() % 2)) / 2);
        this._healthPoint = hp;
        this.Defense = Def;
        this.Xp = Xpr;
        this.Attack = attack;

    }

    public void Attack(Character person)
    {
        System.out.println(this._name + " is attacking");
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
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
