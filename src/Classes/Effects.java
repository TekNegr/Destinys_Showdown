package Classes;

public enum Effects {
    Attack{
        @Override
        void ActivateEffect(Card Launch, Card Victim, int Delta){
            Victim.Value.varyHealth(-(Launch.Value.getDamage()));
        }
    },
    Heal{
        @Override
        void ActivateEffect(Card Launch, Card Victim, int Delta){
            Victim.Value.varyHealth(Delta);
        }
    },
    
    ;
    abstract void ActivateEffect(Card Launch, Card Victim, int Delta);
}
