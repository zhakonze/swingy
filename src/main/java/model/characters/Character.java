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
    protected int _xPosition;
    protected int _yPosition;

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Helm helm;

    public abstract void Attack(Character person);

    public abstract void Defend(Character person, int damage);

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public int get_level() {
        return _level;
    }

    public void set_level(int _level) {
        this._level = _level;
    }

    public int getXp() {
        return Xp;
    }

    public void setXp(int xp) {
        Xp = xp;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int get_healthPoint() {
        return _healthPoint;
    }

    public void set_healthPoint(int _healthPoint) {
        this._healthPoint = _healthPoint;
    }

    public int get_xPosition() {
        return _xPosition;
    }

    public void set_xPosition(int _xPosition) {
        this._xPosition = _xPosition;
    }

    public int get_yPosition() {
        return _yPosition;
    }

    public void set_yPosition(int _yPosition) {
        this._yPosition = _yPosition;
    }

    private class Helm {
    }
}
