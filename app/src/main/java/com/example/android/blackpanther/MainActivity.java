package com.example.android.blackpanther;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.blackpanther.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 10;
    int scoreTeamB = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Decrease the score for Black Panther by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamA = scoreTeamA - 1;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Decrease the score for Black Panther by 2 point.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamA = scoreTeamA - 2;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Decrease the score for Black Panther by 3 point.
     */
    public void addThreeForTeamB(View v) {

        scoreTeamA = scoreTeamA - 3;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Decrease the score for Killmonger by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamB = scoreTeamB - 1;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Decrease the score for Killmonger by 2 point.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamB = scoreTeamB - 2;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Decrease the score for Killmonger by 3 point.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamB = scoreTeamB - 3;

        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamB = 10;
        scoreTeamA = 10;

        displayForTeamB(scoreTeamA);
        displayForTeamA(scoreTeamB);
    }

    /**
     * Displays the given score for Black Panther.
     */
    public void displayForTeamA(int score) {

        if (score <= 0) {
            displayGameOVerA("Game Over\n Killmonger Wins!!!");
            displayGameOVerB("Game Over\n Killmonger Wins!!!");
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }
    }

    /**
     * Displays the given score for Killmonger.
     */
    public void displayForTeamB(int score) {
        if (score <= 0) {
            displayGameOVerB("Game Over\n Black Panther Wins!!!");
            displayGameOVerA("Game Over\n Black Panther Wins!!!");
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }
    }

    /**
     * Displays Game over for Black Panther if Life is 0 or less
     */
    public void displayGameOVerA(String over) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(over));
    }

    /**
     * Displays Game over for Killmonger if Life is 0 or less
     */
    public void displayGameOVerB(String over) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(over));
    }
}