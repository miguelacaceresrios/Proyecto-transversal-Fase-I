package com.example.inventario.factory.abstractf;

import com.example.inventario.model.Producto;

public interface Categoria {
    Producto crearProducto(String nombre, double precio, int cantidad);
}
