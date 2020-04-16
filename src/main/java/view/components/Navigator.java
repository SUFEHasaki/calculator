package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navigator extends JFrame {
    /** 计算结果文本框 */
    private JTextField resultText = new JTextField("0");
    private JComboBox menu=new JComboBox();
    public JPanel init(){
        // 文本框中的内容采用右对齐方式
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        // 不允许修改结果文本框
        resultText.setEditable(false);
        // 设置文本框背景颜色为透明
        resultText.setOpaque(true);

        menu.addItem("科学计算器");
        menu.addItem("程序员计算器");
        menu.addItem("转换器");
//        menu.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(menu.getSelectedIndex());
//               int index=menu.getSelectedIndex();
//               switch (index){
//                   case 0:break;
//                   case 1:break;
//                   case 2:break;
//               }
//            }
//        });
        JPanel navigator=new JPanel();
       navigator.setLayout(new BorderLayout(3, 5));
       navigator.add("North",menu);
       navigator.add("Center",resultText);
       return navigator;
    }
}
