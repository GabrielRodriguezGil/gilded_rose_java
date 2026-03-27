package edu.teamrocket.gilded_rose.domain;

public class Backstage extends NormalItem{
    
    public Backstage(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality(){
        int sellIn = getSell_in();

        if (sellIn > 10){
            computeQuality(1);
        }
        else if (sellIn > 5){
            computeQuality(2);
        }
        else if (sellIn > 0){
            computeQuality(3);
        }
        else{
            getItem().setQuality(0);
        }
        setSell_in();
    }
}
