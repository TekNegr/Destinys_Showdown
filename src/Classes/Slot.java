package Classes;

public class Slot {

    //Slot to hold a SingularCard
    protected Card cardSlot;
    protected boolean acceptsMinorArcana;
    
    public Slot(Card card, boolean acceptsMinorArcana){
        if(card != null){
            if ((!card.isMajorArcana && this.acceptsMinorArcana) || card.isMajorArcana){this.cardSlot = card;}
            else{this.cardSlot = null;}
        }
    }
}
