package com.example.fitzzz.timesup.controller;

import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import com.example.fitzzz.timesup.action.GameAction;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.activities.GameActivity;

import java.util.Map;

public class GameActivityContext {

    public GameController gameController;
    public TextView scoreTextView, currentTeamTextView, wordToGuess, timerTextView, currentStepTextView;
    public Button okButton, startButton, passAwayButton;
    public Map<GameActionEnum, GameAction> actionMap;
    public long startTime = 0;

    public Handler timerHandler;
    public Runnable timerRunnable;
    public GameActivity gameActivityInstance;
}
