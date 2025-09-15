package app;

import com.example.inventario.singleton.InventoryManager;
import com.example.inventario.factory.abstractf.CategoryFactory;
import com.example.inventario.factory.abstractf.ElectronicsFactory;
import com.example.inventario.factory.abstractf.ClothingFactory;
import com.example.inventario.model.Producto;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventario = InventoryManager.getInstance();

        CategoryFactory electronicaFactory = new ElectronicsFactory();
        CategoryFactory ropaFactory = new ClothingFactory();

        Producto telefono = electronicaFactory.crearCategoria()
                .crearProducto("Smartphone", 1200.0, 10);
        Producto camisa = ropaFactory.crearCategoria()
                .crearProducto("Camisa manga larga", 40.0, 25);

        inventario.agregarProducto(telefono);
        inventario.agregarProducto(camisa);

        Producto telefonoCopia = telefono.clonar();
        inventario.agregarProducto(telefonoCopia);

        inventario.mostrarInventario();
    }
}
