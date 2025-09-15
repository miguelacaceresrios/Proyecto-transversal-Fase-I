package com.example.inventario.model;

public class ProductoConcreto implements Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public ProductoConcreto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public int getCantidad() { return cantidad; }

    @Override
    public Producto clonar() {
        return new ProductoConcreto(nombre, precio, cantidad);
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio + " | Stock: " + cantidad;
    }
}
