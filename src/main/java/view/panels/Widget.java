package view.panels;

import myComponent.button.MusicButton;
import myComponent.button.WeatherButton;

import javax.swing.*;
import java.awt.*;

public class Widget {
    private WeatherButton weatherButton=new WeatherButton();
    private MusicButton work=new MusicButton("src/file/work.mp3","工作");
    private MusicButton eat=new MusicButton("src/file/hahaha.mp3","下饭");

    public JPanel init(){
         JPanel widget=new JPanel();
         widget.setLayout(new BorderLayout(3, 5));
         widget.add("Center",weatherButton);
         widget.add("West",work);
         widget.add("East",eat);
         return widget;
       }
}
