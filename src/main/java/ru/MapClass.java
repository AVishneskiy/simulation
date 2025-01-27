package ru;

import ru.entity.Creature;
import ru.entity.Entity;
import ru.entity.Herbivore;

import java.util.HashMap;

public class MapClass {
    private final int width = 20;
    private final int height = 10;
    HashMap<Coordinate, Entity> creatures = new HashMap<>();

    public HashMap<Coordinate, Entity> getCreatures() {
        return creatures;
    }

    public void setCreatures(Coordinate coordinate, Creature creature) {
        this.creatures.put(coordinate, creature);
    }

    public String render() {
        StringBuilder map = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Coordinate coordinate = new Coordinate(x, y);
                if (creatures.containsKey(coordinate)) {
                    map.append(creatures.get(coordinate).getIcon()).append(" ");
                } else {
                    map.append(".. ");
                }
            }
            map.append("\n");
        }
        return map.toString();
    }

    public static void main(String[] args) {
        MapClass map = new MapClass();
        map.setCreatures(new Coordinate(0, 0), new Herbivore());
        System.out.println(map.render());
    }
}
