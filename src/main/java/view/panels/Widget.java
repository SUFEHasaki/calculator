package view.panels;

import myComponent.button.MusicButton;
import myComponent.button.WeatherButton;

import javax.swing.*;
import java.awt.*;

public class Widget {
    private WeatherButton weatherButton=new WeatherButton();
    private MusicButton study=new MusicButton("src/file/hahaha.mp3");
    private MusicButton eat=new MusicButton("src/file/hahaha.mp3");

    public JPanel init(){
         JPanel widget=new JPanel();
         widget.setLayout(new BorderLayout(3, 5));
         widget.add("Center",weatherButton);
         widget.add("West",study);
         widget.add("East",eat);
         return widget;
       }
}
