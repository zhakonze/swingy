import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;
import view.Print;

import java.util.Scanner;
@Getter
@Setter
public class Main
{
    public static void main(String[] args)
    {
//        /*--------------------- Map ----------------------*/
//        System.out.println(get_level());
//        int _x = (get_level() - 1) * 5 + 10 - (get_level() % 2);
//        int _y = (get_level() - 1) * 5 + 10 - (get_level() % 2);
//        int map[][];
//
//        map = new int[_x][_y];




        /*--------------------------------------------------*/












        Scanner scanf = new Scanner(System.in);

        Print._menU();
        int _opt = scanf.nextInt();
        while (true)
        {
            if (_opt == 1)
            {
                _opt = Print._preVhero();
                /*if (_opt == 4) {
                    main(args);
                    return;
                }*/
            }
            else if (_opt == 2)
            {
                int _printOpt = Print._neWhero();
                if (_printOpt == 1)
                    break;

                /*if (_opt == 2) {
                    main(args);
                    return;
                }*/
            }
            else if (_opt == 3)
            {
                System.out.println("\\*------------------------------------------------------");
                System.out.println("WORK IN PROGRESS");
                System.out.println("------------------------------------------------------*/");
                break;
            }
            Print._menU();
            _opt = scanf.nextInt();
        }
    }

}
