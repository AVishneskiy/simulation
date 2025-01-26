package ru;

public class Grass extends Entity {
    private final String icon = "\uD83C\uDF31";
    private final boolean isEatable = true;

    public String getIcon() {
        return icon;
    }

    public boolean isEatable() {
        return isEatable;
    }
}
