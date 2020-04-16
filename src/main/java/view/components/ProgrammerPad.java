package view.components;

import javax.swing.*;
import java.awt.*;

public class ProgrammerPad {
    private final String[] KEYS = { "<<", ">>", "C", "◁", "(", ")", "%", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private JButton[] keys = new JButton[KEYS.length];
    public JPanel init(){
        JPanel numPadPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        numPadPanel.setLayout(new GridLayout(6, 4, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            numPadPanel.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return numPadPanel;
    }
}
