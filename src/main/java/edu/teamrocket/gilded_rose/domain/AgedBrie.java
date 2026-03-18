package edu.teamrocket.gilded_rose.domain;

public class AgedBrie extends NormalItem {

    public AgedBrie(String name, Integer sell_in, Integer quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0) {
            computeQuality(1);
        } else {
            computeQuality(2);
        }
        setSell_in();
    }
}