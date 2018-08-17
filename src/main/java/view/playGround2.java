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
import static controller.CharacterController.checkEndMap;

public class playGround2 {
    private static boolean isListenersSet = false;
    private static JButton UPButton = new JButton("UP");
    private static JButton RIGHTButton = new JButton("RIGHT");
    private static JButton LEFTButton = new JButton("LEFT");
    private static JButton DOWNButton = new JButton("DOWN");
    private static JTextArea playFloor = new JTextArea();
    private static JPanel playScreen = new JPanel();
    private static JLabel welcomeLabel = new JLabel("EXPLORE");
    private static JFrame window = new JFrame();
    private static String _name = createScreen.get_getValue();
    private static String Nam = selectPrevious.getNam();
    private static int LEVEL = selectPrevious.getLEVEL();
    private static int ATT = selectPrevious.getATT();
    private static int HP = selectPrevious.getHP();
    private static int XP = selectPrevious.getXP();
    private static Hero _preVHero = new Hero(Nam,LEVEL, ATT, HP,XP);
    private static Map _arena = new Map(_preVHero);
    public static List<Villain> _newVillains = CharacterController.get_newVillains();
    public static List<Villain> get_newVillains()
    {
        return _newVillains;
    }
    public static Hero get_preVHero() {
        return _preVHero;
    }
    public static Map get_arena() {
        return _arena;
    }
    public static JTextArea getPlayFloor() {
        return playFloor;
    }





    public static void _collolider(Hero _newHero)
    {
        if (checkCollision(_newHero)) {
            welcomeLabel.setText("collided");
            fightSimulation.InitFight();
            window.dispose();
        }
        else
            welcomeLabel.setText("Explore");
    }

    public static void _edges(Hero _newHero, Map _arena)
    {
        if (checkEndMap(_newHero, _arena))
        {
            welcomeLabel.setText("YOU HAVE SUCCESSFULLY COMPLETED YOUR MISSION");
            gameOver.InitgameOver();
            _newHero.setXp(_newHero.get_level() * 1000 + (_newHero.get_level() - 1) * 2 * 450);
            _newHero.set_level(_newHero.get_level() + 1);
            window.dispose();
        }
    }


    private static void initPlay()
    {

        UPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                _preVHero.setY(_preVHero.getY() - 1);
                _collolider(_preVHero);
                _edges(_preVHero, _arena);
                playFloor.setText(_arena.displayMap2(_preVHero));
            }
        });
        DOWNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _preVHero.setY(_preVHero.getY() + 1);
                _collolider(_preVHero);
                _edges(_preVHero, _arena);
                playFloor.setText(_arena.displayMap2(_preVHero));
            }
        });
        RIGHTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _preVHero.setX(_preVHero.getX() + 1);
                _collolider(_preVHero);
                _edges(_preVHero, _arena);
                playFloor.setText(_arena.displayMap2(_preVHero));
            }
        });
        LEFTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _preVHero.setX(_preVHero.getX() - 1);
                _collolider(_preVHero);
                _edges(_preVHero, _arena);
                playFloor.setText(_arena.displayMap2(_preVHero));
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

    public static void  InitPLAY()
    {
        playFloor.setText(_arena.displayMap2(_preVHero));
        if (isListenersSet == false)
        {
            isListenersSet = true;
            initPlay();
        }
        window.setMinimumSize(new Dimension(650,600));
        window.setContentPane(playScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }

}
