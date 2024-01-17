public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        super.setFuel(s);
        super.setTopSpeed(t);
    }
    public void fly(){
        int nowFuel = super.getFuel();
        
        if (nowFuel < 200){
            System.out.println("Please add fuel.");
        }else{
            System.out.println("Fly.");
            super.setFuel(nowFuel-200);
        }
    }
    public void showPlaneInfo(){
        System.out.print("Plane detail is, ");
        super.showInfo();
    }
}
