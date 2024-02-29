public class Fraction {
    public int btmN;
    public int topN;
    public void addFraction(Fraction f){
        int topF = f.topN;
        int btmF = f.btmN;
        if (btmF == btmN){
            topN = topN + topF;
            btmN = btmF;
        }else if (btmN != btmF){
            topN = topN * btmF + topF * btmN;
            btmN = btmN * btmF;
        }
    }
    public String toFloat(){
        double point = (double) topN/btmN;
        return (Double.toString(point));
    }
    public String toFraction(){
        return (topN + "/" + btmN);
    }
}
