import lombok.Getter;
import lombok.Setter;
import model.characters.Hero;
import view.Print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
@Getter
@Setter
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            String line = reader.readLine();
            if (line != null)
            {
                Print._menU();
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
        catch (NullPointerException e)
        {
            System.out.println("value is null");
        }
        catch (NumberFormatException e)
        {
            System.out.println("A number entered is not valid in file");
        }
    }

}
