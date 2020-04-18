package myComponent;

import javax.swing.JComboBox;

public class TransMenu extends JComboBox<String> {
    public TransMenu(){
        this.addItem("货币");
        this.addItem("长度");
        this.addItem("重量");
        this.addItem("面积");
        this.addItem("温度");
    }
}
