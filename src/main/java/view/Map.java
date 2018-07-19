package view;

import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;

import static view.Colors.ANSI_RED;
import static view.Colors.ANSI_RESET;
import static view.Colors.ANSI_WHITE;

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


    public void displayMap()
    {
        for(int i = 0; i < _rows; i++)
        {
            for (int j = 0; j < _cols; j++)
            {
                if((_newHero.getX() == j) && (_newHero.getY() == i))
                {
                    System.out.print(ANSI_WHITE +"O ");
                    continue ;
                }
//                for each (enemy : enemies) {
//                    if ((enemy.x = j) && (enemy.y == i)) {
//                        System.out.print("E ");
//                        continue ;
//                    }
//                }
                System.out.print(ANSI_RED +"* ");
            }
            System.out.print("\n");
        }
        System.out.print(ANSI_RESET +"* ");
    }

    public void set_grid(int y, int x, char value) {
        _grid[y][x] = value;
    }
}
