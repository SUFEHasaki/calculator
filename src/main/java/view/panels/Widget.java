package view.panels;

import myComponent.button.WeatherButton;

import javax.swing.*;
import java.awt.*;

public class Widget {
    private WeatherButton weatherButton=new WeatherButton();
    public JPanel init(){
         JPanel widget=new JPanel();
         widget.setLayout(new BorderLayout(3, 5));
         widget.add("North",weatherButton);
         return widget;
       }
}
