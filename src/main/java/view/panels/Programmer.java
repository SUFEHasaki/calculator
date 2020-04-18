package view.panels;


import myComponent.MyButton;
import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class Programmer{
    private final  String[] MEMKEYS = { "MC", "M+", "M-", "MS" };
    private  MyButton[] memkeys = new MyButton[MEMKEYS.length];
    private final  String[] RADIX = { "HEX", "DEC", "OCT", "BIN" };
    private MyButton[] radix=new MyButton[RADIX.length];
    private  final String[] LEFTKEYS = { "A", "B", "C", "D", "E", "F"};
    private  MyButton[] leftkeys = new MyButton[LEFTKEYS.length];
    private  final String[] PADKEYS = { "<<", ">>", "C", "◁","&","|","!","^", "(", ")", "%", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private  MyButton[] padkeys = new MyButton[PADKEYS.length];
    private MyTextField resultText = new MyTextField("0");
    public Programmer(){

    }
    public JPanel init(){

        JPanel memPanel = new JPanel();
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        for (int i = 0; i < MEMKEYS.length; i++) {
            memkeys[i] = new MyButton(MEMKEYS[i],Color.black);
            memPanel.add(memkeys[i]);
        }


        for(int i=0;i<RADIX.length;i++){
            radix[i]=new MyButton(RADIX[i],Color.RED);
        }

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));
        leftPanel.add(radix[0]);
        for (int i = 0; i < LEFTKEYS.length; i++) {
            leftkeys[i] = new MyButton(LEFTKEYS[i],Color.black);
            leftPanel.add(leftkeys[i]);
        }

        JPanel padPanel = new JPanel();
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new MyButton(PADKEYS[i],Color.black);
            padPanel.add(padkeys[i]);
        }
        padkeys[26].setEnabled(false);

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout(3, 5));
        buttonPanel.add("North",memPanel);
        buttonPanel.add("Center", padPanel);
        buttonPanel.add("West",leftPanel);

        JPanel programmer=new JPanel();
        programmer.setLayout(new BorderLayout(3, 5));
        programmer.add("North",resultText);
        programmer.add("South",buttonPanel);


        //各种监听器
        radix[0].addActionListener(e->{
            for (JButton leftkey:leftkeys){
                leftkey.setEnabled(false);
            }
            leftPanel.add(radix[1],0);
            leftPanel.remove(radix[0]);
            leftPanel.revalidate();
        });
        radix[1].addActionListener(e->{
            padkeys[13].setEnabled(false);
            padkeys[14].setEnabled(false);
            leftPanel.add(radix[2],0);
            leftPanel.remove(radix[1]);
            leftPanel.revalidate();
        });
        radix[2].addActionListener(e->{
            padkeys[12].setEnabled(false);
            padkeys[16].setEnabled(false);
            padkeys[17].setEnabled(false);
            padkeys[18].setEnabled(false);
            padkeys[21].setEnabled(false);
            padkeys[22].setEnabled(false);
            leftPanel.add(radix[3],0);
            leftPanel.remove(radix[2]);
            leftPanel.revalidate();
        });
        radix[3].addActionListener(e->{
            for (JButton leftkey:leftkeys){
                leftkey.setEnabled(true);
            }
            padkeys[13].setEnabled(true);
            padkeys[14].setEnabled(true);
            padkeys[12].setEnabled(true);
            padkeys[16].setEnabled(true);
            padkeys[17].setEnabled(true);
            padkeys[18].setEnabled(true);
            padkeys[21].setEnabled(true);
            padkeys[22].setEnabled(true);
            leftPanel.add(radix[0],0);
            leftPanel.remove(radix[3]);
            leftPanel.revalidate();
        });
        return programmer;
    }
}
