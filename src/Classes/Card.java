package Classes;

import java.util.ArrayList;

public class Card {
    protected String Name;
    protected CardValue Value;
    protected boolean isMajorArcana;
    protected String placement;

    //constructor
    public Card(CardValue Value, boolean isMajorArcana, String Name, String placement){
        this.Value = Value;
        this.isMajorArcana = isMajorArcana;
        this.Name = Name;
        this.placement = placement;

    }

    

}
