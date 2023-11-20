package com.example.ProyectoFinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

// Clase cuya funcion es recopilar datos del formulario suscripción y enviarlos a Firestore
public class pantalla5 extends AppCompatActivity {

    private EditText etNombre;
    private EditText etApellidos;
    private EditText etEdad;
    private EditText etEmail;
    private EditText etTelefono;
    private EditText etPais;
    private Button btnListo;
    public FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);

        // Inicialización de Firestore
        db = FirebaseFirestore.getInstance();

        // Enlace de variables privadas con los elementos de diseño por su Id
        etNombre = findViewById(R.id.Name);
        etApellidos = findViewById(R.id.Lastname);
        etEdad = findViewById(R.id.age);
        etEmail = findViewById(R.id.Email);
        etTelefono = findViewById(R.id.phone);
        etPais = findViewById(R.id.Country);
        btnListo = findViewById(R.id.btnListo);

        // Configuracion de funcionalidad del Listener para el botón "Listo"
        btnListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtiene de los valores ingresados por el usuario
                String nombre = etNombre.getText().toString().trim();
                String apellidos = etApellidos.getText().toString().trim();
                String edad = etEdad.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String telefono = etTelefono.getText().toString().trim();
                String pais = etPais.getText().toString().trim();

                // Creación de un objeto (que previamente esta vacio) Usuario con los datos ingresados
                Usuario usuario = new Usuario(nombre, apellidos, edad, email, telefono, pais);

                // Agregar los datos a Firestore en la tabla o coleccion correspondiente
                db.collection("datos").add(usuario).addOnSuccessListener(documentReference -> {
                            /* Si se agrega correctamente, redirige a la pantalla 6 y enviar los datos que se colocaron
                                con estado de operacion en correcta osea true */
                            Intent intent = new Intent(pantalla5.this, pantalla6.class);
                            intent.putExtra("operacionEstado", true);
                            intent.putExtra("nombre", nombre);
                            intent.putExtra("apellidos", apellidos);
                            intent.putExtra("edad", edad);
                            intent.putExtra("email", email);
                            intent.putExtra("telefono", telefono);
                            intent.putExtra("pais", pais);
                            startActivity(intent);
                        })
                        .addOnFailureListener(e -> {
                            // Si falla la operación, redirige a la pantalla 6 con estado de operación faallida osea false
                            Intent intent = new Intent(pantalla5.this, pantalla6.class);
                            intent.putExtra("operacionEstado", false);
                            startActivity(intent);
                        });
            }
        });
    }

    public void volver(View view){// Método para volver a la pantalla principal que es MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
