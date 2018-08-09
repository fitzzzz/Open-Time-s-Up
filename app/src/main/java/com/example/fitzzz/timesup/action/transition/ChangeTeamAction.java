package com.example.fitzzz.timesup.action.transition;

import android.view.View;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;
import com.example.fitzzz.timesup.controller.TeamController;

public class ChangeTeamAction extends GameAction {

    public ChangeTeamAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        TeamController currentTeam = gameActivityContext.gameController.changeTeam();
        gameActivityContext.currentTeamTextView.setText(currentTeam.getName());
        gameActivityContext.scoreTextView.setText(String.format("%d", currentTeam.getScore()));
    }



}
