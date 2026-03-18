package edu.teamrocket.gilded_rose.domain;

public class NormalItem implements Updateable {

    private final Item item;

    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    }

    Item getItem() {
        return this.item;
    }

    void setSell_in() {
        item.setSell_in();
    }

    public String getName() {
        return item.getName();
    }

    public Integer getSell_in() {
        return item.getSell_in();
    }

    public Integer getQuality() {
        return item.getQuality();
    }

    @Override
    public String toString() {
        return item.toString();
    }

    void computeQuality(int value) {
        if (this.getQuality() + value >= 50) {
            item.setQuality(50);
        } else if (this.getQuality() + value >= 0) {
            item.setQuality(getQuality() + value);
        } else {
            item.setQuality(0);
        }
    }

    @Override
    public void updateQuality() {
        if (getSell_in() >= 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        this.setSell_in();
    }
}