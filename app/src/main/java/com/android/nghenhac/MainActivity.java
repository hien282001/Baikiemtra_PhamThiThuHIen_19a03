package com.android.nghenhac;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    private Button btnChon;
    private Button btnPlay;
    private Button btnPause;
    private SeekBar seekbar;

    private TextView tvSongname;
    private TextView tvTime;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSongname =findViewById(R.id.tvSongname);
        tvTime =findViewById(R.id.tvTime);
        btnChon =(Button) findViewById(R.id.btnChon);
        btnPlay =(Button)findViewById(R.id.btnPlay);
        btnPause =(Button) findViewById(R.id.btnPause);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        int vt = bundle.getInt("position", 0);
        String bh = bundle.getString("Key_1","");
        String time = bundle.getString("Key_2","");

        tvTime.setText(time);
        tvSongname.setText(bh);
        mediaPlayer = MediaPlayer.create(this, vt);
        btnPause.setEnabled(false);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Danhsach.class);
                startActivity(intent);

            }
        });

    }
}