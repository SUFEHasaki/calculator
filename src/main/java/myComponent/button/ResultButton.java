package myComponent.button;

import myComponent.MyTextField;
import utils.Compute;
import utils.Postfix;

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

            switch (name){
                case "=" :
                    resultText.setText(String.valueOf(ans));
                    if (exp.length()!=0)
                        exp.delete(0,exp.length());
                    break;
                case "1/x" :
                    ans = 1.0/ans; resultText.setText(String.valueOf(ans));
                    exp.delete(0,exp.length());
                    exp.append(ans);
                    break;
                case "n!" :
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
                case "|x|" :
                    ans = Math.abs(ans);
                    resultText.setText(String.valueOf(ans));
                    exp.delete(0,exp.length());
                    exp.append(ans);
                    break;
            }
        });
    }
}
