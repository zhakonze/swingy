package util;

import controller.CharacterController;
import model.characters.Character;
import model.characters.Hero;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader
{
    public static String getStats(String filename)
    {
        String line;
        String info = null;
        BufferedReader reader;

        try
        {
            reader = new BufferedReader(new FileReader(filename));
            info = "";
            String l[];
            Hero hero;
            int index = 0;
            while ((line = reader.readLine()) != null)
            {
                l = line.split(",");
                hero = new Hero(l[0], Integer.parseInt(l[1]),Integer.parseInt(l[2]),Integer.parseInt(l[3]),Integer.parseInt(l[4]));
                CharacterController._Heros.add(hero);
                System.out.println(index + ". " + CharacterController._Heros.get(index).get_name());
                index++;
            }
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("getContent() " + e.getMessage());
        }
        return (info);
    }
}
