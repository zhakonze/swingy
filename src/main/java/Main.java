import model.characters.Hero;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);

        Hero jack = new Hero("Zach");
        System.out.println("##################### Welcome to Swingy #####################");
        System.out.println("Create your Hero");
        System.out.print("Name: ");
        String _name = scanf.next();
        System.out.println("------------------------------------------------------");
        /*------------------- Hero Stats -------------------*/
        System.out.println("Welcome ");
        System.out.println("Hero class: ");
        System.out.println("Level: ");
        System.out.println("Xp: ");
        System.out.println("------------------------------------------------------");

        //System.out.println(jack.getName());
        //System.out.println(jack.getName());

    }

}
