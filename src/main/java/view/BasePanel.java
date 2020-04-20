package view;

import view.panels.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JFrame{
    public static void main(String[] args) {
        new BasePanel().setVisible(true);
    }
    /** 计算结果文本框 */
    private Science science=new Science();
    private Programmer programmer=new Programmer();
    private Transformer transformer=new Transformer();
    private Navigator navigator=new Navigator();
    public BasePanel(){
        super();
        // 初始化计算器
        init();
        // 设置计算器的背景颜色
        this.setBackground(Color.LIGHT_GRAY);
        this.setTitle("Q宝");
        // 在屏幕(500, 300)坐标处显示计算器
        this.setLocation(500, 300);
        this.setSize(350,400);
        // 不许修改计算器的大小
        this.setResizable(false);
        // 使计算器中各组件大小合适
//        this.pack();
        //关闭退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        Container container=getContentPane();
        container.setLayout(new BorderLayout(3, 5));
        container.add("North", navigator.init());
        container.add("South", science.init());
        navigator.getMenu().addActionListener(e -> {
            switch (navigator.getMenu().getSelectedIndex()){
                case 0:{
                    container.remove(1);
                    container.add("South", science.init());
                    container.revalidate();
                    break;
                }
                case 1:{
                    container.remove(1);
                    container.add("South", programmer.init());
                    container.revalidate();
                    break;
                }
                case 2:{
                    container.remove(1);
                    container.add("South", transformer.init());
                    container.revalidate();
                    break;
                }
            }
        });
    }

}
