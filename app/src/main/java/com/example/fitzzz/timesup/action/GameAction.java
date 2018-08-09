package com.example.fitzzz.timesup.action;

import com.example.fitzzz.timesup.controller.GameActivityContext;

public abstract class GameAction {

    protected GameActivityContext gameActivityContext;

    public GameAction(GameActivityContext gameActivityContext) {
        this.gameActivityContext = gameActivityContext;
    }

    public abstract void execute();

}
