package myComponent.button;


import myComponent.EXMDialog;
import myComponent.MyTextField;

public class EXMButton extends MyButton {
    public EXMButton(NumberButton []numberButtons){
        super();
        this.setText("EXM");
        this.addActionListener(e -> {
             new EXMDialog().init(numberButtons);
        });
    }
}
