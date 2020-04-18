package myComponent;

import javax.swing.JComboBox;

public class AreaComboBox extends JComboBox<String> {
    public AreaComboBox(){
        this.addItem("平方厘米");
        this.addItem("平方米");
        this.addItem("公顷");
        this.addItem("平方公里");
        this.addItem("平方英寸");
        this.addItem("平方英尺");
        this.addItem("英亩");
    }

}
