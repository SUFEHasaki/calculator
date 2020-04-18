package view.panels;

import javax.swing.*;
import java.awt.*;

public class Science{
    private final  String[] MEMKEYS = { "MC", "M+", "M-", "MS" };
    private  JButton[] memkeys = new JButton[MEMKEYS.length];
    private final  String[] TRANSKEYS = { "2nd","3rd", "1st"};
    private  JButton[] transkeys = new JButton[TRANSKEYS.length];
    private final  String[] LEFTKEYS1 = { "x²", "x³", "x^y", "10^x", "log", "ln"};
    private final  String[] LEFTKEYS2 = { "2√x", "3√x", "y√x", "2^x", "log_yx", "e^x"};
    private final  String[] LEFTKEYS3 = { "sin", "cos", "tan", "sec", "csc", "cot"};

    private  JButton[] leftkeys = new JButton[LEFTKEYS1.length];
    private final  String[] PADKEYS = { "π", "e", "C", "◁", "1/x", "|x|", "exp",
            "%", "(", ")", "n!", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private  JButton[] padkeys = new JButton[PADKEYS.length];
    private JTextField resultText = new JTextField("0");
    public JPanel init(){
        // 文本框中的内容采用右对齐方式
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        // 不允许修改结果文本框
        resultText.setEditable(false);
        // 设置文本框背景颜色为透明
        resultText.setOpaque(true);
        JPanel memPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        for (int i = 0; i < MEMKEYS.length; i++) {
            memkeys[i] = new JButton(MEMKEYS[i]);
            memPanel.add(memkeys[i]);
            memkeys[i].setForeground(Color.black);
            memkeys[i].setBackground(Color.WHITE);
        }
        for (int i = 0; i < TRANSKEYS.length; i++) {
            transkeys[i] = new JButton(TRANSKEYS[i]);
            transkeys[i].setForeground(Color.BLUE);
            transkeys[i].setBackground(Color.WHITE);
        }
        JPanel leftPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));
        leftPanel.add(transkeys[0]);
        for (int i = 0; i < LEFTKEYS1.length; i++) {
            leftkeys[i] = new JButton(LEFTKEYS1[i]);
            leftPanel.add(leftkeys[i]);
            leftkeys[i].setForeground(Color.black);
            leftkeys[i].setBackground(Color.WHITE);
        }

        JPanel padPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new JButton(PADKEYS[i]);
            padPanel.add(padkeys[i]);
            padkeys[i].setForeground(Color.black);
            padkeys[i].setBackground(Color.WHITE);
        }

        //各种监听器

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout(3, 5));
        buttonPanel.add("North", memPanel);
        buttonPanel.add("Center", padPanel);
        buttonPanel.add("West", leftPanel);

        JPanel science =new JPanel();
        science.setLayout(new BorderLayout(3, 5));
        science.add("South",buttonPanel);
        science.add("Center",resultText);

//        各种监听器
        transkeys[0].addActionListener(e->{
            for (int i = 0; i < LEFTKEYS2.length; i++) {
                leftkeys[i].setText(LEFTKEYS2[i]);
            }
            leftPanel.add(transkeys[1],0);
            leftPanel.remove(transkeys[0]);
            leftPanel.revalidate();
        });
        transkeys[1].addActionListener(e->{
            for (int i = 0; i < LEFTKEYS3.length; i++) {
                leftkeys[i].setText(LEFTKEYS3[i]);
            }
            leftPanel.add(transkeys[2],0);
            leftPanel.remove(transkeys[1]);
            leftPanel.revalidate();
        });
        transkeys[2].addActionListener(e->{
            for (int i = 0; i < LEFTKEYS1.length; i++) {
                leftkeys[i].setText(LEFTKEYS1[i]);
            }
            leftPanel.add(transkeys[0],0);
            leftPanel.remove(transkeys[2]);
            leftPanel.revalidate();
        });
        return science;
    }

}
