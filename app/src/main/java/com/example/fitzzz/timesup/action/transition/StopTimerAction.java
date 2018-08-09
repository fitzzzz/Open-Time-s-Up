package com.example.fitzzz.timesup.action.transition;

import android.view.View;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class StopTimerAction extends GameAction {

    public StopTimerAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        gameActivityContext.timerHandler.removeCallbacks(gameActivityContext.timerRunnable);
        gameActivityContext.startButton.setVisibility(View.VISIBLE);
        gameActivityContext.wordToGuess.setText("");
        hideOkButtonAndResetButton();
    }

    private void hideOkButtonAndResetButton() {
        gameActivityContext.okButton.setVisibility(View.INVISIBLE);
        gameActivityContext.passAwayButton.setVisibility(View.INVISIBLE);
    }

}
