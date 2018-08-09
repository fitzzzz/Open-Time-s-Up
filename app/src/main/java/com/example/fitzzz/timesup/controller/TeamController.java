package com.example.fitzzz.timesup.controller;

public class TeamController {

    private String name;
    private int    score;

    public TeamController(String name) {
        this.name = name;
        this.score = 0;
    }

    public int incrementScore() {
        this.score += 1;
        return this.score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
