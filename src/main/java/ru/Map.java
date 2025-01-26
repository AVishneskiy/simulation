package ru;

import ru.entity.Creature;
import ru.entity.Herbivore;

import java.util.HashMap;

public class Map {
    private final int width = 20;
    private final int height = 10;
    HashMap<Coordinate, Creature> creatures = new HashMap<>();

    public HashMap<Coordinate, Creature> getCreatures() {
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
                    map.append("|" + creatures.get(coordinate).getIcon());
                } else {
                    map.append("| _ ");
                }
            }
            map.append("\n");
        }
        return map.toString();
    }

    public static void main(String[] args) {
        Map map = new Map();
        map.setCreatures(new Coordinate(0, 0), new Herbivore());
        System.out.println(map.render());
    }
}
