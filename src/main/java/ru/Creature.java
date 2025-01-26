package ru;

public abstract class Creature extends Entity {
    private int speed;
    private int healthPoint;
    private String icon;

    public Creature(String icon) {
        this.icon = icon;
    }

    public void makeMove() {
    }

    public String getIcon() {
        return icon;
    }
}
