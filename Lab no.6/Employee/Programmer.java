public class Programmer extends Employee{
    private int happiness;
    
    public int getHappiness(){
        return happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
    public void coding(char str){
        coding(String.valueOf(str));
    }
    public void coding(String str){
if (this.getEnergy() >= 30){
            System.out.println("Your code is " + str);
            happiness -= 30;
            int fine = this.getEnergy() - 30;
            this.setEnergy(fine);
        }
        else{
            System.out.println("Eror Eror Eror");
            happiness -= 30;
            int fine = this.getEnergy() - 30;
            this.setEnergy(fine);
        }
    }
}
