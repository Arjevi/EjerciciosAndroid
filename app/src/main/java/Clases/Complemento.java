package Clases;


import android.os.Parcel;
import android.os.Parcelable;

public class Complemento implements Parcelable{

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

    public Complemento (Parcel in){

        this.nombre = in.readString();
        this.descripcion = in.readString();
        this.ruta = in.readString();
        this.precio = in.readDouble();

    }

    public static final Parcelable.Creator<Complemento> CREATOR
            = new Parcelable.Creator<Complemento>() {
        public Complemento createFromParcel(Parcel in) {
            return new Complemento(in);
        }

        public Complemento[] newArray(int size) {
            return new Complemento[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.nombre);
        dest.writeString(this.descripcion);
        dest.writeString(this.ruta);
        dest.writeDouble(this.precio);
    }
}
