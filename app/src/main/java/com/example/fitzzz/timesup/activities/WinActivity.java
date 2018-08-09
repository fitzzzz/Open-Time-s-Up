package com.example.fitzzz.timesup.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.fitzzz.timesup.R;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        ((TextView)findViewById(R.id.scoreTeamOneTextView)).setText(String.format(
                "%d", getIntent().getIntExtra("scoreTeam1", 0)));
        ((TextView)findViewById(R.id.scoreTeamTwoTextView)).setText(String.format(
                "%d", getIntent().getIntExtra("scoreTeam2", 0)));
    }

}
