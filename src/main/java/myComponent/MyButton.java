package myComponent;

import javax.swing.JButton;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton(String name,Color c)
    {
       this.setText(name);
       this.setForeground(c);
       this.setBackground(Color.WHITE);
    }
}
