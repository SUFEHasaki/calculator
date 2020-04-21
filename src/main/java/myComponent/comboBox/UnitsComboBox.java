package myComponent.comboBox;

import lombok.Data;
import myComponent.TransLabel;
import utils.Constant;

import javax.swing.*;
import java.awt.event.ItemEvent;

//@Data
public class UnitsComboBox extends JComboBox<String> {
    public UnitsComboBox(){
       super();
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
