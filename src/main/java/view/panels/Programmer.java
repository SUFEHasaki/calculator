package view.panels;


import myComponent.button.*;
import myComponent.MyTextField;

import javax.swing.*;
import java.awt.*;

public class Programmer{
    private StringBuilder postfix = new StringBuilder();
    private MyTextField resultText = new MyTextField("0",4);
    private RSTButton rstButton=new RSTButton();
    private RCLButton rclButton=new RCLButton();
    private EXMButton exmButton=new EXMButton();
    private STOButton stoButton =new STOButton();
    private ClearButton clearButton=new ClearButton(postfix,resultText);
    private DeleteButton deleteButton=new DeleteButton();
    private final String[] RESULTKEYS={"<<",">>","="};
    private ResultButton[] resultButtons=new ResultButton[3];
    private final  String[] NUMBERKEYS = { "7", "8", "9", "4", "5", "6","1","2","3","0", "A", "B","C","D","E","F","-"};
    private NumberButton[] numberButtons=new NumberButton[NUMBERKEYS.length];
    private final  String[] RADIXKEYS = {"HEX", "DEC", "OCT", "BIN"};
    private  RadixButton[] radixButtons = new RadixButton[RADIXKEYS.length];
    private  final String[] OPERATORKEYS = { "&","|","!","^", "(", ")", "%", "/", "*", "-",  "+", "." };
    private final  String[] OPERATORS ={"&","|","!","^", "(", ")", "%", "/", "*", "-",  "+","."};
    private  OperatorButton[] operatorButtons = new OperatorButton[OPERATORKEYS.length];

    public Programmer(){

    }
    public JPanel init(){
        //      初始化5个结果按钮
        for (int i = 0; i <RESULTKEYS.length; i++) {
            resultButtons[i] = new ResultButton(RESULTKEYS[i],postfix);
            //      初始化16个数字按钮
        }
        for (int i = 0; i <NUMBERKEYS.length; i++) {
            numberButtons[i] = new NumberButton(NUMBERKEYS[i],postfix,resultText);
        }
        //        初始化13个运算符按钮
        for (int i = 0; i <OPERATORKEYS.length; i++) {
            operatorButtons[i] = new OperatorButton(OPERATORKEYS[i],OPERATORS[i],postfix,resultText,null);
        }
        //       初始化4个运算符变换按钮
        for (int i = 0; i < RADIXKEYS.length; i++) {
            radixButtons[i] = new RadixButton(RADIXKEYS[i],postfix,resultText);
        }

        JPanel memPanel = new JPanel();
        memPanel.setLayout(new GridLayout(1, 4, 3, 3));
        memPanel.add(rstButton);
        memPanel.add(exmButton);
        memPanel.add(rclButton);
        memPanel.add(stoButton);

        JPanel padPanel = new JPanel();
        padPanel.setLayout(new GridLayout(7, 4, 3, 3));
        padPanel.add(resultButtons[0]);padPanel.add(resultButtons[1]);padPanel.add(clearButton);padPanel.add(deleteButton);
        padPanel.add(operatorButtons[0]);padPanel.add(operatorButtons[1]);padPanel.add(operatorButtons[2]);padPanel.add(operatorButtons[3]);
        padPanel.add(operatorButtons[4]);padPanel.add(operatorButtons[5]);padPanel.add(operatorButtons[6]);padPanel.add(operatorButtons[7]);
        padPanel.add(numberButtons[0]);padPanel.add(numberButtons[1]);padPanel.add(numberButtons[2]);padPanel.add(operatorButtons[8]);
        padPanel.add(numberButtons[3]);padPanel.add(numberButtons[4]);padPanel.add(numberButtons[5]);padPanel.add(operatorButtons[9]);
        padPanel.add(numberButtons[6]);padPanel.add(numberButtons[7]);padPanel.add(numberButtons[8]);padPanel.add(operatorButtons[10]);
        padPanel.add(numberButtons[16]);padPanel.add(numberButtons[9]);padPanel.add(operatorButtons[11]);padPanel.add(resultButtons[2]);
        operatorButtons[11].setEnabled(false);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 1, 3, 3));
        leftPanel.add(radixButtons[0]);
        for(int i=10;i<16;i++){
            leftPanel.add(numberButtons[i]);
        }

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout(3, 5));
        buttonPanel.add("North",memPanel);
        buttonPanel.add("Center", padPanel);
        buttonPanel.add("West",leftPanel);

        JPanel programmer=new JPanel();
        programmer.setLayout(new BorderLayout(3, 5));
        programmer.add("North",resultText);
        programmer.add("South",buttonPanel);


        //各种监听器
        radixButtons[0].addActionListener(e->{
            for (int i=10;i<16;i++){
                numberButtons[i].setEnabled(false);
            }
            leftPanel.add(radixButtons[1],0);
            leftPanel.remove(radixButtons[0]);
            leftPanel.revalidate();
        });
        radixButtons[1].addActionListener(e->{
            numberButtons[1].setEnabled(false);
            numberButtons[2].setEnabled(false);
            leftPanel.add(radixButtons[2],0);
            leftPanel.remove(radixButtons[1]);
            leftPanel.revalidate();
        });
        radixButtons[2].addActionListener(e->{
            numberButtons[0].setEnabled(false);
            numberButtons[3].setEnabled(false);
            numberButtons[4].setEnabled(false);
            numberButtons[5].setEnabled(false);
            numberButtons[7].setEnabled(false);
            numberButtons[8].setEnabled(false);
            leftPanel.add(radixButtons[3],0);
            leftPanel.remove(radixButtons[2]);
            leftPanel.revalidate();
        });
        radixButtons[3].addActionListener(e->{
            for (int i=0;i<16;i++){
                numberButtons[i].setEnabled(true);
            }
            leftPanel.add(radixButtons[0],0);
            leftPanel.remove(radixButtons[3]);
            leftPanel.revalidate();
        });
        return programmer;
    }
}
