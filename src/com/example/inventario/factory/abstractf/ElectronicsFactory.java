package com.example.inventario.factory.abstractf;

import com.example.inventario.model.Producto;
import com.example.inventario.model.ProductoConcreto;

public class ElectronicsFactory implements CategoryFactory {
    @Override
    public Categoria crearCategoria() {
        return new Categoria() {
            @Override
            public Producto crearProducto(String nombre, double precio, int cantidad) {
                return new ProductoConcreto(nombre, precio, cantidad);
            }
        };
    }
}
