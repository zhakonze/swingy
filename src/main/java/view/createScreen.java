package view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;


@Getter
@Setter
public class createScreen {
    private static JButton createButton = new JButton("Create");
    private static JPanel createScreen = new JPanel();
    private static JTextField nameField = new JTextField();
    private static JLabel nameLabel = new JLabel("Enter Your Hero Name");
    private static JFrame window = new JFrame();

    private static void initcreateScreen()
    {
        // TODO: place custom component creation code here
        createButton.setBounds(350, 200 , 150, 20);
        nameField.setBounds(350, 200 , 150, 20);
        nameLabel.setBounds(350, 200 , 150, 20);
        createScreen.add(createButton);
        createScreen.add(nameField);
        createScreen.add(nameLabel);
        createScreen.setLayout(null);
    }

    public static void InitCreate()
    {
        initcreateScreen();
        window.setMinimumSize(new Dimension(600,300));
        window.setContentPane(createScreen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
