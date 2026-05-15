import java.util.List;
/**
 * Clase que representa un cliente en un supermercado.
 * Contiene el nombre del cliente y su respectivo carrito de compras.
 */

public class Cliente {

    private String nombre;
    private List<Producto> carritoCompra;

    /**
     * Constructor de la clase Cliente.
     * @param nombre El nombre del Cliente.
     * @param carritoCompra La lista de productos que el cliente va a comprar.
     */

    public Cliente(String nombre, List<Producto> carritoCompra) {
        this.nombre = nombre;
        this.carritoCompra = carritoCompra;

    }

    // Getters y Setters

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getCarritoCompra () {
        return carritoCompra;
    }

    public void setCarritoCompra (List<Producto> carritoCompra) {
        this.carritoCompra = carritoCompra;
    }



}
