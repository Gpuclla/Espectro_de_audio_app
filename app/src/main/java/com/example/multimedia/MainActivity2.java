package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chibde.visualizer.BarVisualizer;
import com.chibde.visualizer.CircleBarVisualizer;
import com.chibde.visualizer.CircleVisualizer;
import com.chibde.visualizer.LineBarVisualizer;
import com.chibde.visualizer.LineVisualizer;
import com.chibde.visualizer.SquareBarVisualizer;

public class MainActivity2 extends AppCompatActivity {
    public MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //initializing the media player
        mediaPlayer = MediaPlayer.create( this,R.raw.aroundtheworld);

        //playing media
        mediaPlayer.start();
    }

    public void lineVisualization(View view) {
        LineVisualizer lineVisualizer = findViewById(R.id.visualizerLine);

        lineVisualizer.setVisibility(View.VISIBLE);

        // set a custom color to the line.
        lineVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor1));

        // set the line width for the visualizer between 1-10 default is  1.
        lineVisualizer.setStrokeWidth(1);

        // Setting the media player to the visualizer.
        lineVisualizer.setPlayer(mediaPlayer.getAudioSessionId());
        Toast.makeText(MainActivity2.this,"Pausa",Toast.LENGTH_SHORT).show();
    }

    public void barVisualization(View view) {
        BarVisualizer barVisualizer = findViewById(R.id.visualizerBar);

        barVisualizer.setVisibility(View.VISIBLE);
        // set the custom color to the line.
        barVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor2));

        // define a custom number of bars we want in the visualizer it is between (10 - 256).
        barVisualizer.setDensity(80);

        // Set your media player to the visualizer.
        barVisualizer.setPlayer(mediaPlayer.getAudioSessionId());
    }

    public void circleBarVisualization(View view) {
        CircleBarVisualizer circleBarVisualizer = findViewById(R.id.visualizerCircleBar);

        circleBarVisualizer.setVisibility(View.VISIBLE);

        // set the custom color to the line.
        circleBarVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor3));

        // Set the media player to the visualizer.
        circleBarVisualizer.setPlayer(mediaPlayer.getAudioSessionId());
    }

    public void circleVisualization(View view) {

        CircleVisualizer circleVisualizer = findViewById(R.id.visualizerCircle);

        circleVisualizer.setVisibility(View.VISIBLE);

        // set custom color to the line.
        circleVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor4));

        // Customize the size of the circle. by default, the multipliers are 1.
        circleVisualizer.setRadiusMultiplier(2.2f);

        // set the line with for the visualizer between 1-10 default 1.
        circleVisualizer.setStrokeWidth(2);

        // Set the media player to the visualizer.
        circleVisualizer.setPlayer(mediaPlayer.getAudioSessionId());
    }

    public void squareBarVisualization(View view) {
        SquareBarVisualizer squareBarVisualizer = findViewById(R.id.visualizerSquareBar);

        squareBarVisualizer.setVisibility(View.VISIBLE);

        // set custom color to the line.
        squareBarVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor5));

        // define a custom number of bars you want in the visualizer between (10 - 256).
        squareBarVisualizer.setDensity(65);

        // Set Spacing
        squareBarVisualizer.setGap(2);

        // Set the media player to the visualizer.
        squareBarVisualizer.setPlayer(mediaPlayer.getAudioSessionId());

    }

    public void lineBarVisualization(View view) {
        LineBarVisualizer lineBarVisualizer = findViewById(R.id.visualizerLineBar);

        lineBarVisualizer.setVisibility(View.VISIBLE);

        // setting the custom color to the line.
        lineBarVisualizer.setColor(ContextCompat.getColor(this, R.color.myColor6));

        // define the custom number of bars we want in the visualizer between (10 - 256).
        lineBarVisualizer.setDensity(60);

        // Setting the media player to the visualizer.
        lineBarVisualizer.setPlayer(mediaPlayer.getAudioSessionId());
    }

}