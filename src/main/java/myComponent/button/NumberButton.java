package myComponent.button;

import myComponent.MyTextField;


public class NumberButton extends MyButton {
    public NumberButton(String name,StringBuilder postfix, MyTextField resultText){
        super();
        this.setText(name);
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            postfix.append(name);
            resultText.setText(postfix.toString());
        });
    }
}
