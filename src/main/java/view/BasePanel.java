package view;

//import view.components.Navigator;
import view.panels.Programmer;
import view.panels.Science;
import view.panels.Transformer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JFrame {
    public static void main(String[] args) {
     new BasePanel().setVisible(true);
    }
    /** 计算结果文本框 */
    private JTextField resultText = new JTextField("0");
    private JComboBox menu=new JComboBox();
    private Science science=new Science();
    private Programmer programmer=new Programmer();
    private Transformer transformer=new Transformer();
//    private Navigator navigator=new Navigator();
    public BasePanel(){
        super();
        // 初始化计算器
        init();
        // 设置计算器的背景颜色
        this.setBackground(Color.LIGHT_GRAY);
        this.setTitle("Q宝");
        // 在屏幕(500, 300)坐标处显示计算器
        this.setLocation(500, 300);
        // 不许修改计算器的大小
        this.setResizable(false);
        // 使计算器中各组件大小合适
        this.pack();
        //关闭退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        Container container=getContentPane();
        container.setLayout(new BorderLayout(3, 5));
        // 文本框中的内容采用右对齐方式
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        // 不允许修改结果文本框
        resultText.setEditable(false);
        // 设置文本框背景颜色为透明
        resultText.setOpaque(true);
        menu.addItem("科学计算器");
        menu.addItem("程序员计算器");
        menu.addItem("转换器");
        menu.addActionListener(e -> {
//            System.out.println(menu.getSelectedIndex());
           int index=menu.getSelectedIndex();
           switch (index){
               case 0:{
//                   System.out.println(index);
//                   System.out.println(container.getComponent(0));
                   container.remove(1);
                   container.add("South", science.init());
                   container.revalidate();
                   break;
               }
               case 1:{
//                   System.out.println(index);
                   container.remove(1);
                   container.add("South", programmer.init());
                   container.revalidate();
                   break;
               }
               case 2:{
//                   System.out.println(index);
                   container.remove(1);
                   container.add("South", transformer.init());
                   container.revalidate();
                   break;
               }
           }
        });
        JPanel navigator=new JPanel();
        navigator.setLayout(new BorderLayout(3, 5));
        navigator.add("North",menu);
        navigator.add("Center",resultText);
        // 整体布局

        container.add("North", navigator);
        container.add("South", science.init());
        // 为各按钮添加事件侦听器

    }
}
