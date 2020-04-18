package myComponent;

import javax.swing.JComboBox;

public class LengthComboBox extends JComboBox<String> {
    public LengthComboBox(){
        this.addItem("微米");
        this.addItem("毫米");
        this.addItem("厘米");
        this.addItem("米");
        this.addItem("公里");
        this.addItem("英寸");
        this.addItem("英尺");
        this.addItem("英里");
        this.addItem("海里");
    }
}
