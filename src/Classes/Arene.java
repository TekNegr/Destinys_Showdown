package Classes;

public class Arene {
    private DemiArene player1_DA;
    private DemiArene player2_DA;

    public Arene(String player1_username, String player2_username){
        this.player1_DA = new DemiArene(player1_username);
        this.player2_DA = new DemiArene(player2_username);
    }
}
