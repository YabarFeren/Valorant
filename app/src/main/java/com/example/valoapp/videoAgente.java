package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.gson.Gson;

public class videoAgente extends YouTubeBaseActivity {


    YouTubePlayerView ytPlayer;
    ImageView chracterSmall;
    TextView nameSmall;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_agente);

        //Iniciador de componeentes
        ytPlayer = findViewById(R.id.ytView);
        chracterSmall = findViewById(R.id.btnImgSmall);
        nameSmall = findViewById(R.id.txtNombreAgenteSmall);


    //Llamamos a la clase del agente seleccionado anteriormente
        Gson gson = new Gson();
        Agente agente1 = gson.fromJson(getIntent().getStringExtra("agenteVideo"), Agente.class);

        //Configuracion del reproductor



        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(agente1.getUrlVideo());
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
            }
        };


        ytPlayer.initialize("AIzaSyDt0n3Xg9VY7nib2dw05JbDmgQ6Q38bszE", mOnInitializedListener);


        String url = agente1.getImgSmall();
        int imageResource = getResources().getIdentifier(url, "drawable", getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        chracterSmall.setImageDrawable(res);

        nameSmall.setText(agente1.getNombre());



    }
}