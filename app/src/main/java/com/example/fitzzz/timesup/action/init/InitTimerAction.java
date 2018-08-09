package com.example.fitzzz.timesup.action.init;

import android.os.Handler;
import android.view.View;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.controller.GameActivityContext;
import com.example.fitzzz.timesup.controller.TeamController;

public class InitTimerAction extends GameAction {

    public InitTimerAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        gameActivityContext.timerHandler = new Handler();
        gameActivityContext.timerRunnable = new Runnable() {

            @Override
            public void run() {
                long millis = System.currentTimeMillis() - gameActivityContext.startTime;
                int seconds = (int) (millis / 1000);
                //int minutes = seconds / 60;
                seconds = seconds % 60;

                int timeLeft = 30 - seconds;
                gameActivityContext.timerTextView.setText(String.format("%02d", timeLeft));

                if (timeLeft <= 0) {
                    gameActivityContext.gameController.addWordToCurrentList(
                            gameActivityContext.wordToGuess.getText().toString());
                    gameActivityContext.wordToGuess.setText("");
                    gameActivityContext.actionMap.get(GameActionEnum.STOP_TIMER).execute();
                    gameActivityContext.actionMap.get(GameActionEnum.CHANGE_TEAM).execute();
                } else {
                    gameActivityContext.timerHandler.postDelayed(this, 500);
                }
            }
        };
    }


}
