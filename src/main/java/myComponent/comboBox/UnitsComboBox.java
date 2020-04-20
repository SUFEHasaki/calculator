package myComponent.comboBox;

import myComponent.TransLabel;
import utils.Constant;

import javax.swing.*;

public class UnitsComboBox extends JComboBox<String> {
    private short no=0;
    public UnitsComboBox(){
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
    }
    public void addFormText(TransLabel label){

        this.addActionListener(e -> {
            label.setFormerText("1 "+this.getItemAt(this.getSelectedIndex()));
            label.updateText();
        });
    }
    public void addLatterText(TransLabel label,UnitsComboBox unitsComboBox){
        this.addActionListener(e -> {
            unitsComboBox.getSelectedIndex();
            this.getSelectedIndex();

            label.setLatterText(this.getItemAt(this.getSelectedIndex()));
            label.updateText();
        });
    }

}
