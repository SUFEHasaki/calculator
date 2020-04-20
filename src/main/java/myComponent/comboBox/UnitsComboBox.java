package myComponent.comboBox;

import lombok.Data;
import myComponent.TransLabel;
import utils.Constant;

import javax.swing.*;
import java.awt.event.ItemEvent;

@Data
public class UnitsComboBox extends JComboBox<String> {
    public UnitsComboBox(TransLabel label){
       super();
//        this.addItem("人民币(CNY)");
//        this.addItem("美元(USD)");
//        this.addItem("英磅(GBP)");
//        this.addItem("欧元(EUR)");
//        this.addItem("韩元(KRW)");
//        this.addItem("日元(JPY)");
//        this.addItem("新台币(TWD)");
//        this.addItem("澳门币(MOP)");
//        this.setSelectedIndex(0);
//        label.updateText();
    }
    public void addFormerText(TransLabel label){
        this.addItemListener(e -> {
            if(e.getStateChange()== ItemEvent.SELECTED){
                label.setFormerText("1 "+this.getItemAt(this.getSelectedIndex()));
                label.setRow(this.getSelectedIndex());
                label.updateText();
            }

        });
    }
    public void addLatterText(TransLabel label){
        this.addItemListener(e -> {
            if(e.getStateChange()== ItemEvent.SELECTED){
                label.setLatterText(this.getItemAt(this.getSelectedIndex()));
                label.setCol(this.getSelectedIndex());
                label.updateText();
            }
        });
    }

}
