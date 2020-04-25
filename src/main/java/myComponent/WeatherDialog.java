package myComponent;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.Setter;
import utils.Weather;


import javax.swing.*;
import java.awt.*;

public class WeatherDialog extends JDialog {
//    public static JSONObject weather;
//public static void main(String[] args) {
//    new WeatherDialog();
//}
    public static String dateAndLocation="";
    public static String comf="";
    public static String sport="";
    public static String uv="";
    public WeatherDialog(){
        super();
        this.setTitle("生活指数");
        this.setVisible(true);
        this.setLocation(800, 400);
        this.setSize(300,300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }
    private void init(){
        JLabel district =new JLabel();
        JTextArea advice=new JTextArea();
        district.setText(dateAndLocation);
        advice.setLineWrap(true);
        advice.append("舒适度指数:\n");
        advice.append(comf+"\n\n");
        advice.append("运动指数:\n");
        advice.append(sport+"\n\n");
        advice.append("防晒指数:\n");
        advice.append(uv);
        getContentPane().setLayout(new BorderLayout(3, 5));
        getContentPane().add("North",district);
        getContentPane().add("Center",advice);
    }
}
