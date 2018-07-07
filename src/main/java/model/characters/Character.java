package model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character
{
    protected String _name;
    protected String _type;
    protected int level;
    protected int Xp;
    protected int Attack;
    protected int Defense;
    protected int _hitPoint;


    public Character() {
    }
}
