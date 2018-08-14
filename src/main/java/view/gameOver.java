package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameOver {

    private static JLabel titleLabel = new JLabel("GAME OVER! YOU WON!");
    private static JPanel overScreen = new JPanel();
    private static JFrame window = new JFrame();


    private static void initgameOver()
    {
        titleLabel.setBounds(50, 80 , 150, 100);
        overScreen.add(titleLabel);
        overScreen.setLayout(null);
    }

    public static void InitgameOver()
    {
        initgameOver();
        window.setMinimumSize(new Dimension(300,300));
        window.setContentPane(overScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
