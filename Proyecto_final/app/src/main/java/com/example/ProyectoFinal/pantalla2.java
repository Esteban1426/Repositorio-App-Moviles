package com.example.ProyectoFinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2); // Carga el diseño de la pantalla desde el archivo activity_pantalla2 XML
    }
    public void volver(View view){// Método para volver a la pantalla principal que es MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Suscribirse(View view){// Método para ir a la pantalla de suscripción que esta en la pantalla5
        Intent intent = new Intent(this, pantalla5.class);
        startActivity(intent);
    }
}
