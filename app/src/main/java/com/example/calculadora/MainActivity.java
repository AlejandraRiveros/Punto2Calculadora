package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casteo();
    }
    public void casteo() {
        numero1 = (EditText) findViewById(R.id.etNumero1);
        numero2 = (EditText) findViewById(R.id.etNumero2);
        respuesta = (TextView) findViewById(R.id.tvRespuesta);
    }
    public void suma(View view) {
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        double number1 = Double.parseDouble(n1);
        double number2 = Double.parseDouble(n2);
        double sumar = number1 + number2;
        respuesta.setText("La suma es: " + sumar );
    }

    public void resta (View view) {
        double n1 = Double.parseDouble(numero1.getText().toString());
        double n2 = Double.parseDouble(numero2.getText().toString());
        double restar = n1 - n2;
        respuesta.setText("La resta es " + restar);
    }

    public void division (View view) {
        double n1 = Double.parseDouble(numero1.getText().toString());
        double n2 = Double.parseDouble(numero2.getText().toString());
        double dividir = n1 / n2;
        respuesta.setText("La división es " + dividir);
    }

    public void multiplicacion (View view) {
        double n1 = Double.parseDouble(numero1.getText().toString());
        double n2 = Double.parseDouble(numero2.getText().toString());
        double multiplica = n1 * n2;
        respuesta.setText("La multiplicación es " + multiplica);
    }

    public void limpiar (View view) {
        numero1.setText("");
        numero2.setText("");
        respuesta.setText("");
    }


}