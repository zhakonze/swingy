package view;

import javax.swing.*;
import java.awt.*;

public class youLose {
    private static JLabel titleLabel = new JLabel("GAME OVER! YOU LOSE!");
    private static JPanel overScreen = new JPanel();
    private static JFrame window = new JFrame();


    private static void inityouLose()
    {
        titleLabel.setBounds(50, 80 , 150, 100);
        overScreen.add(titleLabel);
        overScreen.setLayout(null);
    }

    public static void InitgameOver() {
        inityouLose();
        window.setMinimumSize(new Dimension(300, 300));
        window.setContentPane(overScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
