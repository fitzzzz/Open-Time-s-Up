package com.example.fitzzz.timesup.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fitzzz.timesup.R;
import com.example.fitzzz.timesup.action.ActionRegister;
import com.example.fitzzz.timesup.action.GameActionEnum;
import com.example.fitzzz.timesup.action.init.InitButtonAction;
import com.example.fitzzz.timesup.action.init.InitGameAction;
import com.example.fitzzz.timesup.action.init.InitTextViewAction;
import com.example.fitzzz.timesup.action.init.InitTimerAction;
import com.example.fitzzz.timesup.action.transition.AcceptWordAction;
import com.example.fitzzz.timesup.action.transition.ChangeStepAction;
import com.example.fitzzz.timesup.action.transition.ChangeTeamAction;
import com.example.fitzzz.timesup.action.transition.FinishGameAction;
import com.example.fitzzz.timesup.action.transition.PassAwayWordAction;
import com.example.fitzzz.timesup.action.transition.StartTimerAction;
import com.example.fitzzz.timesup.action.transition.StopTimerAction;
import com.example.fitzzz.timesup.controller.GameActivityContext;
import com.example.fitzzz.timesup.controller.GameController;

public class GameActivity extends AppCompatActivity {


    private GameActivityContext gameActivityContext = new GameActivityContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int numberOfWord = getIntent().getIntExtra("numberOfWord", 30);

        gameActivityContext.gameController = new GameController(numberOfWord);
        gameActivityContext.wordToGuess = findViewById(R.id.wordToGuess);
        gameActivityContext.currentStepTextView = findViewById(R.id.currentStepTextView);
        gameActivityContext.scoreTextView = findViewById(R.id.scoreTextView);
        gameActivityContext.currentTeamTextView = findViewById(R.id.currentTeamTextView);
        gameActivityContext.timerTextView = findViewById(R.id.timerTextView);
        gameActivityContext.okButton = findViewById(R.id.okButton);
        gameActivityContext.startButton = findViewById(R.id.startButton);
        gameActivityContext.passAwayButton = findViewById(R.id.passAwayButton);
        gameActivityContext.gameActivityInstance = this;

        ActionRegister actionRegister = new ActionRegister();
        actionRegister.registerAction(GameActionEnum.INIT_TEXTVIEW, new InitTextViewAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.INIT_TIMER, new InitTimerAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.INIT_BUTTON, new InitButtonAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.INIT_GAME, new InitGameAction(gameActivityContext));

        actionRegister.registerAction(GameActionEnum.ACCEPT_WORD, new AcceptWordAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.START_TIMER, new StartTimerAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.STOP_TIMER, new StopTimerAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.CHANGE_STEP, new ChangeStepAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.CHANGE_TEAM, new ChangeTeamAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.FINISH_GAME, new FinishGameAction(gameActivityContext));
        actionRegister.registerAction(GameActionEnum.PASS_AWAY_WORD, new PassAwayWordAction(gameActivityContext));

        gameActivityContext.actionMap = actionRegister.getGameActionMap();
        gameActivityContext.actionMap.get(GameActionEnum.INIT_GAME).execute();
    }
















}
