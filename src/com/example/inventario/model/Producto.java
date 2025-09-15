package com.example.inventario.model;

public interface Producto extends Cloneable {
    String getNombre();
    double getPrecio();
    int getCantidad();
    Producto clonar();
}
