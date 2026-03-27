package edu.teamrocket.gilded_rose.domain;

final class Item {

    private final String name;

    private int sell_in = 0;
    private int quality = 0;

    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;

    }

    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", quality" + getQuality());
        itemDescription.append(", sell_in=" + getSell_in());
        return itemDescription.toString();
    }

    String getName() {
        return name;
    }

    int getSell_in() {
        return sell_in;
    }

    int getQuality() {
        return quality;
    }

    void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    void setQuality(int value) {
        this.quality = value;
    }
}