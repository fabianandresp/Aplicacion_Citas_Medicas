package com.company;
 // CLASE DE PROCEDIMIENTOS
import java.util.ArrayList;

public class Procedimientos {
//ATRIBUTOS
    String nombre;
    double costo;
    ArrayList<Procedimientos> listaProcedimientos = new ArrayList<>();

    // METODO CONSTRUCTOR
    public Procedimientos(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
