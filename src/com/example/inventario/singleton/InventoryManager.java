package com.example.inventario.singleton;

import java.util.ArrayList;
import java.util.List;
import com.example.inventario.model.Producto;

public class InventoryManager {
    private static InventoryManager instance;
    private List<Producto> productos;

    private InventoryManager() {
        productos = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
