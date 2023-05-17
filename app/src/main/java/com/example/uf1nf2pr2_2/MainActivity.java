package com.example.uf1nf2pr2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, correo;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.editNombre);
        apellidos = (EditText) findViewById(R.id.editApellido);
        correo = (EditText) findViewById(R.id.editCorreo);
        aceptar = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String apelli = apellidos.getText().toString();
                String email = correo.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarDatos.class);

                i.putExtra("name", name);
                i.putExtra("apelli", apelli);
                i.putExtra("email", email);

                startActivity(i);
            }
        });
    }
}