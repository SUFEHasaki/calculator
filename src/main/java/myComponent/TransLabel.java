package myComponent;

import lombok.Data;

import javax.swing.*;
@Data
public class TransLabel extends JLabel {
    private String formerText="";
    private String latterText="";
    public TransLabel(){
        super();
//        this.setText("1 人民币(CNY)=1.0 人民币(CNY)");
    }
    public void updateText(){
        this.setText(formerText+"="+latterText);
    }
}
