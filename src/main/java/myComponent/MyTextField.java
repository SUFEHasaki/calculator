package myComponent;

import javax.swing.JTextField;

public class MyTextField extends JTextField {
    public MyTextField(String name,int RorL){
        super();
        this.setText(name);
        // 文本框中的内容采用右对齐方式
        this.setHorizontalAlignment(RorL);
        // 不允许修改结果文本框
        this.setEditable(false);
        // 设置文本框背景颜色为透明
        this.setOpaque(true);

    }

}
