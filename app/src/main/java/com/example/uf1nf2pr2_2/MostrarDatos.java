package com.example.uf1nf2pr2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellidos, tvcorreo;
    Button btnOk, btnOk2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre = findViewById(R.id.tvNombre);
        tvapellidos = findViewById(R.id.tvApellidos);
        tvcorreo = findViewById(R.id.tvCorreo);
        btnOk = findViewById(R.id.btnOk);
        btnOk2 = findViewById(R.id.btnOk2);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarDatos();

        btnOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.framelay, new fragment1()
                ).commit();
            }
        });
    }

    private void mostrarDatos() {
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String apellidos = datos.getString("apelli");
        String correo = datos.getString("email");

        tvnombre.setText(nombre);
        tvapellidos.setText(apellidos);
        tvcorreo.setText(correo);

    }


}