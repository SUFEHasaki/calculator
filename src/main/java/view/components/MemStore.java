package view.components;

import javax.swing.*;
import java.awt.*;

public class MemStore {
    private final String[] KEYS = { "MC", "M+", "M-", "MS" };
    private JButton[] keys = new JButton[KEYS.length];

    public JPanel init(){
        JPanel memPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            memPanel.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
//      getContentPane().add("North", numPadPanel);
        return memPanel;
    }
}
