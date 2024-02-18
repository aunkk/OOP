import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class CalculatorTwoGUI {
    public JFrame fr;
    public JPanel pn;
    public JTextField textInput;
    public JButton number1, number2, number3, number4, number5, number6, number7, number8, number9, plus, minus, multiple, devide;
    public JButton number0, clear, equal;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        pn = new JPanel(new GridLayout(4, 4));
        textInput = new JTextField();
        number1 = new JButton("1");
        number2 = new JButton("2");
        number3 = new JButton("3");
        number4 = new JButton("4");
        number5 = new JButton("5");
        number6 = new JButton("6");
        number7 = new JButton("7");
        number8 = new JButton("8");
        number9 = new JButton("9");
        plus = new JButton("+");
        minus = new JButton("-");
        multiple = new JButton("x");
        devide = new JButton("/");
        number0 = new JButton("0");
        clear = new JButton("c");
        equal = new JButton("=");
        fr.setLayout(new BorderLayout());
        fr.add(textInput, BorderLayout.NORTH);
        fr.add(pn);
        pn.add(number7);
        pn.add(number8);
        pn.add(number9);
        pn.add(plus);
        pn.add(number4);
        pn.add(number5);
        pn.add(number6);
        pn.add(minus);
        pn.add(number1);
        pn.add(number2);
        pn.add(number3);
        pn.add(multiple);
        pn.add(number0);
        pn.add(clear);
        pn.add(equal);
        pn.add(devide);
        fr.pack();
        fr.setVisible(true);
//        pn.setVisible(true);
    }
    public static void main(String[] args) { new CalculatorTwoGUI();}
}
