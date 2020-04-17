package view.panels;

import view.components.MemStore;
import view.components.ScienceLeft1;
import view.components.ScienceLeft2;
import view.components.SciencePad;

import javax.swing.*;
import java.awt.*;

public class Science{
//    private SciencePad sciencePad=new SciencePad();
//    private ScienceLeft1 scienceLeft1 =new ScienceLeft1();
//    private ScienceLeft2 scienceLeft2=new ScienceLeft2();
//    private MemStore memStore=new MemStore();
    public JPanel init(){
        JPanel science=new JPanel();
//        ScienceLeft2.init();
        science.setLayout(new BorderLayout(3, 5));
        science.add("North", MemStore.memStore);
        science.add("Center", SciencePad.sciencePad);
        science.add("West", ScienceLeft1.scienceLeft);

        ScienceLeft1.getTransKey().addActionListener(e -> {
           science.add("West", ScienceLeft2.scienceLeft);
           science.remove(ScienceLeft1.scienceLeft);
           science.revalidate();
        });
        ScienceLeft2.getTransKey().addActionListener(e -> {
            science.add("West", ScienceLeft1.scienceLeft);
            science.remove(ScienceLeft2.scienceLeft);
            science.revalidate();
        });
        return science;
    }

}
