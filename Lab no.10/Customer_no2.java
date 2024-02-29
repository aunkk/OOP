public class Customer {
    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;
    
    public Customer(String firstName, String lastName){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }
//    public Customer(String firstName, String lastName, CheckingAccount acct){
//        this.firstName = firstName;
//        this.acct = acct;
//        this.lastName = lastName;
//    }
    public Customer(){
        acct = new Account[5];
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
        for (int i = 0; i < this.acct.length; i++) {
            if (this.acct[i] == (null)) {
                this.acct[i] = acct;
                numOfAccount += 1;
                break;
            }
        }
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        if (acct == null){
            return firstName + " " + lastName + " doesn’t have account.";
        }else{
            return firstName +" " + lastName + " has " + numOfAccount + " account.";
        }
    }
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && (this.lastName.equals(c.lastName));
    }
} 