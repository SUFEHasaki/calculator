package myComponent.button;

import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class RCLButton extends MyButton {
    public RCLButton(double[] storageArray,StringBuilder postfix, MyTextField resultText,NumberButton[] numberButtons){
        super();
        this.setText("RCL");
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            numberButtons[0].addActionListener(e1 -> {
                storageArray[0] = Double.parseDouble(postfix.toString());
            });
            numberButtons[1].addActionListener(e1 -> {
                storageArray[1] = Double.parseDouble(postfix.toString());
            });
            numberButtons[2].addActionListener(e1 -> {
                storageArray[2] = Double.parseDouble(postfix.toString());
            });
        });
    }
}
