package view.panels;

import view.components.TransformerPad;

import javax.swing.*;
import java.awt.*;

public class Transformer {
//    private TransformerPad transformerPad=new TransformerPad();
    public JPanel init(){
        JPanel transformer=new JPanel();
        transformer.setLayout(new BorderLayout(3, 5));
        transformer.add("South", TransformerPad.transformerPad);
        return transformer;
    }

}
