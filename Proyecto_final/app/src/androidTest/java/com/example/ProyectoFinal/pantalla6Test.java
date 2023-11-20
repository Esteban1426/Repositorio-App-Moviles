package com.example.ProyectoFinal;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Intent;
import android.widget.TextView;

import static org.junit.Assert.assertEquals;


//Prueba de interfaz basica con interaccion de extraccion de informacion ficticia y comprobacion
@RunWith(AndroidJUnit4.class)
public class pantalla6Test {

    private ActivityScenario<pantalla6> scenario;

    // Método que establece los datos antes de realizar la prueba
    @Before
    public void insercion() {
        // Crear un Intent con datos simulados para la ejecucion de pantalla 6
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), pantalla6.class);
        intent.putExtra("operacionEstado", true);
        intent.putExtra("nombre", "Juan");
        intent.putExtra("apellidos", "Pérez");
        intent.putExtra("edad", "25");
        intent.putExtra("email", "juan@gmail.com");
        intent.putExtra("telefono", "3115408578");
        intent.putExtra("pais", "España");

        // Iniciar la actividad o entorno ficticio con el Intent creado
        scenario = ActivityScenario.launch(intent);
    }

    // Método para probar que los TextViews contienen los datos esperados
    @Test
    public void testTextViewsContent() {
        scenario.onActivity(activity -> {
            // Encontrar los TextViews en la actividad actual (scenario)
            TextView datoNombre = activity.findViewById(R.id.datoname);
            TextView datoApellido = activity.findViewById(R.id.datoapellido);
            TextView datoEdad = activity.findViewById(R.id.datoedad);
            TextView datoEmail = activity.findViewById(R.id.datoemail);
            TextView datoTelefono = activity.findViewById(R.id.datotelefono);
            TextView datoPais = activity.findViewById(R.id.datopais);

            // Verificar que los TextViews contienen los valores esperados
            assertEquals("Juan", datoNombre.getText().toString());
            assertEquals("Pérez", datoApellido.getText().toString());
            assertEquals("25", datoEdad.getText().toString());
            assertEquals("juan@gmail.com", datoEmail.getText().toString());
            assertEquals("3115408578", datoTelefono.getText().toString());
            assertEquals("España", datoPais.getText().toString());
        });
    }
}
