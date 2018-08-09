package com.example.fitzzz.timesup.action.transition;

import android.content.Intent;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.activities.WinActivity;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class FinishGameAction extends GameAction {

    public FinishGameAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        Intent intent = new Intent(gameActivityContext.gameActivityInstance.getBaseContext(),
                WinActivity.class);

        Integer[] scores = gameActivityContext.gameController.getScores();
        intent.putExtra("scoreTeam1", scores[0]);
        intent.putExtra("scoreTeam2", scores[1]);

        gameActivityContext.gameActivityInstance.
                startActivity(intent);
    }
}
