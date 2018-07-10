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
        Scanner scanf = new Scanner(System.in);

        Print._menU();
        int _opt = scanf.nextInt();
        if(_opt == 1)
        {
            Print._preVhero();
            if (_opt == 4)
                main(args);
        }
        else if(_opt == 2)
        {
            Print._neWhero();
            if (_opt == 2)
                main(args);
        }
        else if (_opt == 3)
        {
            System.out.println("\\*------------------------------------------------------");
            System.out.println("WORK IN PROGRESS");
            System.out.println("------------------------------------------------------*/");

        }
    }

    private static void main(String string) {
    }

}
