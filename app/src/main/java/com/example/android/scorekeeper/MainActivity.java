package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int goalTeamLatvia = 0;
    int goalTeamGermany = 0;
    int gwsTeamLatvia = 0;
    int gwsTeamGermany = 0;
    int pmTeamLatvia = 0;
    int pmTeamGermany = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamLatvia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_Latvia);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamGermany(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_Germany);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGwsForTeamLatvia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gws_team_Latvia);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGwsForTeamGermany(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gws_team_Germany);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPmForTeamLatvia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pm_team_Latvia);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPmForTeamGermany(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pm_team_Germany);
        scoreView.setText(String.valueOf(score));
    }

    public void scoreTeamLatvia (View view){
        goalTeamLatvia = goalTeamLatvia + 1;
        displayForTeamLatvia(goalTeamLatvia);
    }

    public void scoreTeamGermany (View view){
        goalTeamGermany = goalTeamGermany + 1;
        displayForTeamGermany(goalTeamGermany);
    }

    public void gwsTeamLatvia (View view){
        gwsTeamLatvia = gwsTeamLatvia + 1;
        displayGwsForTeamLatvia(gwsTeamLatvia);
    }

    public void gwsTeamGermany (View view){
        gwsTeamGermany = gwsTeamGermany + 1;
        displayGwsForTeamGermany(gwsTeamGermany);
    }

    public void twoPmTeamLatvia (View view){
        pmTeamLatvia = pmTeamLatvia + 2;
        displayPmForTeamLatvia(pmTeamLatvia);
    }

    public void twoPmTeamGermany (View view){
        pmTeamGermany = pmTeamGermany + 2;
        displayPmForTeamGermany(pmTeamGermany);
    }

    public void fivePmTeamLatvia (View view){
        pmTeamLatvia = pmTeamLatvia + 5;
        displayPmForTeamLatvia(pmTeamLatvia);
    }

    public void fivePmTeamGermany (View view){
        pmTeamGermany = pmTeamGermany + 5;
        displayPmForTeamGermany(pmTeamGermany);
    }

    public void tenPmTeamLatvia (View view){
        pmTeamLatvia = pmTeamLatvia + 10;
        displayPmForTeamLatvia(pmTeamLatvia);
    }

    public void tenPmTeamGermany (View view){
        pmTeamGermany = pmTeamGermany + 10;
        displayPmForTeamGermany(pmTeamGermany);
    }

    public void reset (View view){
        goalTeamLatvia = 0;
        goalTeamGermany = 0;
        gwsTeamLatvia = 0;
        gwsTeamGermany = 0;
        pmTeamLatvia = 0;
        pmTeamGermany = 0;
        displayForTeamLatvia(goalTeamLatvia);
        displayForTeamGermany(goalTeamGermany);
        displayGwsForTeamLatvia(gwsTeamLatvia);
        displayGwsForTeamGermany(gwsTeamGermany);
        displayPmForTeamLatvia(pmTeamLatvia);
        displayPmForTeamGermany(pmTeamGermany);
    }
}
