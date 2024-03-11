package Classes;

import javax.lang.model.type.NullType;

import Classes.MinArcana_Card.Suit;

public class MajArcana_Card extends Card {
    

    public enum MajorArcana {
        THE_FOOL("The Fool"), THE_MAGICIAN("The Magician"), THE_HIGH_PRIESTESS("The High Priestess"),
        THE_EMPRESS("The Empress"), THE_EMPEROR("The Emperor"), THE_HIEROPHANT("The Hierophant"),
        THE_LOVERS("The Lovers"), THE_CHARIOT("The Chariot"), STRENGTH("Strength"),
        THE_HERMIT("The Hermit"), WHEEL_OF_FORTUNE("Wheel of Fortune"), JUSTICE("Justice"),
        THE_HANGED_MAN("The Hanged Man"), DEATH("Death"), TEMPERANCE("Temperance"),
        THE_DEVIL("The Devil"), THE_TOWER("The Tower"), THE_STAR("The Star"),
        THE_MOON("The Moon"), THE_SUN("The Sun"), JUDGEMENT("Judgement"), THE_WORLD("The World");
    
        private String name;
    
        private MajorArcana(String name ) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public MajArcana_Card(CardValue Value, boolean isMajorArcana, MajorArcana Arcana) {
        super(Value, true, Arcana.getName(), " ");
        
    }

}
