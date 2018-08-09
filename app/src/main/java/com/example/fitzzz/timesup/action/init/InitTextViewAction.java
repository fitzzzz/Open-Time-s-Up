package com.example.fitzzz.timesup.action.init;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;
import com.example.fitzzz.timesup.controller.TeamController;

public class InitTextViewAction extends GameAction {

    public InitTextViewAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        TeamController currentTeam = gameActivityContext.gameController.getCurrentTeam();

        gameActivityContext.scoreTextView.setText(String.format("%d", currentTeam.getScore()));
        gameActivityContext.currentTeamTextView.setText(currentTeam.getName());
        gameActivityContext.currentStepTextView.setText(
                gameActivityContext.gameController.getGameState().toString())
        ;
    }
}
