package com.example.telek.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreA, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    private void threePointer(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    private void twoPointer(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    private void freeThrow(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    private void threePointerB(View view) {
        scoreB = scoreB + 3;
        displayForTeamA(scoreB);
    }

    private void twoPointerB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    private void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    private void resetScore(View view)
    {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}
