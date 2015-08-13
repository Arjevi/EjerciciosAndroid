package es.arjevi.ejerciciosandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button bt_1, bt_2, bt_3,bt_4,bt_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declararElementos();
        eventos();

    }

    private void declararElementos(){

        bt_1 = (Button) findViewById(R.id.ma_ejercicio1);
        bt_2 = (Button) findViewById(R.id.ma_ejercicio2);
        bt_3 = (Button) findViewById(R.id.ma_ejercicio3);
        bt_4 = (Button) findViewById(R.id.ma_ejercicio4);

    }

    private void eventos(){

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ejercicio1Activity.class);
                startActivity(i);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ejercicio2Activity.class);
                startActivity(i);
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ejercicio3Activity.class);
                startActivity(i);
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ejercicio4Activity.class);
                startActivity(i);
            }
        });



    }




}
