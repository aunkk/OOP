import java.awt.GridLayout;
import javax.swing.*;

public class TellerGUI {
    public JFrame j_frame;
    public JPanel panel_1, panel_2;
    public JButton deposit, withdraw, exit;
    public JLabel Balance, Amount;
    public JTextField t_balance, t_amount;
    
    public TellerGUI(){
        j_frame = new JFrame("Teller GUI");
        j_frame.setLayout(new GridLayout(3,1));
        panel_1 = new JPanel(new GridLayout(2,2));
        panel_2 = new JPanel();
        j_frame.add(panel_1);
        j_frame.add(panel_2);
        Balance = new JLabel(" Balance");
        Amount = new JLabel(" Amount");
        t_balance = new JTextField("6000");
        t_balance.setEditable(false);
        t_amount = new JTextField();
        panel_1.add(Balance);
        panel_1.add(t_balance);
        panel_1.add(Amount);
        panel_1.add(t_amount);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("exit");
        panel_2.add(deposit);
        panel_2.add(withdraw);
        panel_2.add(exit);
        
        j_frame.pack();
        j_frame.setVisible(true);
    }
    public static void main(String[] args) { new TellerGUI(); }
}
