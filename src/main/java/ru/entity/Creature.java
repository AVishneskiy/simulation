package ru.entity;

import ru.Coordinate;
import ru.MapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Creature extends Entity {
    private int speed;
    private int healthPoint;

    public Creature(String icon) {
        super(icon);
    }

    public void makeMove(MapClass map, Direction direction) {
        HashMap<Coordinate, Entity> entityMap = map.getCreatures();
        Coordinate coordinateOfCreature = null;
        for (Map.Entry<Coordinate, Entity> entry : entityMap.entrySet()) {
            if (entry.getValue().equals(this)) {
                coordinateOfCreature = entry.getKey();
                entityMap.remove(entry.getKey());
            }
        }

        if (coordinateOfCreature == null) return;

        switch (direction) {
            case UP -> {
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setY(y - speed);
            }
            case DOWN -> {
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setY(y + speed);
            }
            case RIGHT -> {
                int x = coordinateOfCreature.getX();
                coordinateOfCreature.setY(x + speed);
            }
            case LEFT -> {
                int x = coordinateOfCreature.getX();
                coordinateOfCreature.setY(x - speed);
            }
            case UP_LEFT -> {
                int x = coordinateOfCreature.getX();
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setX(x - speed);
                coordinateOfCreature.setY(y - speed);
            }
            case UP_RIGHT -> {
                int x = coordinateOfCreature.getX();
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setX(x + speed);
                coordinateOfCreature.setY(y - speed);
            }
            case DOWN_LEFT -> {
                int x = coordinateOfCreature.getX();
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setX(x - speed);
                coordinateOfCreature.setY(y + speed);
            }
            case DOWN_RIGHT -> {
                int x = coordinateOfCreature.getX();
                int y = coordinateOfCreature.getY();
                coordinateOfCreature.setX(x + speed);
                coordinateOfCreature.setY(y + speed);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return speed == creature.speed && healthPoint == creature.healthPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, healthPoint);
    }
}
