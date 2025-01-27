package ru;

import java.util.List;

public class Simulation {
    private MapClass map;
    private int countOfSteps;
    private List<Integer> actions;
    private String render;

    public Simulation(List<Integer> actions) {
        this.map = new MapClass();
        this.countOfSteps = 20;
        this.actions = actions;
        this.render = this.map.render();
    }

    public void nextTurn() {
    }

    public void startSimulation() {
    }

    public void pauseSimulation() {
    }


}
