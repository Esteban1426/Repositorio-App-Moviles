package com.example.ProyectoFinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Carga el diseño de la pantalla desde el archivo activity_MainActivity XML
    }

    public void noticia2(View view){// Método para iniciar la actividad pantalla2 al hacer clic en una noticia elegida
        Intent intent = new Intent(this, pantalla2.class);
        startActivity(intent);
    }

    public void noticia3(View view){// Método para iniciar la actividad pantalla3 al hacer clic en una noticia elegida
        Intent intent = new Intent(this, pantalla3.class);
        startActivity(intent);
    }

    public void noticia4(View view){// Método para iniciar la actividad pantalla4 al hacer clic en una noticia elegida
        Intent intent = new Intent(this, pantalla4.class);
        startActivity(intent);
    }

    public void Suscribirse(View view){// Método para iniciar la actividad pantalla5 al hacer clic en el botón de suscripción redirigiendolo al formulario
        Intent intent = new Intent(this, pantalla5.class);
        startActivity(intent);
    }
}
