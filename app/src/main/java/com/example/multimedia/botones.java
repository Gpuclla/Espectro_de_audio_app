package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import com.gauravk.audiovisualizer.visualizer.WaveVisualizer;

import com.gauravk.audiovisualizer.base.BaseVisualizer;
import com.gauravk.audiovisualizer.visualizer.BlobVisualizer;

public class botones extends AppCompatActivity {

    ImageButton btngato, btnperro;
    WaveVisualizer mVisualizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btngato= (ImageButton) findViewById(R.id.btngato);
        btnperro=(ImageButton)findViewById(R.id.btnperro);
        mVisualizer = findViewById(R.id.circle);

        btngato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(botones.this,R.raw.aroundtheworld);
                mp.start();
                int audioSessionId = mp.getAudioSessionId();
                if (audioSessionId != -1) {
                    mVisualizer.setAudioSessionId(audioSessionId);
                }

            }
        });

        btnperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(botones.this,R.raw.perro);
                mp.start();
            }
        });

    }
    public void MensajeGato (View view){
        Toast.makeText(this,"Este es un gato",Toast.LENGTH_LONG).show();
    }

    public void MensajePerro (View view){
        Toast.makeText(this,"Este es un perro",Toast.LENGTH_LONG).show();
    }
}