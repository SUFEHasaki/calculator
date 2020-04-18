package view.panels;

import myComponent.MyButton;
import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class Science{
    private final  String[] MEMKEYS = { "MC", "M+", "M-", "MS" };
    private  MyButton[] memkeys = new MyButton[MEMKEYS.length];
    private final  String[] TRANSKEYS = { "2nd","3rd", "1st"};
    private  MyButton[] transkeys = new MyButton[TRANSKEYS.length];
    private final  String[] LEFTKEYS1 = { "x²", "x³", "x^y", "10^x", "log", "ln"};
    private final  String[] LEFTKEYS2 = { "2√x", "3√x", "y√x", "2^x", "log_yx", "e^x"};
    private final  String[] LEFTKEYS3 = { "sin", "cos", "tan", "sec", "csc", "cot"};

    private  MyButton[] leftkeys = new MyButton[LEFTKEYS1.length];
    private final  String[] PADKEYS = { "π", "e", "C", "◁", "1/x", "|x|", "exp",
            "%", "(", ")", "n!", "/","7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "+/-","0", ".","=" };
    private  MyButton[] padkeys = new MyButton[PADKEYS.length];
    private MyTextField resultText = new MyTextField("0");
    public Science(){

    }
    public JPanel init(){
        JPanel memPanel = new JPanel();
        // 用网格布局器，1行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素,下同
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        for (int i = 0; i < MEMKEYS.length; i++) {
            memkeys[i] = new MyButton(MEMKEYS[i],Color.black);
            memPanel.add(memkeys[i]);
        }


        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));
        for (int i = 0; i < TRANSKEYS.length; i++) {
            transkeys[i] = new MyButton(TRANSKEYS[i],Color.BLUE);
        }
        leftPanel.add(transkeys[0]);
        for (int i = 0; i < LEFTKEYS1.length; i++) {
            leftkeys[i] = new MyButton(LEFTKEYS1[i],Color.black);
            leftPanel.add(leftkeys[i]);
        }

        JPanel padPanel = new JPanel();
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new MyButton(PADKEYS[i],Color.black);
            padPanel.add(padkeys[i]);
        }

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
