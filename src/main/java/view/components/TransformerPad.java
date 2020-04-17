package view.components;

import javax.swing.*;
import java.awt.*;

public class TransformerPad {
    private static final String[] KEYS = {  "", "CE", "◁", "7", "8", "9", "4", "5", "6",
             "1", "2", "3", "","0", "." };
    private static JButton[] keys = new JButton[KEYS.length];
    public static JPanel transformerPad=init();
    private static JPanel init(){
        JPanel transformerPad = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        transformerPad.setLayout(new GridLayout(5, 3, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            transformerPad.add(keys[i]);
            keys[i].setForeground(Color.black);
            keys[i].setBackground(Color.WHITE);
        }
        keys[0].setEnabled(false);
        keys[12].setEnabled(false);
//      getContentPane().add("North", numPadPanel);
        return transformerPad;
    }
}
