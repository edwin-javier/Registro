package net.trabajo.envios_entregas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btnAgregar, btnEntrega;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnAgregar = (Button) findViewById(R.id.btn1);
        btnEntrega = (Button) findViewById(R.id.btn2);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregar();
            }
        });

        btnEntrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entregar();
            }
        });
    }

    private void agregar(){
        Intent actividad = new Intent(Inicio.this, Envios.class);
        startActivity(actividad);
        Inicio.this.finish();
    }

    private void entregar(){
        Intent actividad = new Intent(Inicio.this, Entregas.class);
        startActivity(actividad);
        Inicio.this.finish();
    }
}