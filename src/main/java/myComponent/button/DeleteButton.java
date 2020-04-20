package myComponent.button;

import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class DeleteButton extends MyButton {
    public DeleteButton(StringBuilder postfix, MyTextField resultText){
        super();
        this.setText("◁");
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            int len = postfix.length();
            if (len>=3) {
                if (postfix.charAt(len - 3) == 's' && postfix.charAt(len - 2) == 'i' && postfix.charAt(len - 1) == 'n' )
                    postfix.delete(postfix.length() - 3, postfix.length());
                else
                    postfix.delete(len - 1, len);
                resultText.setText(postfix.toString());
            }
            else if(len == 1){
                    postfix.delete(len - 1, len);
                    resultText.setText("0");
                }
                else if (len == 0)
                    resultText.setText("0");
                else {
                    postfix.delete(len - 1, len);
                    resultText.setText(postfix.toString());
            }

        });
    }
}
