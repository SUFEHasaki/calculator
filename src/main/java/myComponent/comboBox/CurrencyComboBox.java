package myComponent.comboBox;

import javax.swing.JComboBox;

public class CurrencyComboBox extends JComboBox<String> {
    public CurrencyComboBox(){
        super();
        this.addItem("CNY");
        this.addItem("USD");
        this.addItem("GBP");
        this.addItem("EUR");
        this.addItem("KRW");
        this.addItem("JPY");
        this.addItem("TWD");
        this.addItem("MOP");
    }
}
