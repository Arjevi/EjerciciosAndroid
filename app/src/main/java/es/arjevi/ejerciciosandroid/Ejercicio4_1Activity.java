package es.arjevi.ejerciciosandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import Clases.Pedido;


public class Ejercicio4_1Activity extends ActionBarActivity {

    private Button bt_atras,bt_siguiente;
    private Spinner spinner;
    private String[] tam= {"Familiar","Grande","Mediana","Pequeña"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4_1);

        bt_atras = (Button) findViewById(R.id.ej4_1_atras);
        bt_siguiente = (Button) findViewById(R.id.ej4_1_siguiente);
        spinner = (Spinner) findViewById(R.id.ej4_1_spinner);
        rellenarSpinner();
        eventos();
    }

    private void eventos(){

        bt_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Ejercicio4Activity.class);
                startActivity(i);
            }
        });

        bt_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tamSelected = spinner.getSelectedItem().toString();

                Pedido p = new Pedido(tamSelected,"",null,null,0);
                Intent i = new Intent(getApplicationContext(),Ejercicio4_2Activity.class);
                i.putExtra("pedido", p);
                startActivity(i);
            }
        });

    }

    private void rellenarSpinner(){

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tam);
        spinner.setAdapter(adaptador);
    }
}
