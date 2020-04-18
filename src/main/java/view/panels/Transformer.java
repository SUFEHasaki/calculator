package view.panels;


import myComponent.*;


import javax.swing.*;
import java.awt.*;

public class Transformer {
    private  final String[] PADKEYS = {  "", "CE", "◁", "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "","0", "." };
    private  MyButton[] padkeys = new MyButton[PADKEYS.length];
    private TransMenu menu=new TransMenu();
    private CurrencyComboBox[] currency=new CurrencyComboBox[]{new CurrencyComboBox(),new CurrencyComboBox()};
    private LengthComboBox[] length=new LengthComboBox[]{new LengthComboBox(),new LengthComboBox()};
    private MassComboBox[] mass=new MassComboBox[]{new MassComboBox(),new MassComboBox()};
    private AreaComboBox[] area=new AreaComboBox[]{new AreaComboBox(),new AreaComboBox()};
    private TemperatureComboBox[] temperature=new TemperatureComboBox[]{new TemperatureComboBox(),new TemperatureComboBox()};
    private MyTextField rawText = new MyTextField("0");
    private MyTextField resultText = new MyTextField("");
    public Transformer(){

    }
    public JPanel init(){
        JPanel showPanel=new JPanel();
        showPanel.setLayout(new GridLayout(5, 1, 3, 3));
        showPanel.add(menu);
        showPanel.add(rawText);
        showPanel.add(currency[0]);
        showPanel.add(resultText);
        showPanel.add(currency[1]);

        JPanel padPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        padPanel.setLayout(new GridLayout(5, 3, 3, 3));
        for (int i = 0; i < PADKEYS.length; i++) {
            padkeys[i] = new MyButton(PADKEYS[i],Color.black);
            padPanel.add(padkeys[i]);
        }
        padkeys[0].setEnabled(false);
        padkeys[12].setEnabled(false);

        JPanel transformer=new JPanel();
        transformer.setLayout(new BorderLayout(3, 5));
        transformer.add("Center",showPanel);
        transformer.add("South", padPanel);
//        各种监听器
        menu.addActionListener(e->{
            switch (menu.getSelectedIndex()){
                case 0:{showPanel.remove(2);showPanel.add(currency[0],2);showPanel.remove(4);showPanel.add(currency[1],4);showPanel.revalidate();break;}
                case 1:{showPanel.remove(2);showPanel.add(length[0],2);showPanel.remove(4);showPanel.add(length[1],4);showPanel.revalidate();break;}
                case 2:{showPanel.remove(2);showPanel.add(mass[0],2);showPanel.remove(4);showPanel.add(mass[1],4);showPanel.revalidate();break;}
                case 3:{showPanel.remove(2);showPanel.add(area[0],2);showPanel.remove(4);showPanel.add(area[1],4);showPanel.revalidate();break;}
                case 4:{showPanel.remove(2);showPanel.add(temperature[0],2);showPanel.remove(4);showPanel.add(temperature[1],4);showPanel.revalidate();break;}
            }
        });
        return transformer;
    }

}
