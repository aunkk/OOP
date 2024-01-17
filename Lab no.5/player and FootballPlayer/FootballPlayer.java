public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    
    public int getPlayerNumber(){
        return playerNumber;
    }
    public String getPosition(){
        return position;
    }
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    public void setPosition(String p){
        position = p;
    }
    public boolean isSamePosition(FootballPlayer p){
        String p1Team = super.getTeam();
        String p2Team = super.getTeam();
        return p1Team.equals(p2Team) && this.position.equals(p.position);
    }
}
