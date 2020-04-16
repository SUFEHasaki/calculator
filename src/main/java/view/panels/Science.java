package view.panels;

import view.components.MemStore;
import view.components.ScienceLeft;
import view.components.SciencePad;

import javax.swing.*;
import java.awt.*;

public class Science{
    private SciencePad sciencePad=new SciencePad();
    private ScienceLeft scienceLeft=new ScienceLeft();
    private MemStore memStore=new MemStore();
    public JPanel init(){
        JPanel science=new JPanel();
        science.setLayout(new BorderLayout(3, 5));
        science.add("North", memStore.init());
        science.add("East", sciencePad.init());
        science.add("West", scienceLeft.init());
        return science;
    }

}
