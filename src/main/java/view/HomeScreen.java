package view;

import javax.swing.*;
import javax.validation.constraints.Null;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen {
    private static JButton createNewHeroButton = new JButton("Create a New Hero");
    private static JPanel panel1 = new JPanel();
    private static JButton selectFromExistingHeroButton = new JButton("Select From Previous Heroes");
    private static JLabel WELCOMETOSWINGYTextArea = new JLabel("WELCOME TO SWINGY.");
    private static JFrame window = new JFrame();
    private static void initHomeScreen() {
        createNewHeroButton.setBounds(350, 200 , 150, 20);
        selectFromExistingHeroButton.setBounds(120, 200 , 200, 20);
        WELCOMETOSWINGYTextArea.setBounds(240, 30 , 200, 30);
        panel1.add(createNewHeroButton);
        panel1.add(selectFromExistingHeroButton);
        panel1.add(WELCOMETOSWINGYTextArea);
        panel1.setLayout(null);
        selectFromExistingHeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        createNewHeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createScreen.InitCreate();
                window.dispose();
            }
        });
    }

    public static void InitGUI()
    {
        initHomeScreen();
        window.setMinimumSize(new Dimension(600,300));
        window.setContentPane(panel1);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLayout(null);
        window.setVisible(true);
    }
}
