package view;

import view.components.Navigator;
import view.panels.Science;

import javax.swing.*;
import java.awt.*;

public class BasePanel extends JFrame {
    public static void main(String[] args) {
     new BasePanel().setVisible(true);
    }
    /** 计算结果文本框 */
    private JTextField resultText = new JTextField("0");
    private Science science=new Science();
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
        // 不许修改计算器的大小
        this.setResizable(false);
        // 使计算器中各组件大小合适
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){

        // 整体布局
        getContentPane().setLayout(new BorderLayout(3, 5));
        getContentPane().add("North", navigator.init());
//        getContentPane().add("Center", panel1);
        getContentPane().add("South", science.init());
        // 为各按钮添加事件侦听器

    }
}
