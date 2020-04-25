package myComponent.button;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton(){
        super();
        this.setForeground(Color.black);
        this.setBackground(null);
        this.setOpaque(true);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
    }
}
