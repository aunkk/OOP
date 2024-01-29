public class Employee {
    private int energy;
    private String name;
    private Wallet wallet;
    private static String nationality = "Thai";
    
    public int getEnergy(){
        return energy;
    }
    public String getName(){
        return name;
    }
    public static String getNationality(){
        return nationality;
    }
    public Wallet getWallet(){
        return wallet;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }
    public boolean buyFood(Seller s){
        if (s == null){
            return false;
        }else{
            eat(s.sell(this));
            return true;
        }
    }
    public boolean equals(Employee e){
        return this.name.equals(e.name);
    }
    @Override
    public String toString(){
        return (String.format("My name is %s. \nI have %s energy left.\nI have a balance of %s baht.", name, energy, wallet.getBalance()));
    }
}
