package myComponent.button;

import myComponent.MyTextField;
import myComponent.TransLabel;
import utils.Constant;


public class NumberButton extends MyButton {
    public NumberButton(String name){
        super();
        this.setText(name);
//        this.addActionListener(e -> {
//            postfix.append(name);
//            resultText.setText(postfix.toString());
//        });
    }
    public void generalListener(String name,StringBuilder postfix, MyTextField resultText){
        this.addActionListener(e -> {
            postfix.append(name);
            resultText.setText(postfix.toString());
        });
    }
    public void transformerListener(String name, StringBuilder postfix, MyTextField rawText, MyTextField resultText, TransLabel label){
        this.addActionListener(e -> {
            postfix.append(name);
            rawText.setText(postfix.toString());
            double raw=Double.parseDouble(postfix.toString());
            switch (label.getNo()){
                case 0:{resultText.setText(String.valueOf(raw* Constant.CURRENCY[label.getRow()][label.getCol()]));break;}
                case 1:{resultText.setText(String.valueOf(raw* Constant.LENGTH[label.getRow()][label.getCol()]));break;}
                case 2:{resultText.setText(String.valueOf(raw* Constant.MASS[label.getRow()][label.getCol()]));break;}
                case 3:{resultText.setText(String.valueOf(raw* Constant.AREA[label.getRow()][label.getCol()]));break;}
                case 4:{resultText.setText(String.valueOf(raw* Constant.SPEED[label.getRow()][label.getCol()]));break;}
            }
        });
    }
}
