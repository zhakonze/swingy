package util;

import model.characters.Hero;

import java.io.*;
import java.util.List;


public class LoggerWrite
{


    static FileWriter fw = null;
    static BufferedWriter bw = null;
    static PrintWriter out = null;
    private Hero _hero;
    public static String FileName = "hero.txt";

    public static void writeToFile(Hero _hero)
    {
        try
        {
            fw = new FileWriter(FileName, true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            //out.println("");
            out.println(_hero.get_name() + "," + _hero.get_level() + "," + _hero.getAttack() + "," +  _hero.getDefense() + "," +  _hero.get_healthPoint() + "," + _hero.getXp());
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}

//public class LoggerWrite
//{
//    private static File file = null;
//    private static FileWriter fileWriter = null;
//    private static BufferedWriter bufferedWriter = null;
//
//    public LoggerWrite()
//    {
//        try {
//            file = new File("hero.txt");
//            fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//        }catch (IOException e)
//        {
//            System.out.println("error while creating file or instantiating filewrite or bufferedwrite");
//        }
//    }
//
//    public static void writeToFile(String str)
//    {
//        try
//        {
//            bufferedWriter.write(str);
//            bufferedWriter.newLine();
//        }
//        catch (IOException e)
//        {
//            System.out.println("error while writing to file");
//        }
//    }
//
//    public static void closeFile()
//    {
//        try
//        {
//            if (bufferedWriter != null)
//                bufferedWriter.close();
//        }
//        catch (IOException e)
//        {
//            System.out.println("error!, could not close the file");
//        }
//    }
//}
