package com.uc3m.it.helloappmov;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.ImageView;
import android.os.Handler;

import static com.uc3m.it.helloappmov.R.id.Portada;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // contador para la pantalla principal de inicio con el icono, cuando pasan esos 3000 ms
        // pasamos al menu principal.
        final int contador = 3000;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Esto sirve para esconder el actionBar.
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Funcion que muestra el nombre y el logo de la app
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                //Obtenemos referencias a los elementos del interfaz grafico
                ImageView lgtype = findViewById(R.id.Portada);
                lgtype.setImageResource(R.mipmap.ic_launcher);

                // Iniciamos la nueva actividad
                startActivity(intent);
                finish();
            }
         },contador);

    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Se recrea el menu que aparece en ActionBar de la actividad.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Se obtiene el identificador del item que ha sido seleccionado
        int id = item.getItemId();

        // Se comprueba cuál de las dos posibles opciones es, settings o about
        if (id == R.id.action_settings) {
            System.out.println("APPMOV: Settings action...");
            return true;
        }

        if (id == R.id.action_about) {
            System.out.println("APPMOV: About action...");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
