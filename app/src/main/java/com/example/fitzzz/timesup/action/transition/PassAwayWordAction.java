package com.example.fitzzz.timesup.action.transition;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;

public class PassAwayWordAction extends GameAction {

    public PassAwayWordAction(GameActivityContext gameActivityContext) {
        super(gameActivityContext);
    }

    @Override
    public void execute() {
        String currentWord = gameActivityContext.wordToGuess.getText().toString();

        gameActivityContext.gameController.addWordToCurrentList(currentWord);
        changeWord();
    }

    private void changeWord() {
        gameActivityContext.wordToGuess.setText(gameActivityContext.gameController.nextWord());
    }
}
