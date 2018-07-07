package model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero extends Character{

    public Hero(String name)
    {
        this._name = name;
    }
}
