
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    JFrame jframe;
    JPanel panel1, panel2, panel3;
    JLabel balJLabel, amountJLabel;
    JButton DJButton, wJButton, xButton;
    JTextField balField, amountField;
    Account acc;
    
    /**
     *
     * @param balance
     * @param name
     */
    public TellerGUI() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance value : ");
        int bal = sc.nextInt();
        acc = new Account(bal, null);
        jframe = new JFrame();
        panel1 = new JPanel(new GridLayout(1, 2));
        panel2 = new JPanel(new GridLayout(1, 2));
        panel3 = new JPanel();
        balJLabel = new JLabel("  Balance");
        amountJLabel = new JLabel("  Amount");
        balField = new JTextField(""+this.acc.getBalance());
        amountField = new JTextField();
        DJButton = new JButton("Deposit");
        wJButton = new JButton("Withdraw");
        xButton = new JButton("Exit");
        
        jframe.setLayout(new GridLayout(4, 1));
        jframe.add(panel1);
        jframe.add(panel2);
        jframe.add(panel3);
        
        panel1.add(balJLabel); panel1.add(balField);
        panel2.add(amountJLabel); panel2.add(amountField);
        panel3.add(DJButton); panel3.add(wJButton); panel3.add(xButton);
        
        DJButton.addActionListener(this);
        wJButton.addActionListener(this);
        xButton.addActionListener(this);
        
        balField.setEditable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter balance value : ");
//        int bal = sc.nextInt();
        new TellerGUI();
//        sc.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DJButton){
            Double amount;
            amount = Double.valueOf(amountField.getText());
            acc.deposit(amount);
            String money;
            money = String.valueOf(acc.getBalance());
            amountField.setText(money);
        }
        else if (e.getSource() == wJButton){
            Double amount;
            amount = Double.valueOf(amountField.getText());
            acc.withdraw(amount);
            String money;
            money = String.valueOf(acc.getBalance());
            amountField.setText(money);
        }
        else if (e.getSource() == xButton){
            jframe.dispose();
        }
    }
    
}
