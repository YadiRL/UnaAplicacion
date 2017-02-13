package com.example.yadira.contacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAdd = (Button) findViewById(R.id.buttonguarda);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmaContacto.class);

                EditText editTextNombre = (EditText) findViewById(R.id.txtnombre);
                EditText editTextFecha = (EditText) findViewById(R.id.txtnombre);
                EditText editTextTelefono = (EditText) findViewById(R.id.txttelefono);
                EditText editTextEmail = (EditText) findViewById(R.id.txtemail);
                EditText editTextDescripcion = (EditText) findViewById(R.id.txtdescription);
                String nombre = editTextNombre.getText().toString();
                String fecha = editTextFecha.getText().toString();
                String telefono = editTextTelefono.getText().toString();
                String email = editTextEmail.getText().toString();
                String descripcion = editTextDescripcion.getText().toString();
                intent.putExtra("NOMBRE", nombre);
                intent.putExtra("FECHA", fecha);
                intent.putExtra("TELEFONO", telefono);
                intent.putExtra("EMAIL", email);
                intent.putExtra("DESCRIPCION", descripcion);
                startActivity(intent);
            }
        });

    }
}
