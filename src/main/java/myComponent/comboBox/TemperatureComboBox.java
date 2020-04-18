package myComponent.comboBox;

import javax.swing.JComboBox;

public class TemperatureComboBox extends JComboBox<String> {
    public TemperatureComboBox(){
        super();
        this.addItem("华氏度");
        this.addItem("摄氏度");
        this.addItem("开尔文");
    }
}
