package ru.entity;

public class Grass extends Entity {
    private final boolean isEatable = true;

    public Grass() {
        super("\uD83C\uDF31");
    }

    public boolean isEatable() {
        return isEatable;
    }
}
