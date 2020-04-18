package myComponent.comboBox;

import javax.swing.*;

public class NavigatorMenu extends JComboBox<String> {
    public NavigatorMenu(){
        super();
        this.addItem("科学计算器");
        this.addItem("程序员计算器");
        this.addItem("转换器");

    }
}
