public class Novice extends Player{
    
    public Novice(){
        setATK(5);
        setHP(10);
        setMP(10);
    }
    
    public void addEquipment(Item i){
        i.use(this);
    }

    /**
     *
     * @param p
     */
    @Override
    public void attack(Player p) {
        p.attacked(this.getATK());
    }

    /**
     *
     * @param n
     */
    @Override
    public void attacked(double n) {
        this.setHP(getHP()-n);
    }
    
}
