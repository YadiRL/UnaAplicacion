package com.example.yadira.contacto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Yadira on 11/02/2017.
 */

public class ConfirmaContacto extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         /*Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.app_name));
        String fechanac = parametros.getString(getResources().getString(R.string.app_name));
        String telefono = parametros.getString(getResources().getString(R.string.app_name));
        String email = parametros.getString(getResources().getString(R.string.app_name));
        String descripcion = parametros.getString(getResources().getString(R.string.app_name));
*/
        TextView tvnombre=(TextView) findViewById(R.id.ctxtnombre);
        TextView tvfecha=(TextView) findViewById(R.id.cdate);
        TextView tvtelefono=(TextView) findViewById(R.id.ctxttelefono);
        TextView tvemail=(TextView) findViewById(R.id.ctxtemail);
        TextView tvdescripcion=(TextView) findViewById(R.id.ctxtdescription);

        Intent intent= getIntent();
        //String nombre = intent.getStringExtra(getString(R.string.intent));
        String nombre = intent.getStringExtra("NOMBRE");
        String fechanac = intent.getStringExtra("FECHA");
        String telefono = intent.getStringExtra("TELEFONO");
        String email = intent.getStringExtra("EMAIL");
        String descripcion = intent.getStringExtra("NOMBRE");



        tvnombre.setText(nombre);
        tvfecha.setText(fechanac);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescripcion.setText(descripcion);
        Button buttonAdd = (Button) findViewById(R.id.buttoneditar);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmaContacto.this, MainActivity.class);

                TextView editTextNombre = (TextView) findViewById(R.id.ctxtnombre);
                TextView editTextFecha = (TextView) findViewById(R.id.cdate);
                TextView editTextTelefono = (TextView) findViewById(R.id.ctxttelefono);
                TextView editTextEmail = (TextView) findViewById(R.id.ctxtemail);
                TextView editTextDescripcion = (TextView) findViewById(R.id.ctxtdescription);
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
