package com.example.fitzzz.timesup.action.transition;

import android.annotation.SuppressLint;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class AcceptWordAction extends GameAction {

    public AcceptWordAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        incrementScore();
        if (!gameActivityContext.gameController.isCurrentStepFinish()) {
            changeWord();
        } else {
            if (gameActivityContext.gameController.isGameFinish()) {
                gameActivityContext.actionMap.get(GameActionEnum.FINISH_GAME).execute();
            } else {
                gameActivityContext.actionMap.get(GameActionEnum.CHANGE_STEP).execute();
            }
        }

    }

    private void changeWord() {
        gameActivityContext.wordToGuess.setText(gameActivityContext.gameController.nextWord());
    }

    @SuppressLint("DefaultLocale")
    private void incrementScore() {
        gameActivityContext.scoreTextView.setText(String.format("%d", gameActivityContext.gameController.incrementCurrentTeamScore()));
    }
}
