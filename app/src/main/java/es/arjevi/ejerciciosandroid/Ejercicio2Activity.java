package es.arjevi.ejerciciosandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Ejercicio2Activity extends ActionBarActivity {

    private Button bt_aceptar;
    private EditText txt_1,txt_2;
    private RadioGroup rg;
    private RadioButton rb_si,rb_no;
    private CheckBox chk_terminos;
    private TextView view1;
    private Spinner sp_provincias;

    private String[] provincias = {"Cadiz", "Sevilla", "Malaga", "Granada"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        declaracion();
        eventos();
        rellenarSpinner();
    }

    private void declaracion(){

        bt_aceptar = (Button) findViewById(R.id.a2_bt_aceptar);
        txt_1 = (EditText) findViewById(R.id.a2_txt1);
        txt_2 = (EditText) findViewById(R.id.a2_txt2);
        rg = (RadioGroup) findViewById(R.id.a2_rg);
        rb_no = (RadioButton) findViewById(R.id.a2_rb_no);
        rb_si = (RadioButton) findViewById(R.id.a2_rb_si);
        chk_terminos = (CheckBox) findViewById(R.id.a2_chk_terminos);
        view1 = (TextView) findViewById(R.id.a2_view);
        sp_provincias = (Spinner) findViewById(R.id.spinner);
    }

    private void eventos(){

        bt_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Radio seleccionado
                int id_radio = rg.getCheckedRadioButtonId();
                RadioButton rb_aux = (RadioButton) findViewById(id_radio);
                String seleccionado = rb_aux.getText().toString();

                String texto1 = txt_1.getText().toString();
                String texto2 = txt_2.getText().toString();

                view1.setText(texto1+"\n"+texto2+"\n"+seleccionado);
            }
        });

        chk_terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chk_terminos.isChecked()){
                    bt_aceptar.setEnabled(true);
                }else{
                    bt_aceptar.setEnabled(false);
                }

            }
        });

        //Eventos Spinner

        sp_provincias.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {


                        Toast.makeText(getApplicationContext(),  ""+parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
    }

    private void rellenarSpinner(){

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, provincias);

        sp_provincias.setAdapter(adaptador);
    }
}
