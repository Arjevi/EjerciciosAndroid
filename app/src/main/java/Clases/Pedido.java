package Clases;


import java.util.ArrayList;

public class Pedido {

    private String tamano;
    private String masa;
    private ArrayList<String> lista_ingredientes;
    private ArrayList<Complemento> lista_complemento;
    private double precio;



    public Pedido(String tamano, String masa, ArrayList<String> lista_ingredientes, ArrayList<Complemento> lista_complemento, double precio) {
        this.tamano = tamano;
        this.masa = masa;
        this.lista_ingredientes = lista_ingredientes;
        this.lista_complemento = lista_complemento;
        this.precio= precio;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public ArrayList<String> getLista_ingredientes() {
        return lista_ingredientes;
    }

    public void setLista_ingredientes(ArrayList<String> lista_ingredientes) {
        this.lista_ingredientes = lista_ingredientes;
    }

    public ArrayList<Complemento> getLista_complemento() {
        return lista_complemento;
    }

    public void setLista_complemento(ArrayList<Complemento> lista_complemento) {
        this.lista_complemento = lista_complemento;
    }
}

