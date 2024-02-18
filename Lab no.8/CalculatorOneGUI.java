import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    public JFrame j_frame;
    public JPanel j_panel;
    public JTextField text_input1;
    public JTextField text_input2;
    public JPanel free;
    public JTextField text_output;
    public JButton bt1;
    public JButton bt2;
    public JButton bt3;
    public JButton bt4;
    
    public CalculatorOneGUI(){
        j_frame = new JFrame("Calculator");
        j_panel = new JPanel();
        text_input1 = new JTextField();
        text_input2 = new JTextField();
        free = new JPanel();
        text_output = new JTextField();
        bt1 = new JButton("plus");
        bt2 = new JButton("minus");
        bt3 = new JButton("multiple");
        bt4 = new JButton("devide");
        j_frame.setLayout(new GridLayout(4,1));
        j_frame.add(text_input1);
        j_frame.add(text_input2);
        j_frame.add(free);
        j_frame.add(text_output);
//        text_output.setEditable(false);
        free.add(bt1);
        free.add(bt2);
        free.add(bt3);
        free.add(bt4);
        j_frame.pack();
        j_frame.setVisible(true);
    }
    public static void main(String[] args) { new CalculatorOneGUI(); }
}
