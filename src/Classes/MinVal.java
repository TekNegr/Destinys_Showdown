package Classes;

public class MinVal<Suit, Value>{
    private Suit suit;
    private Value value;
    public MinVal(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    public Suit getMinSuit(){
        return suit;
    }

    public Value getMinValue(){
        return value;
    }
}
