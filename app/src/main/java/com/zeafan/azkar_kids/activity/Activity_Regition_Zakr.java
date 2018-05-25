package com.zeafan.azkar_kids.activity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import com.zeafan.azkar_kids.R;
public class Activity_Regition_Zakr extends AppCompatActivity {
    ImageView boy,cloud,bed,clothes,door_1,door_2,door_3,pool_water,morgin,foot,car,slaam,deek,musique,azzan,helal,Osoo,Mosab;
    ImageView Azkar_18,Rain,Dunge,door_4,azkar_22,azkar_23,azkar_24;
    Animation anim_alpha;
    MediaPlayer mediaPlayer;
    AnimationDrawable anim_draw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.regition_zakr);
        ViewCompat.setLayoutDirection(findViewById(R.id.layer_id_relotion_zakr), ViewCompat.LAYOUT_DIRECTION_LTR);
        inintializeUI();
        setAnimation();
    }
    void setAnimation()
    {
        boy.setBackgroundResource(R.drawable.azkar_boy_speak);
        anim_draw=(AnimationDrawable)boy.getBackground();
        bed.setAnimation(anim_alpha);
        clothes.setAnimation(anim_alpha);
        door_1.setAnimation(anim_alpha);
        door_2.setAnimation(anim_alpha);
        door_3.setAnimation(anim_alpha);
        pool_water.setAnimation(anim_alpha);
        morgin.setAnimation(anim_alpha);
        foot.setAnimation(anim_alpha);
        car.setAnimation(anim_alpha);
        slaam.setAnimation(anim_alpha);
        deek.setAnimation(anim_alpha);
        musique.setAnimation(anim_alpha);
        azzan.setAnimation(anim_alpha);
        helal.setAnimation(anim_alpha);
        Osoo.setAnimation(anim_alpha);
        Mosab.setAnimation(anim_alpha);
        Azkar_18.setAnimation(anim_alpha);
        Rain.setAnimation(anim_alpha);
        Dunge.setAnimation(anim_alpha);
        door_4.setAnimation(anim_alpha);
        azkar_22.setAnimation(anim_alpha);
        azkar_23.setAnimation(anim_alpha);
        azkar_24.setAnimation(anim_alpha);
    }
    void inintializeUI()
    {
        boy=(ImageView)findViewById(R.id.boy_speak_id);
        cloud=(ImageView)findViewById(R.id.cloud_img);
        bed = (ImageView) findViewById(R.id.imageView13);
        clothes=(ImageView)findViewById(R.id.clothes_t);
        door_1=(ImageView)findViewById(R.id.imageView15);
        door_2=(ImageView)findViewById(R.id.door_2);
        door_3=(ImageView)findViewById(R.id.door_3);
        morgin=(ImageView)findViewById(R.id.goodmorgin_azkar);
        pool_water=(ImageView)findViewById(R.id.pool_water);
        foot=(ImageView)findViewById(R.id.foot_table);
        car=(ImageView)findViewById(R.id.car);
        slaam=(ImageView)findViewById(R.id.AlSlaam);
        deek=(ImageView)findViewById(R.id.deek);
        musique=(ImageView)findViewById(R.id.musique);
        azzan=(ImageView)findViewById(R.id.imageView22);
        helal=(ImageView)findViewById(R.id.azkar_15);
        Osoo=(ImageView)findViewById(R.id.azkar_16);
        Mosab=(ImageView)findViewById(R.id.azkar_17);
        Azkar_18=(ImageView)findViewById(R.id.azkar_18);
        Rain=(ImageView)findViewById(R.id.azkar_19);
        Dunge=(ImageView)findViewById(R.id.azkar_20);
        door_4=(ImageView)findViewById(R.id.azkar_21);
        azkar_22=(ImageView)findViewById(R.id.azkar_22);
        azkar_23=(ImageView)findViewById(R.id.azkar_23);
        azkar_24=(ImageView)findViewById(R.id.azkar_24);
        anim_alpha= AnimationUtils.loadAnimation(this,R.anim.alpha);
    }

    public void Action_closet(View view) {
        Run_Azkar(clothes,R.drawable.room_04_open,R.drawable.room_04_close,R.raw.azkar_7,R.drawable.azkar_7);
    }
    public void Action_bed(View view) {
        Run_Azkar(bed,R.drawable.bed,R.drawable.bed,R.raw.azkar_1,R.drawable.azkar_1);

    }
    public void Action_door_1(View view) {
        Run_Azkar(door_1,R.drawable.azkar_room_open,R.drawable.azkar_room_close,R.raw.azkar_2,R.drawable.azkar_2);
    }
    void Run_Azkar(final ImageView img, final int id_imgafter, final int id_finish, int id_media, int id_cloud) {
        Dis_EnableViews(false);
        img.setImageResource(id_imgafter);
        cloud.setImageResource(id_cloud);
        cloud.setVisibility(View.VISIBLE);
        boy.setVisibility(View.VISIBLE);
        anim_draw.start();
        img.clearAnimation();
        mediaPlayer=MediaPlayer.create(this,id_media);
        mediaPlayer.start();
        new CountDownTimer(mediaPlayer.getDuration(),mediaPlayer.getDuration()-10)
        {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                img.setAnimation(anim_alpha);
                img.setImageResource(id_finish);
                cloud.setVisibility(View.GONE);
                boy.setVisibility(View.GONE);
                anim_draw.stop();
                Dis_EnableViews(true);
            }
        }.start();
    }
    void Dis_EnableViews(boolean check) {
        bed.setEnabled(check);
        clothes.setEnabled(check);
        door_1.setEnabled(check);
        door_2.setEnabled(check);
        door_3.setEnabled(check);
        pool_water.setEnabled(check);
        morgin.setEnabled(check);
        foot.setEnabled(check);
        car.setEnabled(check);
        slaam.setEnabled(check);
        deek.setEnabled(check);
        musique.setEnabled(check);
        azzan.setEnabled(check);
        helal.setEnabled(check);
        Osoo.setEnabled(check);
        Mosab.setEnabled(check);
        Azkar_18.setEnabled(check);
        Rain.setEnabled(check);
        Dunge.setEnabled(check);
        door_4.setEnabled(check);
        azkar_22.setEnabled(check);
        azkar_23.setEnabled(check);
        azkar_24.setEnabled(check);
    }

    public void Action_door_2(View view) {
        Run_Azkar(door_2,R.drawable.azkar_room_open,R.drawable.azkar_room_close,R.raw.azkar_3,R.drawable.azkar_3);
    }
    public void Action_door_3(View view) {
        Run_Azkar(door_3,R.drawable.azkar_room_open,R.drawable.azkar_room_close,R.raw.azkar_8,R.drawable.azkar_8);
    }

    public void Action_water(View view) {
        Run_Azkar(pool_water,R.drawable.room2_water,R.drawable.room2_water,R.raw.azkar_4,R.drawable.azkar_4);

    }

    public void Action_goodMorgin(View view) {
        Run_Azkar(morgin,R.drawable.room3_azkar,R.drawable.room3_azkar,R.raw.azkar_5,R.drawable.azkar_5);
    }

    public void foot_table(View view) {
        Run_Azkar(foot,R.drawable.foottable,R.drawable.foottable,R.raw.azkar_6,R.drawable.azkar_6);

    }

    public void Hello(View view) {
        Run_Azkar(slaam,R.drawable.hello_1,R.drawable.hello_2,R.raw.azkar_10,R.drawable.azkar_10);
    }

    public void Action_Deek(View view) {
        Run_Azkar(deek,R.drawable.deek1,R.drawable.deek2,R.raw.azkar_11,R.drawable.azkar_11);
    }
boolean check=true;
    public void Action_Musique(View view) {
        if(check)
        {
            Run_Azkar(musique,R.drawable.musique1,R.drawable.musique2,R.raw.azkar_12,R.drawable.azkar_12);
            check=false;
        }
        else{
            Run_Azkar(musique,R.drawable.musique1,R.drawable.musique2,R.raw.azkar_13,R.drawable.azkar_13);
            check=true;
        }
    }

    public void Action_Azaan(View view) {
        Run_Azkar(azzan,R.drawable.azaan,R.drawable.azaan,R.raw.azkar_14,R.drawable.azkar_14);

    }

    public void Action_car(View view) {
        Run_Azkar(car,R.drawable.car_open,R.drawable.car_close,R.raw.azkar_9,R.drawable.azkar_9);
    }

    public void Oooos(View view) {
        Run_Azkar(Osoo,R.drawable.azkar_boy_16_,R.drawable.azkar_boy_16_,R.raw.azkar_16,R.drawable.azkar_16);

    }

    public void Mosab(View view) {
        Run_Azkar(Mosab,R.drawable.azkar_17_img,R.drawable.azkar_17_img,R.raw.azkar_17,R.drawable.azkar_17);

    }

    public void Helal(View view) {
        Run_Azkar(helal,R.drawable.hilal,R.drawable.hilal,R.raw.azkar_15,R.drawable.azkar_15);
    }

    public void Action_Azkaar_20(View view) {
        Run_Azkar(Dunge,R.drawable.azkar_20_img,R.drawable.azkar_20_img,R.raw.azkar_20,R.drawable.azkar_20);

    }

    public void Action_Azkaar_19(View view) {
        Run_Azkar(Rain,R.drawable.azkar_19_rain,R.drawable.azkar_19_rain,R.raw.azkar_19,R.drawable.azkar_19);

    }

    public void Action_Azkar21(View view) {
        Run_Azkar(door_4,R.drawable.azkar_room_open,R.drawable.azkar_room_close2,R.raw.azkar_21,R.drawable.azkar_21);
    }

    public void azkar_18(View view) {
        Run_Azkar(Azkar_18,R.drawable.azkar_18_img,R.drawable.azkar_18_img,R.raw.azkar_18,R.drawable.azkar_18);
    }

    public void Action_Azkar_24(View view) {
        Run_Azkar(azkar_24,R.drawable.bed,R.drawable.bed,R.raw.azkar_24,R.drawable.azkar_24);

    }

    public void Action_Azkar_23(View view) {
        Run_Azkar(azkar_23,R.drawable.room3_azkar,R.drawable.room3_azkar,R.raw.azkar_23,R.drawable.azkar_23);

    }
    public void Action_Azkar_22(View view) {
        Run_Azkar(azkar_22,R.drawable.azkar_22_img,R.drawable.azkar_22_img,R.raw.azkar_22,R.drawable.azkar_22);

    }

    public void Back_Main(View view) {
        final AlertDialog.Builder alerm_Exit = new AlertDialog.Builder(Activity_Regition_Zakr.this);
        View view_Saved = getLayoutInflater().inflate(R.layout.dailog_alerm_exit_app, null);
        Button btn_yes = (Button) view_Saved.findViewById(R.id.id_yse2);
        Button btn_No = (Button) view_Saved.findViewById(R.id.btn_No2);
        alerm_Exit.setView(view_Saved);
        final AlertDialog ad = alerm_Exit.show();
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    finish();
                    System.exit(0);
            }
        });
        btn_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.dismiss();
            }
        });
    }
}
