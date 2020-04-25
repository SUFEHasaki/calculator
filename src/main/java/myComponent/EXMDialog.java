package myComponent;

import myComponent.button.NumberButton;

import javax.swing.*;
import java.awt.*;

public class EXMDialog extends JDialog {

    public void init(NumberButton[]numberButtons){
        getContentPane().setLayout(new GridLayout(3, 3, 3, 3));
        for (int i=0;i<9;i++){
            JLabel label=new JLabel(String.valueOf(numberButtons[i].getStoNumber()));
            getContentPane().add(label);
        }
        this.setIconImage(new ImageIcon("src/file/Q.png").getImage());
        this.setTitle("存储情况");
        this.setVisible(true);
        this.setLocation(800, 400);
        this.setSize(300,300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
