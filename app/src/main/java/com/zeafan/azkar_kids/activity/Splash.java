package com.zeafan.azkar_kids.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.zeafan.azkar_kids_2.R;

public class Splash extends AppCompatActivity {
Animation animationTitle;
    MediaPlayer mediaPlayer;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        mediaPlayer=MediaPlayer.create(this,R.raw.azkar0);
        mediaPlayer.start();
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ImageView title=findViewById(R.id.title);
        animationTitle= AnimationUtils.loadAnimation(this,R.anim.scale);
        title.setAnimation(animationTitle);

        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    startActivity(new Intent(getApplicationContext(), Activity_Regition_Zakr.class));
                    mediaPlayer.stop();
                    finish();
                } catch (Exception E) {
                }

            }
        }.start();

    }
}
