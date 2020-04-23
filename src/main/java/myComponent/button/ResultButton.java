package myComponent.button;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;

import myComponent.MyTextField;
import java.text.DecimalFormat;
import utils.*;

public class ResultButton extends MyButton {
    public ResultButton(String name,StringBuilder exp, MyTextField resultText){
        super();
        this.setText(name);
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
     //       exp.append(operator);
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
}
