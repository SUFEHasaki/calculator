package myComponent.comboBox;

import javax.swing.JComboBox;

public class SpeedComboBox extends JComboBox<String> {
    public SpeedComboBox(){
        super();
        this.addItem("米/秒");
        this.addItem("公里/小时");
        this.addItem("英里/小时");
        this.addItem("节");
    }
}
