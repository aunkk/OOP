public class Sword extends Item{

    /**
     *
     * @param P
     */
    @Override
    public void use(Player P){
        P.setATK(P.getATK()+10);
    }
    
}
