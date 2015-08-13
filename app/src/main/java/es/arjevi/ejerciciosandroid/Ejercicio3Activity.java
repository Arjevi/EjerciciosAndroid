package es.arjevi.ejerciciosandroid;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

import Clases.Complemento;


public class Ejercicio3Activity extends ActionBarActivity {

    private ListView lv_complementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        lv_complementos = (ListView) findViewById(R.id.listView);

        final ArrayList<Complemento> complementos = rellenarLista();
        AdaptadorComplementos adaptador = new AdaptadorComplementos(this,complementos);
        lv_complementos.setAdapter(adaptador);

        //Eventos item

        lv_complementos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Complemento c = complementos.get(position);
                Log.i("Click", c.toString());
            }
        });
    }

    public ArrayList<Complemento> rellenarLista(){

        ArrayList<Complemento> lista_complementos = new ArrayList<>();

        Complemento c1 = new Complemento("Nuggets","Deliciosos nuggets de pollo","nuggets",2.99);
        Complemento c2 = new Complemento("Aros de cebolla","Aritos ricos","aros",5.99);
        Complemento c3 = new Complemento("Patatas fritas","Patatas estándar","patatas",0.99);

        Collections.addAll(lista_complementos,c1,c2,c3);

        return lista_complementos;
    }

    /***************************************************************
     * ADAPTADOR LISTA COMPLEMENTOS                					 *
     * *************************************************************
     * */
    class AdaptadorComplementos extends ArrayAdapter {

        Activity context;
        ArrayList<Complemento> lstComplemento;

        AdaptadorComplementos(Activity context, ArrayList <Complemento> lstCom) {
            super(context, R.layout.item_lista_complementos, lstCom);
            this.lstComplemento=lstCom;
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = context.getLayoutInflater();

            View item = inflater.inflate(R.layout.item_lista_complementos, null);

            ImageView imagen = (ImageView) item.findViewById(R.id.imageView);
            int resID = getResources().getIdentifier(lstComplemento.get(position).getRuta() , "drawable", getPackageName());
            imagen.setImageResource(resID);

            TextView nombre = (TextView)item.findViewById(R.id.txtNombre);
            nombre.setText(lstComplemento.get(position).getNombre());

            TextView descripcion = (TextView)item.findViewById(R.id.txtDes);
            descripcion.setText(""+lstComplemento.get(position).getDescripcion());

            TextView precio = (TextView)item.findViewById(R.id.txtPrecio);
            precio.setText(lstComplemento.get(position).getPrecio()+" €");

            return(item);
        }
    }

}
