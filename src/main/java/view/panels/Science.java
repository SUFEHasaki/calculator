package view.panels;

import myComponent.button.*;
import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class Science{
    private StringBuilder postfix = new StringBuilder();
    private MyTextField resultText = new MyTextField("0",4);
    private MCButton mcButton=new MCButton();
    private MplusButton mplusButton=new MplusButton();
    private MminusButton mminusButton=new MminusButton();
    private MSButton msButton=new MSButton();
    private ClearButton clearButton=new ClearButton(postfix,resultText);
    private DeleteButton deleteButton=new DeleteButton();
    private final String[] RESULTKEYS={"1/x","|x|","n!","="};
    private ResultButton[] resultButtons=new ResultButton[RESULTKEYS.length];//1/x,|x|,exp,n!,=
    private final  String[] NUMBERKEYS = { "7", "8", "9", "4", "5", "6","1","2","3","0", "π", "e","-"};
    private NumberButton[] numberButtons=new NumberButton[NUMBERKEYS.length];//0,1,2,3,4,5,6,7,8,9
    private PointButton pointButton=new PointButton(postfix,resultText);
    private final  String[] TRANSKEYS = { "1st","2nd","3rd"};
    private  TransButton[] transkeys = new TransButton[TRANSKEYS.length];
    private final  String[] OPERATORKEYS = { "x²", "x³", "x^y", "10^x", "log",
            "ln","2√x", "3√x", "y√x", "2^x",
            "log_yx", "e^x","sin", "cos", "tan",
            "sec", "csc", "cot", "exp","(", ")",
            "%", "/", "*", "-", "+"};
    private final  String[] OPERATORS = { "^2", "^3", "^", "10^", "log(", "ln(","2√", "3√", "√", "2^", "log_yx", "e^","sin(", "cos(", "tan(", "sec(", "csc(", "cot(", "*10^","(", ")", "%", "/", "*", "-", "+"};

    private OperatorButton[] operatorButtons=new OperatorButton[OPERATORKEYS.length];
//    private  GeneralButton[] leftkeys = new GeneralButton[LEFTKEYS1.length];


    public Science(){

    }
    public JPanel init(){
        //      初始化5个结果按钮
        for (int i = 0; i <RESULTKEYS.length; i++) {
            resultButtons[i] = new ResultButton(RESULTKEYS[i],postfix);
        //      初始化10个数字按钮
        }
        for (int i = 0; i <NUMBERKEYS.length; i++) {
            numberButtons[i] = new NumberButton(NUMBERKEYS[i],postfix,resultText);
        }
       //        初始化27个运算符按钮
        for (int i = 0; i <OPERATORKEYS.length; i++) {
            operatorButtons[i] = new OperatorButton(OPERATORKEYS[i],OPERATORS[i],postfix,resultText,pointButton);
        }
        //       初始化3个运算符变换按钮
        for (int i = 0; i < TRANSKEYS.length; i++) {
            transkeys[i] = new TransButton(TRANSKEYS[i]);
        }

        JPanel memPanel = new JPanel();
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        memPanel.add(mcButton);
        memPanel.add(mplusButton);
        memPanel.add(mminusButton);
        memPanel.add(msButton);

        JPanel padPanel = new JPanel();
        padPanel.setBackground(Color.WHITE);
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        padPanel.add(resultButtons[0]);padPanel.add(resultButtons[1]);padPanel.add(clearButton);padPanel.add(deleteButton);
        padPanel.add(resultButtons[2]);padPanel.add(operatorButtons[18]);padPanel.add(numberButtons[10]);padPanel.add(numberButtons[11]);
        padPanel.add(operatorButtons[19]);padPanel.add(operatorButtons[20]);padPanel.add(operatorButtons[21]);padPanel.add(operatorButtons[22]);
        padPanel.add(numberButtons[0]);padPanel.add(numberButtons[1]);padPanel.add(numberButtons[2]);padPanel.add(operatorButtons[23]);
        padPanel.add(numberButtons[3]);padPanel.add(numberButtons[4]);padPanel.add(numberButtons[5]);padPanel.add(operatorButtons[24]);
        padPanel.add(numberButtons[6]);padPanel.add(numberButtons[7]);padPanel.add(numberButtons[8]);padPanel.add(operatorButtons[25]);
        padPanel.add(numberButtons[12]);padPanel.add(numberButtons[9]);padPanel.add(pointButton);padPanel.add(resultButtons[3]);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));

        leftPanel.add(transkeys[0]);
        for(int i=0;i<6;i++){
            leftPanel.add(operatorButtons[i]);
        }



        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout(3, 5));
        buttonPanel.add("North", memPanel);
        buttonPanel.add("Center", padPanel);
        buttonPanel.add("West", leftPanel);

        JPanel science =new JPanel();
        science.setLayout(new BorderLayout(3, 5));
        science.add("South",buttonPanel);
        science.add("Center",resultText);

//        各种监听器

        transkeys[0].addActionListener(e->{
            for (int i = 0; i < 6; i++) {
                leftPanel.remove(i+1);
                leftPanel.add(operatorButtons[i+6],i+1);
            }
            leftPanel.add(transkeys[1],0);
            leftPanel.remove(transkeys[0]);
            leftPanel.revalidate();
        });
        transkeys[1].addActionListener(e->{
            for (int i = 0; i < 6; i++) {
                leftPanel.remove(i+1);
                leftPanel.add(operatorButtons[i+12],i+1);
            }
            leftPanel.add(transkeys[2],0);
            leftPanel.remove(transkeys[1]);
            leftPanel.revalidate();
        });
        transkeys[2].addActionListener(e->{
            for (int i = 0; i < 6; i++) {
                leftPanel.remove(i+1);
                leftPanel.add(operatorButtons[i],i+1);
            }
            leftPanel.add(transkeys[0],0);
            leftPanel.remove(transkeys[2]);
            leftPanel.revalidate();
        });
        return science;
    }

}
