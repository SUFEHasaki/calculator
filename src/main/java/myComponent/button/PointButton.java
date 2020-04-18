package myComponent.button;

import myComponent.MyTextField;

public class PointButton extends MyButton {
    public PointButton(StringBuilder postfix, MyTextField resultText){
        super();
        this.setText(".");
        this.addActionListener(e -> {
            this.setEnabled(false);
            postfix.append(".");
            resultText.setText(postfix.toString());
        });
    }
}
