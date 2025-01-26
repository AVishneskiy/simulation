package ru.entity;

public abstract class Creature extends Entity {
    private int speed;
    private int healthPoint;

    public Creature(String icon) {
        super(icon);
    }

    public void makeMove() {
    }
}
