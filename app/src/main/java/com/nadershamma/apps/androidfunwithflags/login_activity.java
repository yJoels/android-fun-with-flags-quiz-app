package com.nadershamma.apps.androidfunwithflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class login_activity extends AppCompatActivity {
    private EditText edit_nombre;
    private EditText edit_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // KF
        edit_nombre = findViewById(R.id.editText_nombre);
        edit_pass = findViewById(R.id.editText_password);

    }
    public void IniciarSesion(View view){
        String nombre = edit_nombre.getText().toString();
        String pass = edit_pass.getText().toString();

        if(nombre.equals("yuri") && pass.equals("yuri")){
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("nombre",nombre.toUpperCase());
            startActivity(intent);
        }
        if(nombre.equals("joel") && pass.equals("joel")){
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("nombre",nombre.toUpperCase());
            startActivity(intent);
        }
    }
}