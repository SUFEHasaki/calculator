package myComponent.button;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;

import myComponent.MyTextField;
import java.text.DecimalFormat;
import myComponent.MyTextField;
import myComponent.TransLabel;
import utils.*;

public class ResultButton extends MyButton {
    public ResultButton(String name){
        super();
        this.setText(name);
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);

//        this.addActionListener(e -> {
//     //       exp.append(operator);
//            Postfix postfix = new Postfix(exp.toString());
//            Compute compute = new Compute(postfix.nifixToPostfix());
//            double ans = compute.compute();
//            final DecimalFormat df1 = new DecimalFormat( "#.########" );
//            switch (name){
//
//                case "=" :
//                    resultText.setText(df1.format(ans));
//                    if (exp.length()!=0)
//                        exp.delete(0,exp.length());
//                    break;
//                case "1/x" :
//                    ans = 1.0/ans; resultText.setText(df1.format(ans));
//                    exp.delete(0,exp.length());
//                    exp.append(df1.format(ans));
//                    break;
//                case "n!" :
//                    int temp = 1, num = 1;
//                    while (temp <= ans) {
//                        num=num*temp;
//                        temp++;
//                    }
//                    ans = num;
//                    resultText.setText(df1.format(ans));
//                    exp.delete(0,exp.length());
//                    exp.append(df1.format(ans));
//                    break;
//                case "|x|" :
//                    ans = Math.abs(ans);
//                    resultText.setText(df1.format(ans));
//                    exp.delete(0,exp.length());
//                    exp.append(df1.format(ans));
//                    break;
//            }
//        });
    }
    public void scienceListener(String name,StringBuilder exp, MyTextField resultText){
        this.addActionListener(e -> {
            Postfix postfix = new Postfix(exp.toString());
            Compute compute = new Compute(postfix.nifixToPostfix());
            double ans = compute.compute();
            final DecimalFormat df1 = new DecimalFormat( "#.########" );
            switch (name){

                case "=" :
                    resultText.setText(df1.format(ans));
                    if (exp.length()!=0)
                        exp.delete(0,exp.length());
                    break;
                case "1/x" :
                    ans = 1.0/ans; resultText.setText(df1.format(ans));
                    exp.delete(0,exp.length());
                    exp.append(df1.format(ans));
                    break;
                case "n!" :
                    int temp = 1, num = 1;
                    while (temp <= ans) {
                        num=num*temp;
                        temp++;
                    }
                    ans = num;
                    resultText.setText(df1.format(ans));
                    exp.delete(0,exp.length());
                    exp.append(df1.format(ans));
                    break;
                case "|x|" :
                    ans = Math.abs(ans);
                    resultText.setText(df1.format(ans));
                    exp.delete(0,exp.length());
                    exp.append(df1.format(ans));
                    break;
            }

        });
    }

    public void programmerListener(String name,StringBuilder exp, MyTextField resultText,int current){
        this.addActionListener(e -> {
            HexBinDecOct hexBinDecOct = new HexBinDecOct();
            System.out.println(current);
            StringBuilder s = hexBinDecOct.Convertion(10,current,exp);
            Postfix expe = new Postfix(s.toString());
            String postfix =  expe.nifixToPostfix();
            Compute compute = new Compute(postfix);
            double ans = compute.compute();
            final DecimalFormat df1 = new DecimalFormat( "#.########" );
            switch (name){
                case "=":
                    break;
                case "<<":
                    ans = (int)ans << 1;
                case ">>":
                    ans = (int)ans >> 1;
            }

            exp.delete(0,exp.length());
            exp.append(ans);
            s = hexBinDecOct.Convertion(current,10,exp);
            exp.delete(0,exp.length());
            exp.append(s);
            resultText.setText(s.toString());
        });
    }
}
