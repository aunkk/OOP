class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= Food.getPrice()){
            double fine = this.getWallet().getBalance()+Food.getPrice();
            this.getWallet().setBalance(fine);
            double fines = e.getWallet().getBalance()-Food.getPrice();
            e.getWallet().setBalance(fines);
            Food food = new Food();
            return food;
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
