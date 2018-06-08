package com.entorno.nextu.guardar_estados2_mio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_INICIO = "estado inicio";

    private EditText editEmail, editCotraseña;
    private TextView txtInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = (EditText) findViewById(R.id.edit_mail);
        editCotraseña = (EditText) findViewById(R.id.edit_contraseña);
        txtInicio = (TextView) findViewById(R.id.txt_inicio);
    }
    public void onClickInicioSecion (View view){
        txtInicio.setText("La secion ha sido iniciada correctamente"+ "\nSeñor (a):" + editEmail.getText());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_INICIO,txtInicio.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtInicio.setText(savedInstanceState.getString(STATE_INICIO));
    }
}
