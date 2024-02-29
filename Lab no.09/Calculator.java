import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
    JFrame jFrame;
    JPanel jp;
    JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, plus, minus, multiple, devide, equal, clear;
    JTextField text;
    
    int operator;
    double number1;
    double number2;
    double result;
    
    public Calculator(){
        //create obj
        jFrame = new JFrame("My Calculator");
        jp = new JPanel(new GridLayout(4,4));
        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        minus = new JButton("-");
        plus = new JButton("+");
        multiple = new JButton("x");
        devide = new JButton("/");
        equal = new JButton("=");
        text = new JTextField();
        clear = new JButton("c");
        
        //set Layout
        jFrame.setLayout(new BorderLayout());
        jFrame.add(jp);
        
        //use obj
        jFrame.add(text, BorderLayout.NORTH);
        jp.add(bt7); jp.add(bt8); jp.add(bt9); jp.add(plus);
        jp.add(bt4); jp.add(bt5); jp.add(bt6); jp.add(minus);
        jp.add(bt1); jp.add(bt2); jp.add(bt3); jp.add(multiple);
        jp.add(bt0); jp.add(clear); jp.add(equal); jp.add(devide);
        
        //visible setting
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(250, 250);
        jFrame.setVisible(true);
        
        //add listener to every button
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiple.addActionListener(this);
        devide.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == (plus)){
            number1 = Double.parseDouble(text.getText());
            text.setText("");
            System.out.println(number1);
            operator = 1;
        }
        else if (e.getSource() == (minus)){
            number1 = Double.parseDouble(text.getText());
            text.setText("");
            System.out.println(number1);
            operator = 2;
        }
        else if (e.getSource() == (multiple)){
            number1 = Double.parseDouble(text.getText());
            text.setText("");
            System.out.println(number1);
            operator = 3;
        }
        else if (e.getSource() == (devide)){
            number1 = Double.parseDouble(text.getText());
            text.setText("");
            System.out.println(number1);
            operator = 4;
        }
        else if (e.getSource() == (clear)){
            text.setText("");
        }
        else if (e.getSource() == equal){
            number2 = Double.parseDouble(text.getText());
            if (operator == 1){
                result = number1 + number2;
            }
            else if(operator == 2){
                result = number1 - number2;
            }
            else if(operator == 3){
                result = number1 * number2;
            }
            else if(operator == 4){
                result = number1 / number2;
            }
            operator = 5;
            text.setText("" + result);
        }
        else if (e.getSource() == bt0){
            if ((operator == 1) || (operator == 2) || (operator == 3) || (operator == 4) || (operator == 5)){
                text.setText(text.getText() + "");
            }
            text.setText(text.getText() + "0");
        }
        else if (e.getSource() == bt1){
            text.setText(text.getText() + "1");
        }
        else if (e.getSource() == bt2){
            text.setText(text.getText() + "2");
        }
        else if (e.getSource() == bt3){
            text.setText(text.getText() + "3");
        }
        else if (e.getSource() == bt4){
            text.setText(text.getText() + "4");
        }
        else if (e.getSource() == bt5){
            text.setText(text.getText() + "5");
        }
        else if (e.getSource() == bt6){
            text.setText(text.getText() + "6");
        }
        else if (e.getSource() == bt7){
            text.setText(text.getText() + "7");
        }
        else if (e.getSource() == bt8){
            text.setText(text.getText() + "8");
        }
        else if (e.getSource() == bt9){
            text.setText(text.getText() + "9");
        }
    }
    
    public static void main(String[] args) {new Calculator();}
}