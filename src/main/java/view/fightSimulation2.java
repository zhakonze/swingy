package view;

import controller.CharacterController;
import model.characters.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fightSimulation2 {
    private static JButton fightButton = new JButton("FIGHT");
    private static JButton runButton = new JButton("RUN");
    private static JTextArea fightFloor = new JTextArea();
    private static JFrame window = new JFrame();
    private static JPanel fightScreen = new JPanel();
    private static Hero _preVHero;
    private static JLabel welcomeLabel = new JLabel("FIGHT OR RUN");
    private static JScrollPane scrollPane = new JScrollPane(fightFloor,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


    private static void initBATTLE()
    {
        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightFloor.setText(CharacterController.fight2(playGround2.get_preVHero(), playGround2.get_arena()));
                if(playGround2.get_preVHero().get_healthPoint() <= 0)
                {
                    youLose.InitgameOver();
                    window.dispose();
                }
                else
                {
                    playGround2.InitPLAY();
                    window.dispose();
                }
            }
        });
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playGround2.InitPLAY();
                window.dispose();
            }
        });
        runButton.setBounds(250, 500 , 150, 20);
        fightButton.setBounds(250, 530 , 150, 20);
        scrollPane.setBounds(50, 50 , 550, 400);
        welcomeLabel.setBounds(225, 20 , 200, 20);
        fightScreen.add(fightButton);
        fightScreen.add(runButton);
        fightScreen.add(scrollPane);
        fightScreen.add(welcomeLabel);
        fightScreen.setLayout(null);
    }

    public static void InitFight()
    {
        initBATTLE();
        window.setMinimumSize(new Dimension(650,600));
        window.setContentPane(fightScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
