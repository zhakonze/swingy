package util;

import model.characters.Hero;

import java.io.*;
import java.util.List;

//
//public class LoggerWrite
//{
//    static FileWriter fw = null;
//    static BufferedWriter bw = null;
//    static PrintWriter out = null;
//    private static List<Hero> _heroList;
//    private Hero _hero;
//    public static String FileName = "hero.txt";
//    public static String SimulationOutputName = "simulation-output.txt";
//
//    public static void write(String filename, String str, Boolean append){
//        try
//        {
//            fw = new FileWriter(filename, append);
//            bw = new BufferedWriter(fw);
//            out = new PrintWriter(bw);
//            out.write(str);
//            out.close();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}






public class LoggerWrite
{
    private static File file = null;
    private static FileWriter fileWriter = null;
    private static BufferedWriter bufferedWriter = null;

    public LoggerWrite()
    {
        try {
            file = new File("save.txt");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
        }catch (IOException e)
        {
            System.out.println("error while creating file or instantiating filewrite or bufferedwrite");
        }
    }

    public static void writeToFile(String str)
    {
        try
        {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        catch (IOException e)
        {
            System.out.println("error while writing to file");
        }
    }

    public static void closeFile()
    {
        try
        {
            if (bufferedWriter != null)
                bufferedWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("error!, could not close the file");
        }
    }
}
