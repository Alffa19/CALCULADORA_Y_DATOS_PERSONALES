package com.eitsistemas.tlenguaje1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Operaciones extends AppCompatActivity
{
    EditText numero1, numero2, resultado;
    Button btnsumar, btnrestar, btnmultiplicar, btndividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        numero1 = (EditText) findViewById(R.id.txtnumero1);
        numero2 = (EditText) findViewById(R.id.txtnumero2);
        btnsumar = (Button) findViewById(R.id.btnsumar);
        btnrestar = (Button) findViewById(R.id.btnrestar);
        btnmultiplicar = (Button) findViewById(R.id.btnmultiplicacion);
        btndividir = (Button) findViewById(R.id.btndevision);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int n1 = Integer.parseInt(numero1.getText().toString());
                 int n2 = Integer.parseInt(numero2.getText().toString());
                 int result = n1 + n2;

                Toast.makeText(getApplicationContext(), "La Suma es :" + result, Toast.LENGTH_LONG).show();
                //Toast.makeText(Operaciones.this, "LA SUMA ES: "+ result, Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this, txtnombre.getText() + " - " +txtapellido.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 - n2;

                Toast.makeText(getApplicationContext(), "La Suma es :" + result, Toast.LENGTH_LONG).show();

            }
        });
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 * n2;

                Toast.makeText(getApplicationContext(), "La Suma es :" + result, Toast.LENGTH_LONG).show();

            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 / n2;

                Toast.makeText(getApplicationContext(), "La Suma es :" + result, Toast.LENGTH_LONG).show();

            }
        });
    }
}