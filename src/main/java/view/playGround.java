package view;

import controller.CharacterController;
import model.characters.Hero;
import model.characters.Villain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static controller.CharacterController.checkCollision;

public class playGround {
    private static JButton UPButton = new JButton("UP");
    private static JButton RIGHTButton = new JButton("RIGHT");
    private static JButton LEFTButton = new JButton("LEFT");
    private static JButton DOWNButton = new JButton("DOWN");
    private static JTextArea playFloor = new JTextArea();
    private static JPanel playScreen = new JPanel();
    private static JLabel welcomeLabel = new JLabel("EXPLORE");
    private static JFrame window = new JFrame();
    private static String _name = createScreen.get_getValue();
    private static Hero _newHero = new Hero(_name);
    private static Map _arena = new Map(_newHero);
    public static List<Villain> _newVillains = CharacterController.get_newVillains();
    public static List<Villain> get_newVillains()
    {
        return _newVillains;
    }
    public static Hero get_newHero() {
        return _newHero;
    }
    public static Map get_arena() {
        return _arena;
    }



//    public static boolean checkCollision(Hero _newHero)
//    {
//        for (int i = 0; i < get_newVillains().size(); i++)
//        {
//            if (_newHero.getX() == get_newVillains().get(i).getX() && _newHero.getY() == get_newVillains().get(i).getY())
//                return true;
//        }
//        return false;
//    }


    private static void initPlay()
    {

        playFloor.setText(_arena.displayMap2(_newHero));
        UPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                _newHero.setY(_newHero.getY() - 1);
                if (checkCollision(_newHero)) {
                    welcomeLabel.setText("collided");
                    fightSimulation.InitFight();
                    window.dispose();
                }
                else
                    welcomeLabel.setText("Explore");
                playFloor.setText(_arena.displayMap2(_newHero));
            }
        });
        DOWNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _newHero.setY(_newHero.getY() + 1);
                if (checkCollision(_newHero))
                    welcomeLabel.setText("collided");
                else
                    welcomeLabel.setText("Explore");
                playFloor.setText(_arena.displayMap2(_newHero));
            }
        });
        RIGHTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _newHero.setX(_newHero.getX() + 1);
                if (checkCollision(_newHero))
                    welcomeLabel.setText("collided");
                else
                    welcomeLabel.setText("Explore");
                playFloor.setText(_arena.displayMap2(_newHero));
            }
        });
        LEFTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _newHero.setX(_newHero.getX() - 1);
                if (checkCollision(_newHero))
                    welcomeLabel.setText("collided");
                else
                    welcomeLabel.setText("Explore");
                playFloor.setText(_arena.displayMap2(_newHero));
            }
        });

        UPButton.setBounds(250, 500 , 150, 20);
        DOWNButton.setBounds(250, 550 , 150, 20);
        RIGHTButton.setBounds(400, 525 , 150, 20);
        LEFTButton.setBounds(100, 525 , 150, 20);
        playFloor.setBounds(50, 50 , 550, 400);
        welcomeLabel.setBounds(225, 20 , 200, 20);
        playScreen.add(UPButton);
        playScreen.add(DOWNButton);
        playScreen.add(RIGHTButton);
        playScreen.add(LEFTButton);
        playScreen.add(playFloor);
        playScreen.add(welcomeLabel);
        playScreen.setLayout(null);
    }

    public static void InitPLAY()
    {
        initPlay();
        window.setMinimumSize(new Dimension(650,600));
        window.setContentPane(playScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
//        playFloor.setText(_arena.displayMap2(_newHero));
    }

}
