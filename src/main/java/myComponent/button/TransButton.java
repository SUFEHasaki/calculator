package myComponent.button;

import javax.swing.*;
import java.awt.*;

public class TransButton extends JButton {
    public TransButton(String name){
        this.setText(name);
        this.setForeground(Color.BLUE);
        this.setBackground(Color.WHITE);
    }
}
