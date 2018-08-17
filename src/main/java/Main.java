import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;
import util.LoggerWrite;
import view.Colors;
import view.HomeScreen;
import view.Print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Main
{
    public static void main(String[] args)
    {

        List<Hero> _newHeroes = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("hero.txt"));
            String line = "";
            //Print._menU();
            if (args.length == 2){
                switch(args[0].toLowerCase()){
                    case "console":
                        Print._menU();
                        break;
                    case "gui":
                        HomeScreen.InitGUI();
                        break;
                    default:
                        System.out.println(Colors.ANSI_RED + "Invalid parameters. \nUsage: java -jar file.jar [gui/console]" + Colors.ANSI_RESET);
                        break;
                }
            }else {
                System.out.println(Colors.ANSI_RED + "Invalid parameters. \nUsage: java -jar file.jar [gui/console]" + Colors.ANSI_RESET);
            }


        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find file " + args[1]);
        }
        catch (IOException e)
        {
            System.out.println("There was an error whilst reading the file " + args[1]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please specify simulation file");
        }
        /*catch (NullPointerException e)
        {
            System.out.println("value is null");
        }*/
        catch (NumberFormatException e)
        {
            System.out.println("A number entered is not valid in file");
        }
        finally
        {
           // LoggerWrite.closeFile();
        }


//        for (Hero hehe : _newHeroes)
//        {
//            System.out.printf("%s, %d, %d, %d, %d\n", hehe.get_name(), hehe.get_level(), hehe.getAttack(), hehe.get_healthPoint(), hehe.getXp());
//        }




    }

}
