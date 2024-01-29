public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str){
        if (this.getEnergy() >= 10){
            System.out.println("I'm coding about " + str);
            int fines = this.getHappiness() - 5;
            this.setHappiness(fines);
            int fine = this.getEnergy() - 5;
            this.setEnergy(fine);
        }
        else{
            System.out.println("ZzZzZz");
            int fines = this.getHappiness() - 5;
            this.setHappiness(fines);
            int fine = this.getEnergy() - 5;
            this.setEnergy(fine);
        }
    }
    public void coding(String str, int num){
        for (int i = 0; i < num; i++) {
            this.coding(str);
        }
    }
    public void compliment(Programmer p){
        int fine = p.getHappiness() + 20;
        p.setHappiness(fine);
        System.out.println(String.format("%s in a good mood", p.getName()));
    }
    public void blame(Programmer p){
        int fine = p.getHappiness() - 20;
        p.setHappiness(fine);
        System.out.println(String.format("%s in a bad mood", p.getName()));
    }
}
