package myComponent.comboBox;

import javax.swing.JComboBox;

public class TransMenu extends JComboBox<String> {
    public TransMenu(UnitsComboBox[] unitsComboBoxes){
        super();
        this.addItem("货币");
        this.addItem("长度");
        this.addItem("质量");
        this.addItem("面积");
        this.addItem("速率");
        this.addActionListener(e -> {
               switch (this.getSelectedIndex()){
                   case 0:{
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("CNY");
                           unitsComboBox.addItem("USD");
                           unitsComboBox.addItem("GBP");
                           unitsComboBox.addItem("EUR");
                           unitsComboBox.addItem("KRW");
                           unitsComboBox.addItem("JPY");
                           unitsComboBox.addItem("TWD");
                           unitsComboBox.addItem("MOP");
                           unitsComboBox.setSelectedIndex(0);
                       }
                       break;
                   }
                   case 1:{
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("微米");
                           unitsComboBox.addItem("毫米");
                           unitsComboBox.addItem("厘米");
                           unitsComboBox.addItem("米");
                           unitsComboBox.addItem("公里");
                           unitsComboBox.addItem("英寸");
                           unitsComboBox.addItem("英尺");
                           unitsComboBox.addItem("英里");
                           unitsComboBox.addItem("海里");
                           unitsComboBox.setSelectedIndex(3);
                       }
                       break;
                   }
                   case 2:{
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("克");
                           unitsComboBox.addItem("斤");
                           unitsComboBox.addItem("千克");
                           unitsComboBox.addItem("公吨");
                           unitsComboBox.addItem("盎司");
                           unitsComboBox.addItem("磅");
                           unitsComboBox.addItem("克拉");
                           unitsComboBox.setSelectedIndex(2);
                       }
                       break;
                   }
                   case 3:{
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("平方厘米");
                           unitsComboBox.addItem("平方米");
                           unitsComboBox.addItem("公顷");
                           unitsComboBox.addItem("平方公里");
                           unitsComboBox.addItem("平方英寸");
                           unitsComboBox.addItem("平方英尺");
                           unitsComboBox.addItem("市亩");
                           unitsComboBox.setSelectedIndex(1);
                       }
                       break;
                   }
                   case 4:{
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("米/秒");
                           unitsComboBox.addItem("公里/小时");
                           unitsComboBox.addItem("英里/小时");
                           unitsComboBox.addItem("节");
                           unitsComboBox.setSelectedIndex(1);
                       }
                       break;
                   }
               }
        });
        this.setSelectedIndex(0);
    }
}
