package com.example.fitzzz.timesup.action;

import java.util.HashMap;
import java.util.Map;

public class ActionRegister {

    private Map<GameActionEnum, GameAction> gameActionMap = new HashMap<>();

    public void registerAction(GameActionEnum gameActionEnum, GameAction gameAction) {
        gameActionMap.put(gameActionEnum, gameAction);
    }

    public Map<GameActionEnum, GameAction> getGameActionMap() {
        return gameActionMap;
    }

}
