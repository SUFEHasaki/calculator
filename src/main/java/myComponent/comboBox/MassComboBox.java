package myComponent.comboBox;

import javax.swing.JComboBox;

public class MassComboBox extends JComboBox<String> {
    public MassComboBox(){
        super();
        this.addItem("克");
        this.addItem("斤");
        this.addItem("千克");
        this.addItem("公吨");
        this.addItem("盎司");
        this.addItem("磅");
        this.addItem("克拉");
    }
}
