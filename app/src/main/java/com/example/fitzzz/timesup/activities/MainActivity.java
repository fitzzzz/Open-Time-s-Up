package com.example.fitzzz.timesup.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fitzzz.timesup.R;

public class MainActivity extends AppCompatActivity {

    private Intent nexActivity;
    private Button startGameButton;
    private EditText numberOfWordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGameButton = findViewById(R.id.startButton);
        numberOfWordInput = findViewById(R.id.numberOfWordInput);
        nexActivity = new Intent(MainActivity.this, GameActivity.class);

        initStartButton();
    }


    private void initStartButton() {
        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numberOfWordIsEmpty()) {
                    int number = Integer.parseInt(numberOfWordInput.getText().toString());
                    nexActivity.putExtra("numberOfWord", number);
                }
                startActivity(nexActivity);
            }
        });

    }

    private boolean numberOfWordIsEmpty() {
        return TextUtils.isEmpty(numberOfWordInput.getText());
    }
}
