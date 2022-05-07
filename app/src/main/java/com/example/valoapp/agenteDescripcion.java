package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class agenteDescripcion extends AppCompatActivity {

    ImageView imgBig, habilidad1, habilidad2, habilidad3, habilidad4, imgEspecialidad, imgArma;
    TextView txtTitulo, desHabilidad1, desHabilidad2, desHabilidad3, desHabilidad4, txtNacionalidad, txtEspecialidad, txtLore, txtNomArma;
    Button btnVerVideo;
    MediaPlayer mdPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agente_descripcion);

        imgBig = (ImageView) findViewById(R.id.imgBig);
        imgEspecialidad = (ImageView) findViewById(R.id.imgEspecialidad);
        habilidad1 = (ImageView) findViewById(R.id.imgHabilidad1);
        habilidad2 = (ImageView) findViewById(R.id.imgHabilidad2);
        habilidad3 = (ImageView) findViewById(R.id.imgHabilidad3);
        habilidad4 = (ImageView) findViewById(R.id.imgHabilidad4);
        imgArma = (ImageView) findViewById(R.id.imgArmaRecomendada);

        txtTitulo = (TextView) findViewById(R.id.txtNombreAgenteBig);
        txtEspecialidad = (TextView) findViewById(R.id.txtEspecialidad);
        txtNacionalidad = (TextView) findViewById(R.id.txtNacionalidad);
        txtLore = (TextView) findViewById(R.id.txtLore);
        desHabilidad1 = (TextView) findViewById(R.id.txtHabilidad1);
        desHabilidad2 = (TextView) findViewById(R.id.txtHabilidad2);
        desHabilidad3 = (TextView) findViewById(R.id.txtHabilidad3);
        desHabilidad4 = (TextView) findViewById(R.id.txtHabilidad4);
        txtNomArma = (TextView) findViewById(R.id.txtNombreArma);

        btnVerVideo = (Button) findViewById(R.id.btnVer);

        //Recibirmos el objeto que contiene al Agente
        Gson gson = new Gson();
        Agente agente = gson.fromJson(getIntent().getStringExtra("agente"), Agente.class);




        try {

            int sound = getResources().getIdentifier(agente.getAudio(), "raw", getPackageName());
            mdPlayer = MediaPlayer.create(this, sound);
            mdPlayer.start();
        } catch (Exception e) {
            Toast.makeText(this,"Audio de Agente no encontrado",Toast.LENGTH_SHORT).show();

        }


        int imageResourceE = getResources().getIdentifier(agente.getTipo(), "drawable", getPackageName());
        Drawable resEspecialidad = getResources().getDrawable(imageResourceE);
        imgEspecialidad.setImageDrawable(resEspecialidad);

        //recibimos el la imagen del Agente que sea
        String url = agente.getImgBig();
        int imageResource = getResources().getIdentifier(url, "drawable", getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imgBig.setImageDrawable(res);

        int imageResource1 = getResources().getIdentifier(agente.getHabilidad1img(), "drawable", getPackageName());
        Drawable res1 = getResources().getDrawable(imageResource1);
        habilidad1.setImageDrawable(res1);

        int imageResource2 = getResources().getIdentifier(agente.getHabilidad2img(), "drawable", getPackageName());
        Drawable res2 = getResources().getDrawable(imageResource2);
        habilidad2.setImageDrawable(res2);

        int imageResource3 = getResources().getIdentifier(agente.getHabilidad3img(), "drawable", getPackageName());
        Drawable res3 = getResources().getDrawable(imageResource3);
        habilidad3.setImageDrawable(res3);

        int imageResource4 = getResources().getIdentifier(agente.getHabilidad4img(), "drawable", getPackageName());
        Drawable res4 = getResources().getDrawable(imageResource4);
        habilidad4.setImageDrawable(res4);

        txtTitulo.setText(agente.getNombre());

        txtNacionalidad.setText(agente.getNacionalidad());
        txtEspecialidad.setText(agente.getTipo().toUpperCase());
        txtLore.setText(agente.getLore());
        desHabilidad1.setText(agente.getHabilidad1des());
        desHabilidad2.setText(agente.getHabilidad2des());
        desHabilidad3.setText(agente.getHabilidad3des());
        desHabilidad4.setText(agente.getHabilidad4des());
        txtNomArma.setText(agente.getArmaReco());

        int imageResourcex = getResources().getIdentifier(agente.getArmaReco(), "drawable", getPackageName());
        Drawable resx = getResources().getDrawable(imageResourcex);
        imgArma.setImageDrawable(resx);

        btnVerVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(agenteDescripcion.this,videoAgente.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(agente);
                intent.putExtra("agenteVideo", myJson);

                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(agenteDescripcion.this).toBundle());
            }
        });


    }

}