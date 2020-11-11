package com.example.sistemadeinventarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Menu_principal extends AppCompatActivity {
    Button productos,proveedores,ventas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        productos = (Button) findViewById(R.id.btnproductos);
        proveedores = (Button) findViewById(R.id.btnproveedores);

        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Agregar_productos.class);
                startActivityForResult(intent, 0);
                finish();
            }
        });
        proveedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Agregar_proveedores.class);
                startActivityForResult(intent, 0);
                finish();
            }
        });

    }
}