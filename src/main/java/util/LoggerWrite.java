package util;

import model.characters.Hero;

import java.io.*;
import java.util.List;


public class LoggerWrite
{
    static BufferedWriter bw = null;
    public static String fileName = "hero.txt";

    public static void write(String str)
    {
        try
        {
            File file = new File("lil.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            System.out.println(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write(str);
            pw.close();
        }
        catch (IOException e)
        {
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
