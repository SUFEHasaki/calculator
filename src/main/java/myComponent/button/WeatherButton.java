package myComponent.button;

import myComponent.WeatherDialog;

import javax.swing.*;

public class WeatherButton extends JButton {
    public WeatherButton(){
        this.setIcon(new ImageIcon("src/file/cloud.jpg"));
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
        this.addActionListener(e -> {
            new WeatherDialog();
        });
    }
}
