package view.panels;
import myComponent.*;
import myComponent.button.*;
import myComponent.comboBox.*;
import javax.swing.*;
import java.awt.*;

public class Transformer {
    private StringBuilder postfix = new StringBuilder();
    private MyTextField rawText = new MyTextField("0",2);
    private ClearButton clearButton=new ClearButton(postfix,rawText);
    private DeleteButton deleteButton=new DeleteButton(postfix,rawText);
    private  final String[] NUMBERKEYS = {  "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "0","","" };
    private NumberButton[] numberButtons=new NumberButton[NUMBERKEYS.length];
    private PointButton pointButton=new PointButton(postfix,rawText);
//    private  OperatorButton[] padkeys = new OperatorButton[PADKEYS.length];
    private TransMenu menu;
    private UnitsComboBox[] unitsComboBoxes=new UnitsComboBox[2];
//    private CurrencyComboBox[] currency=new CurrencyComboBox[]{new CurrencyComboBox(),new CurrencyComboBox()};
//    private LengthComboBox[] length=new LengthComboBox[]{new LengthComboBox(),new LengthComboBox()};
//    private MassComboBox[] mass=new MassComboBox[]{new MassComboBox(),new MassComboBox()};
//    private AreaComboBox[] area=new AreaComboBox[]{new AreaComboBox(),new AreaComboBox()};
//    private SpeedComboBox[] speed=new SpeedComboBox[]{new SpeedComboBox(),new SpeedComboBox()};

    private MyTextField resultText = new MyTextField("",2);
    private TransLabel label;

    public JPanel init(){
        label=new TransLabel();
        unitsComboBoxes[0]=new UnitsComboBox();
        unitsComboBoxes[1]=new UnitsComboBox();
        unitsComboBoxes[0].addFormerText(label);
        unitsComboBoxes[1].addLatterText(label);
        menu=new TransMenu(unitsComboBoxes,label);
        for (int i = 0; i < NUMBERKEYS.length; i++) {
            numberButtons[i] = new NumberButton(NUMBERKEYS[i],postfix,rawText);
        }
        numberButtons[10].setEnabled(false);
        numberButtons[11].setEnabled(false);
        JPanel showPanel=new JPanel();
        showPanel.setLayout(new GridLayout(6, 1, 3, 3));
        showPanel.add(menu);
        showPanel.add(rawText);
        showPanel.add(unitsComboBoxes[0]);
        showPanel.add(resultText);
        showPanel.add(unitsComboBoxes[1]);
        showPanel.add(label);

        JPanel padPanel = new JPanel();
        // 用网格布局器，4行，4列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        padPanel.setLayout(new GridLayout(5, 3, 3, 3));
        padPanel.add(numberButtons[10]);padPanel.add(clearButton);padPanel.add(deleteButton);
        padPanel.add(numberButtons[0]);padPanel.add(numberButtons[1]);padPanel.add(numberButtons[2]);
        padPanel.add(numberButtons[3]);padPanel.add(numberButtons[4]);padPanel.add(numberButtons[5]);
        padPanel.add(numberButtons[6]);padPanel.add(numberButtons[7]);padPanel.add(numberButtons[8]);
        padPanel.add(numberButtons[11]);padPanel.add(numberButtons[9]);padPanel.add(pointButton);

        JPanel transformer=new JPanel();
        transformer.setLayout(new BorderLayout(3, 5));
        transformer.add("Center",showPanel);
        transformer.add("South", padPanel);
//        变换监听器
//        menu.addActionListener(
//                e -> {
//                        switch (menu.getSelectedIndex()) {
//                            case 0: {
//                                showPanel.remove(2);
//                                showPanel.add(currency[0], 2);
//                                showPanel.remove(4);
//                                showPanel.add(currency[1], 4);
//                                showPanel.revalidate();
//                                break;
//                            }
//                            case 1: {
//                                showPanel.remove(2);
//                                showPanel.add(length[0], 2);
//                                showPanel.remove(4);
//                                showPanel.add(length[1], 4);
//                                showPanel.revalidate();
//                                break;
//                            }
//                            case 2: {
//                                showPanel.remove(2);
//                                showPanel.add(mass[0], 2);
//                                showPanel.remove(4);
//                                showPanel.add(mass[1], 4);
//                                showPanel.revalidate();
//                                break;
//                            }
//                            case 3: {
//                                showPanel.remove(2);
//                                showPanel.add(area[0], 2);
//                                showPanel.remove(4);
//                                showPanel.add(area[1], 4);
//                                showPanel.revalidate();
//                                break;
//                            }
//                            case 4: {
//                                showPanel.remove(2);
//                                showPanel.add(speed[0], 2);
//                                showPanel.remove(4);
//                                showPanel.add(speed[1], 4);
//                                showPanel.revalidate();
//                                break;
//                            }
//                        }
//                }
//        );
        return transformer;
    }

}
