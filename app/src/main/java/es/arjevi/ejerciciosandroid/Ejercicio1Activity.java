package es.arjevi.ejerciciosandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;


public class Ejercicio1Activity extends ActionBarActivity {

    private EditText txt_nom, txt_ape, txt_edad,txt_dia, txt_mes, txt_year;
    private CheckBox chk_terminos, chk_eso, chk_grado, chk_universidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);


    }


}
