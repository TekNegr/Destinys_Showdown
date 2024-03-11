package Classes;

public class Double {
    private Slot mainSlot;
    private Slot extraSlot;

    public Double(){
        this.mainSlot = new Slot(null, false);
        this.extraSlot = new Slot(null, true);
    }
}
