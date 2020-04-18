package view.panels;

import myComponent.comboBox.NavigatorMenu;

import javax.swing.*;
import java.awt.*;

public class Navigator{
    private NavigatorMenu menu=new NavigatorMenu();
    public NavigatorMenu getMenu(){
        return menu;
    }
    public JPanel init(){
        JPanel navigator=new JPanel();
       navigator.setLayout(new BorderLayout(3, 5));
       navigator.add("North",menu);
       return navigator;
    }
}
