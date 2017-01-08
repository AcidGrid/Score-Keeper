package com.acidgrid.courtcounterapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeam1 = 0;
    int FoulsTeam1 = 0;
    int ScoreTeam2 = 0;
    int FoulsTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddOneForTeam1(View view)
    {
        ScoreTeam1++;
        DisplayNewScoreTeam1(ScoreTeam1);
    }

    public void AddFoulTeam1(View view)
    {
        FoulsTeam1++;
        DisplayNewFoulsTeam1(FoulsTeam1);

    }
    public void AddOneForTeam2(View view)
    {
        ScoreTeam2++;
        DisplayNewScoreTeam2(ScoreTeam1);
    }

    public void AddFoulTeam2(View view)
    {
        FoulsTeam2++;
        DisplayNewFoulsTeam2(FoulsTeam1);

    }

    public void Reset(View view){
        ScoreTeam1 = 0;
        FoulsTeam1 = 0;
        ScoreTeam2 = 0;
        FoulsTeam2 = 0;
        DisplayNewScoreTeam1(ScoreTeam1);
        DisplayNewFoulsTeam1(FoulsTeam1);
        DisplayNewScoreTeam2(ScoreTeam2);
        DisplayNewFoulsTeam2(FoulsTeam2);
    }


    public void DisplayNewScoreTeam1(int score)
    {
        TextView tempScore1 = (TextView) findViewById(R.id.Team1Score);
        tempScore1.setText(String.valueOf(score));
    }
    public void DisplayNewFoulsTeam1(int fouls)
    {
        TextView tempScore1 = (TextView) findViewById(R.id.Team1Fouls);
        tempScore1.setText(String.valueOf(fouls));
    }
    public void DisplayNewScoreTeam2(int score)
    {
        TextView tempScore1 = (TextView) findViewById(R.id.Team2Score);
        tempScore1.setText(String.valueOf(score));
    }
    public void DisplayNewFoulsTeam2(int fouls)
    {
        TextView tempScore1 = (TextView) findViewById(R.id.Team2Fouls);
        tempScore1.setText(String.valueOf(fouls));
    }

}
