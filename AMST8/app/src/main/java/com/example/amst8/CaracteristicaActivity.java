package com.example.amst8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CaracteristicaActivity extends AppCompatActivity {
    ImageView wolv;
    TextView personaje,actor,creador,descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristica);
        Bundle bundle = getIntent().getExtras();
        wolv=findViewById(R.id.imageView2);
        personaje=findViewById(R.id.txtTitulo2);
        actor=findViewById(R.id.actor);
        creador=findViewById(R.id.creador);
        descripcion=findViewById(R.id.descripcion);

        if((bundle.getString("personaje")).equals("wolverine")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.wolverine);
            personaje.setText(bundle.getString("personaje"));
            wolv.setImageBitmap(bm);
            actor.setText("Hugh Jackman 2000-2017");
            creador.setText("Len Wein");
            descripcion.setText("Wolverine, cuyo nombre de nacimiento es James Howlett es un superhéroe ficticio que aparece en los cómics estadounidenses publicado por Marvel Comics");
        }
        if((bundle.getString("personaje")).equals("capitan")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.capitan_america);
            personaje.setText("Capitán América");
            wolv.setImageBitmap(bm);
            actor.setText("Matt Salinger (1990)\n" +
                    "Chris Evans (2011-presente)");
            creador.setText("Joe Simon");
            descripcion.setText("Capitán América cuyo nombre real es Steven Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics.");

        }
        if((bundle.getString("personaje")).equals("iron")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.iron_man);
            personaje.setText("Iron Man");
            wolv.setImageBitmap(bm);
            actor.setText("Robert Downey Jr");
            creador.setText("Stan Lee");
            descripcion.setText("Iron Man (también conocido en español como el Hombre de Hierro) es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics.");

        }
        if((bundle.getString("personaje")).equals("spidey")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.spider_man);
            personaje.setText("Spiderman");
            wolv.setImageBitmap(bm);
            actor.setText("Tom Holland (presente)");
            creador.setText("Stan Lee");
            descripcion.setText("Spider-Man (llamado Hombre Araña en muchas de las traducciones al español) es un superhéroe ficticio publicados por Marvel Comics.");

        }
        if((bundle.getString("personaje")).equals("venom")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.venom);
            personaje.setText("Venom");
            wolv.setImageBitmap(bm);
            actor.setText("Tom Hardy");
            creador.setText("Todd McFarlane");
            descripcion.setText("Venom es una película de superhéroes, basada en el personaje de Marvel, Venom, dirigida por Ruben Fleischer. La película pretende ser la primera en el Universo Marvel de Sony");

        }
        if((bundle.getString("personaje")).equals("halcon")){
            Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.arrow);
            personaje.setText("Ojo de Halcón");
            wolv.setImageBitmap(bm);
            actor.setText("Jeremy Renner (2011-presente)");
            creador.setText("Stan Lee");
            descripcion.setText("Ojo de Halcón (en inglés Hawkeye), es un superhéroe de ficción que aparece en los cómics estadounidenses publicados por Marvel Comics.  ");

        }


    }
}
