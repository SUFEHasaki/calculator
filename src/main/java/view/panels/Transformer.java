package view.panels;


import javax.swing.*;
import java.awt.*;

public class Transformer {
    private  final String[] PADKEYS = {  "", "CE", "◁", "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "","0", "." };
    private  JButton[] padkeys = new JButton[PADKEYS.length];
    public JPanel init(){
        JPanel padPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        padPanel.setLayout(new GridLayout(5, 3, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new JButton(PADKEYS[i]);
            padPanel.add(padkeys[i]);
            padkeys[i].setForeground(Color.black);
            padkeys[i].setBackground(Color.WHITE);
        }
        padkeys[0].setEnabled(false);
        padkeys[12].setEnabled(false);

        JPanel transformer=new JPanel();
        transformer.setLayout(new BorderLayout(3, 5));
        transformer.add("South", padPanel);
        return transformer;
    }

}
