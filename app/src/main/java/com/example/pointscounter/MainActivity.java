package com.example.pointscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(a);
        displayForTeamB(b);
    }
    int a = 0;
    int b = 0;
    public void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreePointsForTeamA(View view){
        a = a + 3;
        displayForTeamA(a);
    }

    public void plusTwoPointsForTeamA(View view){
        a = a + 2;
        displayForTeamA(a);
    }

    public void plusOnePointsForTeamA(View view){
        a = a + 1;
        displayForTeamA(a);
    }

    public void plusThreePointsForTeamB(View view){
        b = b + 3;
        displayForTeamB(b);
    }

    public void plusTwoPointsForTeamB(View view){
        b = b + 2;
        displayForTeamB(b);
    }

    public void plusOnePointsForTeamB(View view){
        b = b + 1;
        displayForTeamB(b);
    }

    public void reset (View view) {
        a = 0;
        b = 0;
        displayForTeamA(a);
        displayForTeamB(b);
    }
}
