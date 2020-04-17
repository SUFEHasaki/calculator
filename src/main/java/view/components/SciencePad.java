package view.components;

import javax.swing.*;
import java.awt.*;

public class SciencePad {
    private final static String[] KEYS = { "π", "e", "C", "◁", "1/x", "|x|", "exp",
            "mod", "(", ")", "n!", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private static JButton[] keys = new JButton[KEYS.length];
    public static final JPanel sciencePad=init();
    private static JPanel init(){
        JPanel sciencePad = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        sciencePad.setLayout(new GridLayout(7, 4, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            sciencePad.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return sciencePad;
    }
}
