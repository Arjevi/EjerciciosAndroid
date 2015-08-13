package Clases;


public class Complemento {

    String nombre;
    String descripcion;
    String ruta;
    double precio;

    public Complemento(String nombre, String descripcion, String ruta, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta = ruta;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Complemento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ruta='" + ruta + '\'' +
                ", precio=" + precio +
                '}';
    }
}
