package view.panels;

import view.components.MemStore;
import view.components.ProgrammerLeft;
import view.components.ProgrammerPad;

import javax.swing.*;
import java.awt.*;

public class Programmer{
    private ProgrammerPad programmerPad=new ProgrammerPad();
    private ProgrammerLeft programmerLeft=new ProgrammerLeft();
    private MemStore memStore=new MemStore();
    public JPanel init(){
        JPanel programmer=new JPanel();
        programmer.setLayout(new BorderLayout(3, 5));
        programmer.add("North", memStore.init());
        programmer.add("East", programmerPad.init());
        programmer.add("West", programmerLeft.init());
        return programmer;
    }
}
