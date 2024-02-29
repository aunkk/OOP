public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        for (int index = 0; index < acct.length; index++) {
            if (acct[index] == null){
                acct[index] = ac;
                this.numAcct += 1;
                break;
            }
        }
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
