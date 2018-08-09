package com.example.fitzzz.timesup.action.init;

import android.view.View;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class InitButtonAction extends GameAction {

    public InitButtonAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        this.initPassAwayButton();
        this.initNextButton();
        this.initStartButton();
    }

    private void initPassAwayButton() {
        gameActivityContext.passAwayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameActivityContext.actionMap.get(GameActionEnum.PASS_AWAY_WORD).execute();
            }
        });
    }

    private void initNextButton() {
        gameActivityContext.okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameActivityContext.actionMap.get(GameActionEnum.ACCEPT_WORD).execute();
            }
        });
    }

    private void initStartButton() {
        hideOkButtonAndResetButton();
        gameActivityContext.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameActivityContext.actionMap.get(GameActionEnum.START_TIMER).execute();
            }
        });
    }

    private void hideOkButtonAndResetButton() {
        gameActivityContext.okButton.setVisibility(View.INVISIBLE);
        gameActivityContext.passAwayButton.setVisibility(View.INVISIBLE);
    }

}
