package view;

import controller.CharacterController;
import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;
import model.characters.Villain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static view.Colors.*;

@Getter
@Setter
public class Map
{
    private static int _rows;
    public static int _cols;

    private char         _grid[][];

    private String _name;
    private Hero _newHero;

//    public List<Villain> get_newVillains() {
//        return _newVillains;
//    }
//
//    public void set_newVillains(List<Villain> _newVillains)
//    {
//        this._newVillains = _newVillains;
//    }
//
//    private List<Villain> _newVillains = new ArrayList<>();

    public static int get_rows() {
        return _rows;
    }

    public static void set_rows(int _rows) {
        Map._rows = _rows;
    }

    public static int get_cols() {
        return _cols;
    }

    public static void set_cols(int _cols) {
        Map._cols = _cols;
    }


    public Map(Hero tempHero)
    {
        _newHero = tempHero;
        _name = tempHero.get_name();
        _rows = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        _cols = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        this._grid = new char[_rows][_cols];
        CharacterController.enemySpawn();
        this.initMap();
    }

    public char[][] initMap()
    {

        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _cols; j++)
            {
                _grid[i][j] = 0;
            }
        }
        for (Villain villi : CharacterController._newVillains)
        {
            _grid[(int)villi.getY()][(int)villi.getX()] = 1;
        }
        return _grid;
    }

//    public void enemySpawn()
//    {
//        Random rand = new Random();
//        float _mapSize = (_rows * _cols);
//        float numberV = (float)(_mapSize * 0.030);
//        int cols;
//        int rows;
//
//        for(int i = 0; i < numberV; i++)
//        {
//            _newVillains.add(new Villain());
//            //Make sure two enemies do spawn on the same spot
//        }
//
//        for (Villain v : _newVillains)
//        {
//            cols = rand.nextInt(_cols);
//            rows = rand.nextInt(_rows);
//
//
//            v.setX(rows);
//            v.setY(cols);
//        }
//    }


    public void displayMap()
    {
        Random random = new Random();
        boolean didShow = false;

        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _cols; j++)
            {
                didShow = false;
                if (_newHero.getX() == j && _newHero.getY() == i)
                {
                    System.out.print(ANSI_GREEN + "H " + ANSI_RESET);
                }
                else if (_grid[i][j] == 1)
                {
                    System.out.print(ANSI_YELLOW + "E " + ANSI_RESET);
                    didShow = true;

                }
                else {
                    System.out.print(ANSI_RED +"* ");
                }

            }
            System.out.print("\n");

        }
        System.out.print(ANSI_RESET );
    }

    public static void fight(Hero hero, Villain villain)
    {

        System.out.println(hero.get_name() + " Entered attack mode...\n");
        System.out.println("your current oponenet has the following stats...");
        System.out.println("Name             : " + villain.get_name());
        System.out.println("Health Points    : " + villain.get_healthPoint());
        System.out.println("Defence strength : " + villain.getDefense());
    }

    public void set_grid(int y, int x, char value) {
        _grid[x][y] = value;
    }
}
