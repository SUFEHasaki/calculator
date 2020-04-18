package myComponent.button;

import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class RadixButton extends JButton {
    public RadixButton(String name,StringBuilder postfix, MyTextField resultText){
        this.setText(name);
        this.setForeground(Color.RED);
        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            //进制转换逻辑
        });
    }
}
