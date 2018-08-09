package com.example.fitzzz.timesup.action.transition;

import android.view.View;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class StartTimerAction extends GameAction {

    public StartTimerAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        gameActivityContext.startButton.setVisibility(View.INVISIBLE);
        revealOkButtonAndResetButton();
        changeWord();
        resetTimer();
    }

    private void revealOkButtonAndResetButton() {
        gameActivityContext.okButton.setVisibility(View.VISIBLE);
        gameActivityContext.passAwayButton.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        gameActivityContext.timerTextView.setText("30");
        gameActivityContext.startTime = System.currentTimeMillis();
        gameActivityContext.timerHandler.postDelayed(gameActivityContext.timerRunnable, 0);
    }

    private void changeWord() {
        gameActivityContext.wordToGuess.setText(gameActivityContext.gameController.nextWord());
    }


}
