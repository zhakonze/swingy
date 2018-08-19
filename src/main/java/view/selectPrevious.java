package view;

import util.Reader;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectPrevious {
    private static String[] _heros = Reader.getHeroName("hero.txt");
    private static String[] _heroValues = Reader.getHeroValue("hero.txt");
    private static JButton SELECTButton = new JButton("SELECT");
    private static JList heroList = new JList(_heros);
    private static JPanel prevScreen = new JPanel();
    private static JLabel welcomeLabel = new JLabel("SELECT HERO FROM LIST");
    private static JFrame window = new JFrame();
    private static int test = -1;
    private static String Nam;
    private static int LEVEL;
    private static int ATT;
    private static int DEF;
    private static int HP;
    private static int XP;
    public static String getNam() {
        return Nam;
    }

    public static int getLEVEL() {
        return LEVEL;
    }

    public static int getATT() {
        return ATT;
    }
    public static int getDEF() {
        return DEF;
    }

    public static int getHP() {
        return HP;
    }

    public static int getXP() {
        return XP;
    }





    private static void initPreV()
    {
        heroList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String[] l;
                test = heroList.getSelectedIndex();
                JOptionPane.showMessageDialog(null, "Selected index = " + test + "\nValue = " + _heros[test]);



            }
        });
        SELECTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                for(int i = 0; i< _heroValues.length; i++)
                {
                    String[] M = _heroValues[i].split(",");
                    if(_heros[test].equals(M[0]))
                    {
                        Nam = M[0];
                        LEVEL = Integer.parseInt(M[1]);
                        ATT = Integer.parseInt(M[2]);
                        DEF = Integer.parseInt(M[3]);
                        HP = Integer.parseInt(M[4]);
                        XP = Integer.parseInt(M[5]);

                        System.out.println(M[0] + " " + M[1] + " " + M[2] + " " + M[3]+ " " + M[4] + " " + M[5]);
                    }

                }
                playGround2.InitPLAY();
                window.dispose();
            }
        });

        SELECTButton.setBounds(200, 500 , 200, 20);
        heroList.setBounds(200, 50 , 200, 400);
        welcomeLabel.setBounds(225, 20 , 200, 20);
        heroList.setVisibleRowCount(5);
        heroList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        prevScreen.add(new JScrollPane(heroList));
        prevScreen.add(SELECTButton);
        prevScreen.add(heroList);
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
