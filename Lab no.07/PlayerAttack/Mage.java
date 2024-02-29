public class Mage extends Player{
    public Mage(){
        setATK(5);
        setHP(10);
        setMP(20);
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
        p.attacked(this.getATK()*2.5);
        this.setMP(this.getMP()-5);
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
