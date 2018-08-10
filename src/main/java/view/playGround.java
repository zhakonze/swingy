package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class playGround {
    private static JButton UPButton = new JButton("UP");
    private static JButton RIGHTButton = new JButton("RIGHT");
    private static JButton LEFTButton = new JButton("LEFT");
    private static JButton DOWNButton = new JButton("DOWN");
    private static JTextArea playFloor = new JTextArea();
    private static JPanel playScreen = new JPanel();
    private static JLabel welcomeLabel = new JLabel("EXPLORE");
    private static JFrame window = new JFrame();

    private static void initPlay()
    {
        UPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightSimulation.InitFight();
                window.dispose();
            }
        });
        DOWNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        RIGHTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        LEFTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
    }

}
