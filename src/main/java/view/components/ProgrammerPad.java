package view.components;

import javax.swing.*;
import java.awt.*;

public class ProgrammerPad {
    private static final String[] KEYS = { "<<", ">>", "C", "◁", "(", ")", "%", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private static JButton[] keys = new JButton[KEYS.length];
    public static JPanel programmerPad=init();
    private static JPanel init(){
        JPanel programmerPad = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        programmerPad.setLayout(new GridLayout(6, 4, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            programmerPad.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return programmerPad;
    }
}
