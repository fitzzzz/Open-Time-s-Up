package com.example.fitzzz.timesup.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameController {

    private List<String> usedWords;
    private List<String> currentStepWordList;
    private TeamController team1;
    private TeamController team2;
    private TeamController currentTeam;

    private GameState gameState;

    public GameController(int numberOfWord) {
        WordsController wordsController = new WordsController();

        this.usedWords = wordsController.pickWord(numberOfWord);
        this.currentStepWordList = new ArrayList<>(this.usedWords);
        this.team1 = new TeamController("Team 1");
        this.team2 = new TeamController("Team 2");
        this.currentTeam = team1;
        this.gameState = GameState.DECRIRE;
    }

    public String nextWord() {
        Random rand = new Random();

        int randomIndice = rand.nextInt(this.currentStepWordList.size());
        return this.currentStepWordList.remove(randomIndice);
    }

    public TeamController getCurrentTeam() {
        return currentTeam;
    }

    public int incrementCurrentTeamScore() {
        return this.currentTeam.incrementScore();
    }

    public boolean isCurrentStepFinish() {
        return this.currentStepWordList.isEmpty();
    }

    public TeamController changeTeam() {
        this.currentTeam = this.currentTeam == team1 ? team2 : team1;
        return this.currentTeam;
    }

    public boolean isGameFinish() {
        return isCurrentStepFinish() && gameState == GameState.UN_MIME;
    }

    public GameState nextStep() {
        if (!isLastStep()) {
            gameState = GameState.values()[gameState.ordinal() + 1];
            currentStepWordList = new ArrayList<>(this.usedWords);
        }
        return gameState;
    }

    private boolean isLastStep() {
        return GameState.values().length == gameState.ordinal() - 1;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void addWordToCurrentList(String s) {
        currentStepWordList.add(s);
    }

    public Integer[] getScores() {
        Integer[] scores = new Integer[2];

        scores[0] = team1.getScore();
        scores[1] = team2.getScore();
        return scores;
    }
}
