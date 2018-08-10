package view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@Getter
@Setter
public class createScreen {
    private static JButton createButton = new JButton("Create");
    private static JPanel createScreen = new JPanel();
    private static JTextField nameField = new JTextField();
    private static JLabel nameLabel = new JLabel("Enter Your Hero Name");
    private static JLabel welcomeLabel = new JLabel("CREATE A NEW HERO");
    private static JFrame window = new JFrame();

    private static void initcreateScreen()
    {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playGround.InitPLAY();
                window.dispose();
            }
        });
        createButton.setBounds(350, 300 , 150, 20);
        nameField.setBounds(350, 200 , 150, 20);
        nameLabel.setBounds(100, 200 , 150, 20);
        welcomeLabel.setBounds(250, 50 , 150, 20);
        createScreen.add(createButton);
        createScreen.add(nameField);
        createScreen.add(nameLabel);
        createScreen.add(welcomeLabel);
        createScreen.setLayout(null);
    }

    public static void InitCreate()
    {
        initcreateScreen();
        window.setMinimumSize(new Dimension(650,600));
        window.setContentPane(createScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
