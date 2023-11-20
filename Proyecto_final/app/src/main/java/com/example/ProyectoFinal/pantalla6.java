package com.example.ProyectoFinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// Clase cuya funcion es recopilar datos del formulario suscripción e imprimirlos en pantalla 6
public class pantalla6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla6);

        // Obtiene los datos enviados desde pantalla 5 y el estado de la operacion
        Intent intent = getIntent();
        boolean operacionEstado = intent.getBooleanExtra("operacionEstado", false);

        // Enlace con los TextViews con elementos de diseño
        TextView datoNombre = findViewById(R.id.datoname);
        TextView datoApellido = findViewById(R.id.datoapellido);
        TextView datoEdad = findViewById(R.id.datoedad);
        TextView datoEmail = findViewById(R.id.datoemail);
        TextView datoTelefono = findViewById(R.id.datotelefono);
        TextView datoPais = findViewById(R.id.datopais);

        // Verificar si la operación de almacenamiento en la base de datos fue exitosa
        if (operacionEstado){
            // Obtener datos almacenados de pantalla 5
            String nombre = intent.getStringExtra("nombre");
            String apellidos = intent.getStringExtra("apellidos");
            String edad = intent.getStringExtra("edad");
            String email = intent.getStringExtra("email");
            String telefono = intent.getStringExtra("telefono");
            String pais = intent.getStringExtra("pais");

            // Muestra el mensaje de éxito en Toast osea como alerta
            Toast.makeText(this, "Datos almacenados correctamente", Toast.LENGTH_SHORT).show();

            // Establecer los datos en los TextViews correspondientes
            datoNombre.setText(nombre);
            datoApellido.setText(apellidos);
            datoEdad.setText(edad);
            datoEmail.setText(email);
            datoTelefono.setText(telefono);
            datoPais.setText(pais);
        } else {
            // Si la operación fallo muestra el mensaje en Toast osea como alerta
            Toast.makeText(this, "No se pudieron almacenar los datos", Toast.LENGTH_SHORT).show();

            // Redirige a pantalla 5 nuevamente si la operación falla para que
            Intent repetir = new Intent(this, pantalla5.class);
            startActivity(repetir);
        }
    }

    // Método para volver a la pantalla principal que es MainActivity
    public void volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
