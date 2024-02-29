
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList<Account>(5);
    }
//    public Customer(String firstName, String lastName, CheckingAccount acct){
//        this.firstName = firstName;
//        this.acct = acct;
//        this.lastName = lastName;
//    }
    public Customer(){
        this.acct = new ArrayList<Account>(5);
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        this.numOfAccount += 1;
    }
    public Account getAccount(int index){
        return acct.get(index);
    }
    public int getNumOfAccount(){
        return acct.size();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        if (acct.isEmpty()){
            return firstName + " " + lastName + " doesn’t have account.";
        }else{
            return firstName +" " + lastName + " has " + numOfAccount + " account.";
        }
    }
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && (this.lastName.equals(c.lastName));
    }
    
    public static void main(String[] args) {
 Customer cust = new Customer("Somsri", "Boonjing");
 Account acct1 = new Account(5000, "Somsri01");
 Account acct2 = new Account(3000, "Somsri02");
//     System.out.println(cust);
 cust.addAccount(acct1);
     System.out.println(cust);
 cust.addAccount(acct2);
 // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
 cust.getAccount(0).withdraw(3000);
 cust.getAccount(1).deposit(3000);
 // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
 System.out.println(cust);
 
 // ทดลองสร้างบัญชีและเพิEมบัญชีนัFนๆ ให้กับลูกค้า มากกว่า 5 บัญชี
 for (int i = 0; i < cust.getNumOfAccount(); i++) {
 cust.getAccount(i).showAccount();
}
}
}
