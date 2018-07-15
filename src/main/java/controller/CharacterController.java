//package controller;
//import model.characters.Character;
//
//import java.util.Scanner;
//
//public class CharacterController
//{
//    static String dir = "";
//    static Scanner scanf = new Scanner(System.in);
//
//    public static void move()
//    {
//        dir = scanf.nextLine();
//        switch (dir){
//            case "up":
//                _xMovement = _xMovement + 1;
//                playerPos = map[_xMovement][_yMovement];
//                map();
//                break;
//            case "down":
//                _xMovement = _xMovement - 1;
//                playerPos = map[_xMovement][_yMovement];
//                map();
//                break;
//            case "left":
//                _yMovement = _yMovement - 1;
//                playerPos = map[_xMovement][_yMovement];
//                map();
//                break;
//            case "right":
//                _yMovement = _yMovement + 1;
//                playerPos = map[_xMovement][_yMovement];
//                map();
//                break;
//
//        }
//    }
//}
