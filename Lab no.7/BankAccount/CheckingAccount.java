public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        credit = 0;
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;                
    }
    
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }

    /**
     *
     * @param a
     */
    @Override
    public void withdraw(double a){
        if ((balance - a < 0) && (balance - a + credit < 0)){
            System.out.println("Not enough money!");
        }else if (balance - a >= 0){
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit +  ".");
        }else if ((balance - a < 0) && (balance - a + credit >= 0)){
            balance = 0;
            credit = credit + (balance - a);
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit +  ".");
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
