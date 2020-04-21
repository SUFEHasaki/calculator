package myComponent;

import lombok.Data;
import utils.Constant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Data
public class TransLabel extends JLabel {
    private String formerText="";
    private String latterText="";
    private int no=0;
    private int row=0;
    private int col=0;
    private double rate;
    public TransLabel(){
        super();
        this.setForeground(Color.BLUE);
        this.setPreferredSize(new Dimension(340,30));
    }
    public void updateText(){
        switch(no){
            case 0:{
                rate=Constant.CURRENCY[row][col];
                try (FileReader reader = new FileReader("src/file/rate.txt");
                     BufferedReader br = new BufferedReader(reader)
                ) {
                    this.setText("<html><body><p>"+formerText+"="+rate+latterText+"<br/>"+br.readLine()+"</p></body></html>");
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                this.addMouseListener();

                return; }
            case 1:{rate=Constant.LENGTH[row][col];break;}
            case 2:{rate=Constant.MASS[row][col];break;}
            case 3:{rate=Constant.AREA[row][col];break;}
            case 4:{rate=Constant.SPEED[row][col];break;}
            }
            this.setText(formerText+"="+rate+latterText);
        }

    }

