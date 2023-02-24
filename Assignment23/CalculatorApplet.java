import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="CalculatorApplet" height=400 width=500></applet>*/
public class CalculatorApplet extends Applet implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false);
        addButton = new Button("+");
        addButton.addActionListener(this);
        subtractButton = new Button("-");
        subtractButton.addActionListener(this);
        multiplyButton = new Button("x");
        multiplyButton.addActionListener(this);
        divideButton = new Button("/");
        divideButton.addActionListener(this);

        add(num1Field);
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;
        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        }
        resultField.setText(Double.toString(result));
    }
}