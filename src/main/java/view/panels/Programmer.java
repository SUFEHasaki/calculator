package view.panels;


import javax.swing.*;
import java.awt.*;

public class Programmer{
    private final  String[] MEMKEYS = { "MC", "M+", "M-", "MS" };
    private  JButton[] memkeys = new JButton[MEMKEYS.length];
    private final  String[] RADIX = { "HEX", "DEC", "OCT", "BIN" };
    private JButton[] radix=new JButton[RADIX.length];
    private  final String[] LEFTKEYS = { "A", "B", "C", "D", "E", "F"};
    private  JButton[] leftkeys = new JButton[LEFTKEYS.length];
    private  final String[] PADKEYS = { "<<", ">>", "C", "◁","&","|","!","^", "(", ")", "%", "/","7", "8", "9", "*", "4", "5", "6",
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
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        for (int i = 0; i < MEMKEYS.length; i++) {
            memkeys[i] = new JButton(MEMKEYS[i]);
            memPanel.add(memkeys[i]);
            memkeys[i].setForeground(Color.black);
            memkeys[i].setBackground(Color.WHITE);
        }


        for(int i=0;i<RADIX.length;i++){
            radix[i]=new JButton(RADIX[i]);
            radix[i].setForeground(Color.RED);
            radix[i].setBackground(Color.WHITE);
        }

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));
        leftPanel.add(radix[0]);
        for (int i = 0; i < LEFTKEYS.length; i++) {
            leftkeys[i] = new JButton(LEFTKEYS[i]);
            leftPanel.add(leftkeys[i]);
            leftkeys[i].setForeground(Color.black);
            leftkeys[i].setBackground(Color.WHITE);
        }

        JPanel padPanel = new JPanel();
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new JButton(PADKEYS[i]);
            padPanel.add(padkeys[i]);
            padkeys[i].setForeground(Color.black);
            padkeys[i].setBackground(Color.WHITE);
        }
        padkeys[26].setEnabled(false);

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout(3, 5));
        buttonPanel.add("North",memPanel);
        buttonPanel.add("Center", padPanel);
        buttonPanel.add("West",leftPanel);

        JPanel programmer=new JPanel();
        programmer.setLayout(new BorderLayout(3, 5));
        programmer.add("North",resultText);
        programmer.add("South",buttonPanel);


        //各种监听器
        radix[0].addActionListener(e->{
            for (JButton leftkey:leftkeys){
                leftkey.setEnabled(false);
            }
            leftPanel.add(radix[1],0);
            leftPanel.remove(radix[0]);
            leftPanel.revalidate();
        });
        radix[1].addActionListener(e->{
            padkeys[13].setEnabled(false);
            padkeys[14].setEnabled(false);
            leftPanel.add(radix[2],0);
            leftPanel.remove(radix[1]);
            leftPanel.revalidate();
        });
        radix[2].addActionListener(e->{
            padkeys[12].setEnabled(false);
            padkeys[16].setEnabled(false);
            padkeys[17].setEnabled(false);
            padkeys[18].setEnabled(false);
            padkeys[21].setEnabled(false);
            padkeys[22].setEnabled(false);
            leftPanel.add(radix[3],0);
            leftPanel.remove(radix[2]);
            leftPanel.revalidate();
        });
        radix[3].addActionListener(e->{
            for (JButton leftkey:leftkeys){
                leftkey.setEnabled(true);
            }
            padkeys[13].setEnabled(true);
            padkeys[14].setEnabled(true);
            padkeys[12].setEnabled(true);
            padkeys[16].setEnabled(true);
            padkeys[17].setEnabled(true);
            padkeys[18].setEnabled(true);
            padkeys[21].setEnabled(true);
            padkeys[22].setEnabled(true);
            leftPanel.add(radix[0],0);
            leftPanel.remove(radix[3]);
            leftPanel.revalidate();
        });
        return programmer;
    }
}
