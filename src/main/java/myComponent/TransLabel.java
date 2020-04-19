package myComponent;

import javax.swing.*;

public class TransLabel extends JLabel {
    public TransLabel(JComboBox<String> comboBox1,JComboBox<String> comboBox2){
        this.setText(comboBox1.getItemAt(0)+"="+comboBox2.getItemAt(0));
    }
}
