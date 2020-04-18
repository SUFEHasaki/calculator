package myComponent;

import javax.swing.JComboBox;

public class CurrencyComboBox extends JComboBox<String> {
    public CurrencyComboBox(){
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
