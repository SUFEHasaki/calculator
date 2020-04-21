package myComponent.button;

import myComponent.MyTextField;
import myComponent.TransLabel;
import utils.Constant;

import javax.swing.*;
import java.awt.*;

public class DeleteButton extends MyButton {
    public DeleteButton(){
        super();
        this.setText("◁");
//        this.addActionListener(e -> {
//            int len = postfix.length();
//            if (len>=3) {
////                postfix.substring(postfix.length()-3);
//                if (postfix.charAt(len - 3) == 's' && postfix.charAt(len - 2) == 'i' && postfix.charAt(len - 1) == 'n' )
//                    postfix.delete(postfix.length() - 3, postfix.length());
//                else
//                    postfix.delete(len - 1, len);
//                resultText.setText(postfix.toString());
//            }
//            else if(len == 1){
//                    postfix.delete(len - 1, len);
//                    resultText.setText("0");
//                }
//                else if (len == 0)
//                    resultText.setText("0");
//                else {
//                    postfix.delete(len - 1, len);
//                    resultText.setText(postfix.toString());
//            }
//
//        });
    }
    public void generalListener(StringBuilder postfix, MyTextField resultText){
        this.addActionListener(e -> {
            int len = postfix.length();
            if (len>=3) {
//                postfix.substring(postfix.length()-3);
                if (postfix.charAt(len - 3) == 's' && postfix.charAt(len - 2) == 'i' && postfix.charAt(len - 1) == 'n' )
                    postfix.delete(postfix.length() - 3, postfix.length());
                else
                    postfix.delete(len - 1, len);
                resultText.setText(postfix.toString());
            }
            else if(len == 1){
                postfix.delete(len - 1, len);
                resultText.setText("0");
            }
            else if (len == 0)
                resultText.setText("0");
            else {
                postfix.delete(len - 1, len);
                resultText.setText(postfix.toString());
            }

        });
    }
    public void transformerListener(StringBuilder postfix, MyTextField rawText,MyTextField resultText, TransLabel label){
        this.addActionListener(e -> {
            int len = postfix.length();
            switch (len){
                case 0:break;
                case 1: postfix.delete(len - 1, len);rawText.setText("0");break;
                default:postfix.delete(len - 1, len);rawText.setText(postfix.toString());break;
            }
            double raw=Double.parseDouble(rawText.getText());
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
