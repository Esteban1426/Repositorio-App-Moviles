package com.example.JavaAplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText NumeroUsuario;
    Button BotonCalcular;
    TextView Listafibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        NumeroUsuario = findViewById(R.id.numeroPosi);
        BotonCalcular = findViewById(R.id.CF);
        Listafibonacci = findViewById(R.id.resultadof);

        BotonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMetodoFibonacci();
            }
        });
    }

    public void calcularMetodoFibonacci() {
        int n = Integer.parseInt(NumeroUsuario.getText().toString());

        StringBuilder sequenceBuilder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            int fib = fibonacci(i);
            sequenceBuilder.append(fib);
            if (i < n) {
                sequenceBuilder.append(", ");
            }
        }

        Listafibonacci.setText("Lista de Fibonacci hasta la posición " + n + ":\n" + sequenceBuilder.toString());
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    public void Volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}