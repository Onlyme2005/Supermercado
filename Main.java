import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que ejecuta la simulación del supermercado.
 * Orquesta la creación de clientes, productos y cajeras, iniciando la concurrencia.
 */
public class Main {

    public static void main(String[] args) {
        
        // 1. CREACIÓN DE PRODUCTOS
        // Recuerda: (Nombre, precio, tiempo de procesamiento en milisegundos)
        // 1000 milisegundos = 1 segundo.
        Producto p1 = new Producto("Manzanas", 1500.0, 1000);
        Producto p2 = new Producto("Pan", 2000.0, 2000);
        Producto p3 = new Producto("Leche", 3500.0, 1500);
        Producto p4 = new Producto("Huevos", 4000.0, 2500);

        // 2. CREACIÓN DE LOS CARRITOS DE COMPRA
        // Usamos ArrayList que es la implementación más común de la interfaz List
        List<Producto> carritoCliente1 = new ArrayList<>();
        carritoCliente1.add(p1);
        carritoCliente1.add(p2);
        carritoCliente1.add(p3);

        List<Producto> carritoCliente2 = new ArrayList<>();
        carritoCliente2.add(p2);
        carritoCliente2.add(p4);
        carritoCliente2.add(p1);
        carritoCliente2.add(p3);

        // 3. CREACIÓN DE CLIENTES
        Cliente cliente1 = new Cliente("Cliente Raul", carritoCliente1);
        Cliente cliente2 = new Cliente("Cliente Jesus", carritoCliente2);

        // 4. REGISTRO DEL TIEMPO INICIAL DEL SISTEMA
        // Esto es crucial para la rúbrica: calcular el tiempo total.
        long tiempoInicial = System.currentTimeMillis();

        // 5. CREACIÓN DE CAJERAS (NUESTROS HILOS)
        Cajera cajera1 = new Cajera("Rosalia", cliente1, tiempoInicial);
        Cajera cajera2 = new Cajera("Carmensa", cliente2, tiempoInicial);

        // 6. ¡EL PITAZO INICIAL! INICIO DE LA CONCURRENCIA
        // ¡ATENCIÓN! Se usa el método start(), NO el método run().
        System.out.println("----- INICIANDO COBROS SIMULTANEOS -----");
        cajera1.start();
        cajera2.start();
        
    }
} 

