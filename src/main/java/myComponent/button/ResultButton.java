package myComponent.button;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;

import myComponent.MyTextField;
import util.*;

public class ResultButton extends MyButton {
    public ResultButton(String name,String operator,StringBuilder exp, MyTextField resultText){
        super();
        this.setText(name);
//        this.setForeground(Color.black);
//        this.setBackground(Color.WHITE);
        this.addActionListener(e -> {
     //       exp.append(operator);
            Postfix postfix = new Postfix(exp.toString());
            Compute compute = new Compute(postfix.nifixToPostfix());
            double ans = compute.compute();

            switch (operator){
                case "=" :
                    resultText.setText(String.valueOf(ans));
                    if (exp.length()!=0)
                        exp.delete(0,exp.length());
                    break;
                case "?" :
                    ans = 1/ans; resultText.setText(String.valueOf(ans));
                    exp.delete(0,exp.length());
                    exp.append(ans);
                    break;
                case "!" :
                    int temp = 1, num = 1;
                    while (temp <= ans) {
                        num=num*temp;
                        temp++;
                    }
                    ans = num;
                    resultText.setText(String.valueOf(ans));
                    exp.delete(0,exp.length());
                    exp.append(ans);
                    break;
                case "abs" :
                    ans = Math.abs(ans);
                    resultText.setText(String.valueOf(ans));
                    exp.delete(0,exp.length());
                    exp.append(ans);
                    break;
                case "exp" :
                    resultText.setText(String.valueOf(ans)+"*10^");
                    exp.delete(0,exp.length());
                    exp.append(String.valueOf(ans)+"*10^");
                    break;
            }
        });
    }
}
