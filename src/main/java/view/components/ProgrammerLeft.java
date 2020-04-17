package view.components;

import javax.swing.*;
import java.awt.*;

public class ProgrammerLeft {
    private static final String[] KEYS = { "A", "B", "C", "D", "E", "F"};
    private static JButton[] keys = new JButton[KEYS.length];
    public static JPanel programmerLeft=init();
    private static JPanel init(){
        JPanel programmerLeft = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        programmerLeft.setLayout(new GridLayout(6, 1, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            programmerLeft.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return programmerLeft;
    }
}
