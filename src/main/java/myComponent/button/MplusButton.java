package myComponent.button;

import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class MplusButton extends MyButton {
    public MplusButton(double[] storageArray, StringBuilder postfix, MyTextField resultText, NumberButton[] numberButtons){
        super();
        this.setText("M+");
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            numberButtons[0].addActionListener(e1 -> {
                postfix.append(storageArray[0]);
                resultText.setText(postfix.toString());
            });
            numberButtons[1].addActionListener(e1 -> {
                postfix.append(storageArray[1]);
                resultText.setText(postfix.toString());
            });
            numberButtons[2].addActionListener(e1 -> {
                postfix.append(storageArray[2]);
                resultText.setText(postfix.toString());
            });

        });
    }
}
