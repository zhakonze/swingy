package view;

import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;

@Getter
@Setter
public class Map {

    private static int _rows;
    public static int _cols;
    private char         _grid[][];

    private String _name;
    private Hero _newHero;


    public Map(Hero tempHero)
    {
        _newHero = tempHero;
        _name = tempHero.get_name();
        _rows = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        _cols = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        this._grid = new char[_rows][_cols];
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

        return _grid;
    }

    void _setPosition()
    {
        //_newHero.//position X
        //same as above
    }

    public void displayMap()
    {
        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _cols; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public void set_grid(int y, int x, char value) {
        _grid[y][x] = value;
    }
}
