package myComponent;

import com.alibaba.fastjson.JSONObject;
import utils.Weather;


import javax.swing.*;
import java.awt.*;

public class WeatherDialog extends JDialog {
//    public static JSONObject weather;
public static void main(String[] args) {
    new WeatherDialog();
}
    public WeatherDialog(){
        super();
        init(Weather.getWeather());
    }
    public void init(JSONObject weather){
        JLabel district =new JLabel();
        JTextArea advice=new JTextArea();
        district.setText(weather.getString("date")+" "+weather.getString("location")+" "+weather.getString("city"));
        advice.setLineWrap(true);
        advice.append("舒适度指数:\n");
//        try{
//
//        }
        advice.append(weather.getString("comf")+"\n\n");
        advice.append("运动指数:\n");
        advice.append(weather.getString("sport")+"\n\n");
        advice.append("防晒指数:\n");
        advice.append(weather.getString("uv"));
        getContentPane().setLayout(new BorderLayout(3, 5));
        getContentPane().add("North",district);
        getContentPane().add("Center",advice);
        this.setTitle("生活指数");
        this.setVisible(true);
        this.setLocation(800, 400);
        this.setSize(300,300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
