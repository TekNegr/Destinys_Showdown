package Classes;
import java.util.ArrayList;


public class CardValue {
    private int Health;
    private int Cost;
    private int Damage;
    

    public CardValue(int Health, int Cost, int Damage, boolean isMajorArcana){
        this.Health = Health;
        this.Cost = Cost;
        this.Damage = Damage;
    }
    //HEALTH
    public int getHealth(){
        return Health;
    }

    public void setHealth(int Delta){
        this.Health = Delta ;
    }

    public void varyHealth(int Delta){
        this.Health += Delta ;
    }

    //DAMAGE
    public void setDamage(int Dmg){
        this.Damage = Dmg;
    }

    public void varyDamage(int Delta){
        this.Damage += Delta;
    }

    public int getDamage(){
        return Damage;
    }


    //COST
    public int getCost(){
        return Cost;
    }

    public void setCost(int cost){
        this.Cost = cost;
    }

    public void varyCost(int Delta){
        this.Cost += Delta;
    }



}
