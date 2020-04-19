package myComponent.button;

import myComponent.MyTextField;

public class ClearButton extends MyButton {
    public ClearButton(StringBuilder postfix, MyTextField resultText){
        super();
        this.setText("C");
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
            //注意处理.的情况
            postfix.delete(0,postfix.length());
            resultText.setText("0");
        });
    }
}
