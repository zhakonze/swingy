package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectPrevious {
    private static JButton SELECTButton = new JButton("SELECT");
    private static JList heroList = new JList();
    private static JPanel prevScreen = new JPanel();
    private static JTextField textField1 = new JTextField();
    private static JLabel welcomeLabel = new JLabel("SELECT HERO FROM LIST");
    private static JFrame window = new JFrame();

    private static void initPreV()
    {
        SELECTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playGround.InitPLAY();
                window.dispose();
            }
        });
        SELECTButton.setBounds(300, 500 , 150, 20);
        heroList.setBounds(200, 50 , 200, 400);
        textField1.setBounds(100, 500 , 150, 20);
        welcomeLabel.setBounds(225, 20 , 200, 20);
        prevScreen.add(SELECTButton);
        prevScreen.add(heroList);
        prevScreen.add(textField1);
        prevScreen.add(welcomeLabel);
        prevScreen.setLayout(null);
    }

    public static void InitSELECT()
    {
        initPreV();
        window.setMinimumSize(new Dimension(650,600));
        window.setContentPane(prevScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
