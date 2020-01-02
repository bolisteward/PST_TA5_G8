package com.example.amst8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio_sesion extends AppCompatActivity {
    EditText edtUsuario, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtPassword = findViewById(R.id.estPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }

    public void iniciarSesion (View v){
        if(edtUsuario.getText().toString().equals("bolisteward") && edtPassword.getText().toString().equals("bolisteward")){
            Intent intent = new Intent(this, pivote_marvelPelis.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Error de inicio de sesion o campos ingresados son incorrectos. Vuelva a intentarlo.", Toast.LENGTH_SHORT).show();
        }
    }
}
