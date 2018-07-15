package model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character
{
    protected String _name;
    protected String _type;
    protected int _level;
    protected int Xp;//experience
    protected int Attack;//
    protected int Defense;
    protected int _healthPoint; //health
    protected int _xMovement;
    protected int _yMovement;

    public abstract void Attack(Character person);

    public abstract void Defend(Character person, int damage);

}
