package model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero extends Character
{

    private String name;
    Hero() {
    }

    public Hero(String name)
    {
        //this._name = name;
        this.name = name;
        this.level = 1;
        this._type = "Hero";

    }
    public void Attack(Character person)
    {
    }

    public void Defend(Character person, int damage)
    {
    }


}
