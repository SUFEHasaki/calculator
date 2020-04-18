package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navigator{
    /** 计算结果文本框 */
//    private JTextField resultText = new JTextField("0");
    private JComboBox<String> menu=new JComboBox<>();
    public JComboBox<String> getMenu(){
        return menu;
    }
    public JPanel init(){
        // 文本框中的内容采用右对齐方式
//        resultText.setHorizontalAlignment(JTextField.RIGHT);
//        // 不允许修改结果文本框
//        resultText.setEditable(false);
//        // 设置文本框背景颜色为透明
//        resultText.setOpaque(true);
        menu.addItem("科学计算器");
        menu.addItem("程序员计算器");
        menu.addItem("转换器");
        JPanel navigator=new JPanel();
       navigator.setLayout(new BorderLayout(3, 5));
       navigator.add("North",menu);
//       navigator.add("Center",resultText);
       return navigator;
    }
}
