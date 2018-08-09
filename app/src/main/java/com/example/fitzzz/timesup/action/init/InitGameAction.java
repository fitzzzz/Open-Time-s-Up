package com.example.fitzzz.timesup.action.init;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class InitGameAction extends GameAction {

    public InitGameAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        gameActivityContext.actionMap.get(GameActionEnum.INIT_TEXTVIEW).execute();
        gameActivityContext.actionMap.get(GameActionEnum.INIT_TIMER).execute();
        gameActivityContext.actionMap.get(GameActionEnum.INIT_BUTTON).execute();
    }
}
