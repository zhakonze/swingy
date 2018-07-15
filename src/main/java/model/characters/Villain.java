package model.characters;
import lombok.Getter;
import lombok.Setter;
import model.artifacts.Armor;
import model.artifacts.Weapon;
import model.characters.Character;

@Getter
@Setter
public class Villain extends Character
{
    private Weapon weapon;
    private Armor armor;


    public Villain()
    {
        //this._name = name;
        this._name = "Evil spiral";
        this._level = 1;
        this._healthPoint = 25;
        this.Xp = 17;
        this.Attack = 30;

    }

    public void Attack(Character person)
    {
        System.out.println(this._name + " is attacking");

    }

    public void Defend(Character person, int damage)
    {
        System.out.println("Your hero entered defence mode...");
    }
}
