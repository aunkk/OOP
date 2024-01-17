public class Car extends Vehicle{
    private String typeEngine;
    
    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        typeEngine = y;
    }
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public void move(){
        int nowFuel = super.getFuel();
        if (nowFuel < 50){
            System.out.println("Please add fuel.");
        }else{
            System.out.println("Move.");
            super.setFuel(nowFuel-50);
        }
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + typeEngine +".");
        super.showInfo();
    }
}
