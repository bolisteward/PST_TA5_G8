package com.example.amst8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pivote_marvelPelis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pivote_marvel_pelis);
    }
    public void wolverine(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "wolverine");
        startActivity(i);
    }
    public void capitan(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "capitan");
        startActivity(i);
    }
    public void iron(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "iron");
        startActivity(i);
    }
    public void venom(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "venom");
        startActivity(i);
    }
    public void spidey(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "spidey");
        startActivity(i);
    }
    public void halcon(View view){
        Intent i=new Intent(this, CaracteristicaActivity.class );
        i.putExtra("personaje", "halcon");
        startActivity(i);
    }
}
