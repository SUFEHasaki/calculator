package myComponent.button;

import javax.swing.*;
import java.awt.*;

public class ResultButton extends MyButton {
    public ResultButton(String name,String operator,StringBuilder postfix){
        super();
        this.setText(name);
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            postfix.append(operator);
        });
    }
}
