package com.example.parcial2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String datoName;
    String datoLastname;
    String datoAge;
    String datoProduct;
    String cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent traer = getIntent();

        TextView datoNombre = findViewById(R.id.datoName);
        TextView datoApellido = findViewById(R.id.datoLastname);
        TextView datoEdad = findViewById(R.id.datoEdad);
        EditText datoProducto = findViewById(R.id.producto);
        EditText datoCantidad = findViewById(R.id.Cantidad);
        Button Listo = findViewById(R.id.Listo);

        String Name = traer.getStringExtra("Nombre:");
        String Apellido = traer.getStringExtra("Apellido:");
        String Edad = traer.getStringExtra("Edad:");

        datoNombre.setText(Name);
        datoApellido.setText(Apellido);
        datoEdad.setText(Edad);

        Listo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datoName = datoNombre.getText().toString().trim();
                datoLastname = datoApellido.getText().toString().trim();
                datoAge = datoEdad.getText().toString().trim();
                datoProduct = datoProducto.getText().toString().trim();
                cantidad = datoCantidad.getText().toString().trim();

                Intent Listo = new Intent(MainActivity2.this, MainActivity3.class);
                Listo.putExtra("Nombre:", datoName);
                Listo.putExtra("Apellido:", datoLastname);
                Listo.putExtra("Edad:", datoAge);
                Listo.putExtra("Producto:", datoProduct);
                Listo.putExtra("Cantidad:", cantidad);

                startActivity(Listo);
            }
        });
    }

    public void volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}