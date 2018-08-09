package com.example.fitzzz.timesup.action.transition;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.controller.GameActivityContext;
import com.example.fitzzz.timesup.controller.GameState;

public class ChangeStepAction extends GameAction {

    public ChangeStepAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        GameState gameState = gameActivityContext.gameController.nextStep();

        gameActivityContext.currentStepTextView.setText(gameState.toString());
        gameActivityContext.actionMap.get(GameActionEnum.CHANGE_TEAM).execute();
        gameActivityContext.actionMap.get(GameActionEnum.STOP_TIMER).execute();
    }


}
