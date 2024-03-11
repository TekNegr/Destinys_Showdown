package Classes;
import java.util.ArrayList;


public class DemiArene {
    private String username;
    private Hand playerHand;
    private Slot YouSlot;
    private Slot EventSlot;
    private ArrayList<Double> PersonsSlots;

    public DemiArene(String username){
        this.username = username;
        this.playerHand = new Hand();
        this.EventSlot = new Slot(null, false);
        this.YouSlot = new Slot(null, false);
        this.PersonsSlots = new ArrayList<Double>();
    }
}
