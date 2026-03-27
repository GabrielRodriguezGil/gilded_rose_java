package edu.teamrocket.gilded_rose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    
    private final List<Updateable> intventory = new ArrayList<Updateable>();

    public List<Updateable> inventory(){
        return this.intventory;
    }

    public void addItem(Updateable item){
        inventory().add(item);
    }

    public void updateQuality(){
        for(Updateable item : inventory()){
            item.updateQuality();
        }
    }


    @Override
    public String toString(){
        StringBuilder representation = new StringBuilder();
        for (Updateable item :intventory){
            representation.append(item.toString());
            representation.append("/n");
        }
        return representation.toString();
    }
}
