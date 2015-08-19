package es.arjevi.ejerciciosandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import Clases.Pedido;


public class Ejercicio4_2Activity extends ActionBarActivity {

    private Button bt_atras,bt_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4_2);
        declaracion();

        /*Recibir objeto de parcelable*/
        Bundle b = getIntent().getExtras();

        if(b!=null){
            try{
                Pedido p = b.getParcelable("pedido");
                Toast.makeText(this, ""+b.toString(), Toast.LENGTH_LONG).show();

            }catch (Exception e){
                Log.i("exp", e.toString());
            }


        }

        eventos();
    }

    private void declaracion(){

        bt_atras = (Button) findViewById(R.id.ae_4_2_bt_atras);
        bt_siguiente = (Button) findViewById(R.id.ae_4_2_bt_siguiente);
    }

    private void eventos(){

        bt_atras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Ejercicio4_1Activity.class);
                startActivity(i);
            }
        });
    }

}
