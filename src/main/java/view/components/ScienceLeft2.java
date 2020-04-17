package view.components;

import javax.swing.*;
import java.awt.*;

public class ScienceLeft2 {
    private final static String[] KEYS = { "2nd","2√x", "3√x", "y√x", "2^x", "log_yx", "e^x"};
    private static JButton[] keys = new JButton[KEYS.length];
    public static JButton getTransKey(){
        return keys[0];
    }
    public static final JPanel scienceLeft=init();
    private static JPanel init(){
        JPanel operator =new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        operator.setLayout(new GridLayout(7, 1, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            operator.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return operator;
    }
}
