package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.ArrayList;

public class Cafeteria {
    
    private String nombre;
    private Collection<Factura> listaFacturas;


    public Cafeteria(String nombre) {
        this.nombre = nombre;
        this. listaFacturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
