package com.mjbor.fiveseconds.models;

/**
 * Created by mjbor on 1/21/2018.
 */

public class Player {

    private String name;
    private int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
}
