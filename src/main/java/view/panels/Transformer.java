package view.panels;


import javax.swing.*;
import java.awt.*;

public class Transformer {
    private  final String[] PADKEYS = {  "", "CE", "◁", "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "","0", "." };
    private  JButton[] padkeys = new JButton[PADKEYS.length];
    private JComboBox<String> menu=new JComboBox<>();
    private JComboBox<String> currency=new JComboBox<>();
    private JComboBox<String> length=new JComboBox<>();
    private JComboBox<String> mass=new JComboBox<>();
    private JComboBox<String> area=new JComboBox<>();
    private JComboBox<String> temperature=new JComboBox<>();
    private JTextField rawText = new JTextField("0");
    private JTextField resultText = new JTextField();
    public Transformer(){

        menu.addItem("货币");
        menu.addItem("长度");
        menu.addItem("重量");
        menu.addItem("面积");
        menu.addItem("温度");

        currency.addItem("CNY");
        currency.addItem("USD");
        currency.addItem("GBP");
        currency.addItem("EUR");
        currency.addItem("KRW");
        currency.addItem("JPY");
        currency.addItem("TWD");
        currency.addItem("MOP");

        length.addItem("微米");
        length.addItem("毫米");
        length.addItem("厘米");
        length.addItem("米");
        length.addItem("公里");
        length.addItem("英寸");
        length.addItem("英尺");
        length.addItem("英里");
        length.addItem("海里");

        mass.addItem("克");
        mass.addItem("斤");
        mass.addItem("千克");
        mass.addItem("公吨");
        mass.addItem("盎司");
        mass.addItem("磅");
        mass.addItem("克拉");

        area.addItem("平方厘米");
        area.addItem("平方米");
        area.addItem("公顷");
        area.addItem("平方公里");
        area.addItem("平方英寸");
        area.addItem("平方英尺");
        area.addItem("英亩");

        temperature.addItem("华氏度");
        temperature.addItem("摄氏度");
        temperature.addItem("开尔文");

    }
    public JPanel init(){
        JPanel showPanel=new JPanel();
        showPanel.setLayout(new GridLayout(5, 1, 3, 3));
        showPanel.add(menu);
        showPanel.add(rawText);
        showPanel.add(currency);
        showPanel.add(resultText);
        showPanel.add(currency);

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
        transformer.add("Center",showPanel);
        transformer.add("South", padPanel);

        return transformer;
    }

}
