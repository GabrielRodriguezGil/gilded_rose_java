package edu.teamrocket.gilded_rose.domain;

final class Item {

    private final String name;

    private int sellIn = 0;
    private int quality = 0;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

    }

    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", quality" + getQuality());
        itemDescription.append(", sellIn=" + getSellIn());
        return itemDescription.toString();
    }

    String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    int getQuality() {
        return quality;
    }

    void setSellIn() {
        this.sellIn = this.getSellIn() - 1;
    }

    void setQuality(int value) {
        this.quality = value;
    }
}