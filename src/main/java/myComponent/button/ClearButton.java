package myComponent.button;

import myComponent.MyTextField;

public class ClearButton extends MyButton {
    public ClearButton(){
        super();
        this.setText("C");
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
//        this.addActionListener(e -> {
//            //注意处理.的情况
//            postfix.delete(0,postfix.length());
//            resultText.setText("0");
//        });
    }
    public void generalListener(StringBuilder postfix, MyTextField resultText){
        this.addActionListener(e -> {
            //注意处理.的情况
            postfix.delete(0,postfix.length());
            resultText.setText("0");
        });
    }
    public void transformerListener(StringBuilder postfix, MyTextField rawText,MyTextField resultText){
        this.addActionListener(e -> {
            //注意处理.的情况
            postfix.delete(0,postfix.length());
            rawText.setText("0");
            resultText.setText("");
        });
    }
}
