package myComponent.button;


public class ResultButton extends MyButton {
    public ResultButton(String name,StringBuilder postfix){
        super();
        this.setText(name);
        this.addActionListener(e -> {
//            postfix.append(operator);
        });
    }
}
