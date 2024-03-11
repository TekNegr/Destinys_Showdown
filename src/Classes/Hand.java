package Classes;
import java.util.ArrayList;



public class Hand {
    protected ArrayList<Card> Cards;

    public Hand(){
        this.Cards = new ArrayList<Card>();
    }

    public void getCards(){
        for(int i=0; i<Cards.size(); i++){
            System.out.println(/* Card */);
        }
    }

    public void addCard(Card card){
        Cards.add(card);
    }

    public void giveCard(Card card, Hand hand2){
        if (Cards.contains(card)){
            Cards.remove(card);
            hand2.addCard(card);
        }
        else{
            System.out.println("Impossible to give card");
        }
    }

}
