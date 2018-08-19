package util;

import controller.CharacterController;
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
                hero = new Hero(l[0], Integer.parseInt(l[1]),Integer.parseInt(l[2]),Integer.parseInt(l[3]),Integer.parseInt(l[4]),Integer.parseInt(l[5]));
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

    public static String[] getHeroName(String filename)
    {
        String line;
        String[] info2 = new String[5];
        BufferedReader reader;

        try
        {
            reader = new BufferedReader(new FileReader(filename));
            String[] l;
            Hero hero;
            int index = 0;
            while ((line = reader.readLine()) != null)
            {
                l = line.split(",");
                hero = new Hero(l[0], Integer.parseInt(l[1]),Integer.parseInt(l[2]),Integer.parseInt(l[3]),Integer.parseInt(l[4]),Integer.parseInt(l[5]));
                CharacterController._Heros.add(hero);
                info2[index] = CharacterController._Heros.get(index).get_name();
                index++;

            }
            System.out.println(info2);
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("getContent() " + e.getMessage());
        }
        return (info2);
    }

    public static String[] getHeroValue(String filename)
    {

        String line;
        String[] info2 = new String[5];
        BufferedReader reader;

        try
        {
            reader = new BufferedReader(new FileReader(filename));
            String[] l;
            Hero hero;
            int index = 0;
            while ((line = reader.readLine()) != null)
            {
                l = line.split(",");
                hero = new Hero(l[0], Integer.parseInt(l[1]),Integer.parseInt(l[2]),Integer.parseInt(l[3]),Integer.parseInt(l[4]),Integer.parseInt(l[5]));
                CharacterController._Heros.add(hero);
                info2[index] = CharacterController._Heros.get(index).get_name();
                info2[index] += "," + CharacterController._Heros.get(index).get_level();
                info2[index] += "," + CharacterController._Heros.get(index).getAttack();
                info2[index] += "," + CharacterController._Heros.get(index).get_healthPoint();
                info2[index] += "," + CharacterController._Heros.get(index).getXp();
                index++;

            }
            System.out.println(info2);
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("getContent() " + e.getMessage());
        }
        return (info2);
    }
}
