package myComponent;

import lombok.Data;
import utils.Constant;

import javax.swing.*;
import java.awt.*;

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
    }
    public void updateText(){
        switch(no){
            case 0:{rate=Constant.CURRENCY[row][col];break; }
            case 1:{rate=Constant.LENGTH[row][col];break;}
            case 2:{rate=Constant.MASS[row][col];break;}
            case 3:{rate=Constant.AREA[row][col];break;}
            case 4:{rate=Constant.SPEED[row][col];break;}
            }
            this.setText(formerText+"="+rate+latterText);
        }

    }

