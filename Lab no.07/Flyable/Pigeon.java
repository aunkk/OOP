public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon += 1;
    }
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public void eat(String food){
        if (food.equals("worm")) {
            setWeight(getWeight()+0.5);
        }
        else if (food.equals("seed")) {
            setWeight(getWeight()+0.2);
        }else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    @Override
    public String toString(){
        return String.format("Pigeon %s kg and %s cm. There are %s pigeons.", getWeight(), getHeight(), numberOfPigeon);                
    }
    public void fly(){
        if (getWeight() >= 5) {
            System.out.println("Fly Fly");;
        }
        else{
            System.out.println("I'm hungry.");
        }
        setWeight(getWeight()-0.25);
    }
    public void takeOff(){
        if (getWeight() >= 5){
            System.out.println("Take Off");
        }
        else{
            System.out.println("I'm hungry.");
        }
        setWeight(getWeight()-0.5);
    }
    public void landing(){
        if (getWeight() >= 5){
            System.out.println("Landing");
        }
        else{
            System.out.println("I'm hungry.");
        }
        setWeight(getWeight()-0.5);
    }
}
