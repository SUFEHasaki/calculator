package myComponent.comboBox;

import lombok.Data;
import myComponent.MyTextField;
import myComponent.TransLabel;
import utils.Constant;

import javax.swing.*;
import java.awt.event.ItemEvent;

//@Data
public class UnitsComboBox extends JComboBox<String> {
    public UnitsComboBox(){
       super();
    }
    public void formerTextListener(MyTextField rawText,MyTextField resultText,TransLabel label){
        this.addItemListener(e -> {
            if(e.getStateChange()== ItemEvent.SELECTED){
                label.setFormerText("1 "+this.getItemAt(this.getSelectedIndex()));
                label.setRow(this.getSelectedIndex());
                label.updateText();
                double raw=Double.parseDouble(rawText.getText());
                switch (label.getNo()){
                    case 0:{resultText.setText(String.valueOf(raw* Constant.CURRENCY[label.getRow()][label.getCol()]));break;}
                    case 1:{resultText.setText(String.valueOf(raw* Constant.LENGTH[label.getRow()][label.getCol()]));break;}
                    case 2:{resultText.setText(String.valueOf(raw* Constant.MASS[label.getRow()][label.getCol()]));break;}
                    case 3:{resultText.setText(String.valueOf(raw* Constant.AREA[label.getRow()][label.getCol()]));break;}
                    case 4:{resultText.setText(String.valueOf(raw* Constant.SPEED[label.getRow()][label.getCol()]));break;}
                }
            }

        });
    }
    public void latterTextListener(MyTextField rawText,MyTextField resultText,TransLabel label){
        this.addItemListener(e -> {
            if(e.getStateChange()== ItemEvent.SELECTED){
                label.setLatterText(this.getItemAt(this.getSelectedIndex()));
                label.setCol(this.getSelectedIndex());
                label.updateText();
                double raw=Double.parseDouble(rawText.getText());
                switch (label.getNo()){
                    case 0:{resultText.setText(String.valueOf(raw* Constant.CURRENCY[label.getRow()][label.getCol()]));break;}
                    case 1:{resultText.setText(String.valueOf(raw* Constant.LENGTH[label.getRow()][label.getCol()]));break;}
                    case 2:{resultText.setText(String.valueOf(raw* Constant.MASS[label.getRow()][label.getCol()]));break;}
                    case 3:{resultText.setText(String.valueOf(raw* Constant.AREA[label.getRow()][label.getCol()]));break;}
                    case 4:{resultText.setText(String.valueOf(raw* Constant.SPEED[label.getRow()][label.getCol()]));break;}
                }
            }
        });
    }

}
