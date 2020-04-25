package myComponent.button;

import lombok.Getter;
import lombok.Setter;
import myComponent.MyTextField;
import java.text.DecimalFormat;
import utils.*;

@Getter
@Setter
public class ResultButton extends MyButton {

    private int system=16;
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

    public void programmerListener(String name,StringBuilder exp, MyTextField resultText){
        this.addActionListener(e -> {
            HexBinDecOct hexBinDecOct = new HexBinDecOct();
            StringBuilder s = new StringBuilder();
            s.append(hexBinDecOct.Convertion(10,system,exp));
            Postfix expe = new Postfix(s.toString());
            String postfix =  expe.nifixToPostfix();
            Compute compute = new Compute(postfix);
            double ans = compute.compute();
       //     final DecimalFormat df1 = new DecimalFormat( "#.00000" );
            switch (name){
                case "=":
                    ans = (int)ans;
                    break;
                case "<<":
                    ans = (int)ans << 1;
                    break;
                case ">>":
                    ans = (int)ans >> 1;
                    break;
            }

            exp.delete(0,exp.length());
            exp.append(ans);
            s.delete(0,s.length());
            s.append(hexBinDecOct.Convertion(system,10,exp));
            exp.delete(0,exp.length());
            exp.append(s);
            resultText.setText(exp.toString());
        });
    }
}
