package com.eitsistemas.tlenguaje1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MENU extends AppCompatActivity {

    Button doperaciones ,dpersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_e_n_u);

       doperaciones = (Button) findViewById(R.id.btnoperaciones);
       dpersonas = (Button) findViewById(R.id.btndatospersonales);

       doperaciones.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent operacionesm = new Intent(getApplicationContext(),Operaciones.class);
               startActivity(operacionesm);
           }
       });

       dpersonas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent datosp = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(datosp);
           }
       });
    }
}