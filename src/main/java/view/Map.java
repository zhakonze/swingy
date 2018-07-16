package view;

import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;

@Getter
@Setter
public class Map {

    private static int _rows;
    //public static int _cols;
    private int         _grid[][];

    private String _name;
    private Hero _newHero;


    public Map(Hero tempHero)
    {
        _newHero = tempHero;
        _name = tempHero.get_name();
        _rows = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        this._grid = new int[_rows][_rows];
        //_cols = ((_newHero.get_level() - 1) * 5 + 10 - (_newHero.get_level() % 2));
        this.initMap();
    }

    public int[][] initMap()
    {

        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _rows; j++)
            {
                _grid[i][j] = 0;
            }
        }

        return _grid;
    }

    public void displayMap() {
        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _rows; j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
    /*int map[][];
    map = new int[_rows][_cols];*/

//    public int[][] get_grid {
//        grid = new int[_rows][_cols];
//        return (grid);
//    }

    public void set_grid(int y, int x, int value) {
        _grid[y][x] = value;
    }
}
