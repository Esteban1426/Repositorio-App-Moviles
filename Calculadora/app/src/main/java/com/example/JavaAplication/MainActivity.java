package com.example.JavaAplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private TextView mensaje;
    private EditText v1;
    private EditText v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.Resultado);
        v1 = findViewById(R.id.Caja1);
        v2 = findViewById(R.id.Caja2);

        Button btnSuma = findViewById(R.id.Suma);
        Button btnResta = findViewById(R.id.Resta);
        Button btnMultiplicacion = findViewById(R.id.Multiplicacion);
        Button btnDivision = findViewById(R.id.Division);
        Button btnPotenciacion = findViewById(R.id.Potencia);
        Button btnFactorial = findViewById(R.id.Factorial);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suma(view);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resta(view);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicar(view);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dividir(view);
            }
        });

        btnPotenciacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Potenciar(view);
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Factorial(view);
            }
        });
    }
    public void Suma (View view) {
        int valor1= Integer.parseInt(v1.getText().toString());
        int valor2= Integer.parseInt(v2.getText().toString());
        int Resultado = valor1 + valor2;
        mensaje.setText("El resultado es: "+Resultado);
    }
    public void Resta (View view) {
        int valor1= Integer.parseInt(v1.getText().toString());
        int valor2= Integer.parseInt(v2.getText().toString());
        int Resultado = valor1 - valor2;
        mensaje.setText("El resultado es: "+Resultado);
    }
    public void Multiplicar (View view) {
        int valor1= Integer.parseInt(v1.getText().toString());
        int valor2= Integer.parseInt(v2.getText().toString());
        int Resultado = valor1 * valor2;
        mensaje.setText("El resultado es: "+Resultado);
    }
    public void Dividir (View view) {
        int valor1= Integer.parseInt(v1.getText().toString());
        int valor2= Integer.parseInt(v2.getText().toString());

        if (valor2 == 0) {
            mensaje.setText("No se puede dividir por cero");
        } else {
            int resultado = valor1 / valor2;
            mensaje.setText("El resultado es: " + resultado);
        }
    }

    public void Potenciar(View view) {
        long base = Long.parseLong(v1.getText().toString());
        long exponente = Long.parseLong(v2.getText().toString());

        long resultado = calcularPotencia(base, exponente);
        mensaje.setText("El resultado es: " + resultado);
    }

    private long calcularPotencia(long base, long exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return 1 / calcularPotencia(base, -exponente);
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public void Factorial(View view) {
        int valor = Integer.parseInt(v1.getText().toString());
        long resultado = calcularFactorial(valor);

        if (resultado == -1) {
            mensaje.setText("No se puede calcular el factorial de un número negativo.");
        } else {
            mensaje.setText("El factorial de " + valor + " es: " + resultado);
        }
    }

    public long calcularFactorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public void MetodoF(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}