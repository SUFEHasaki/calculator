package myComponent.comboBox;

import javax.swing.*;

public class UnitsComboBox extends JComboBox<String> {
    public UnitsComboBox(JLabel label){
       super();
        this.addItem("人民币(CNY)");
        this.addItem("美元(USD)");
        this.addItem("英磅(GBP)");
        this.addItem("欧元(EUR)");
        this.addItem("韩元(KRW)");
        this.addItem("日元(JPY)");
        this.addItem("新台币(TWD)");
        this.addItem("澳门币(MOP)");
        this.setSelectedIndex(0);
        label.setText(this.getItemAt(this.getSelectedIndex()));
        this.addActionListener(e -> {
             label.setText(this.getItemAt(this.getSelectedIndex()));
        });
    }

}
