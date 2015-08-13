package es.arjevi.ejerciciosandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Ejercicio4Activity extends ActionBarActivity {

    private Button bt_comenzar,bt_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        bt_comenzar=(Button) findViewById(R.id.ej4_comenzar);
        bt_salir=(Button) findViewById(R.id.ej4_salir);

        bt_comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Ejercicio4_1Activity.class);
                startActivity(i);
            }
        });
    }


}
