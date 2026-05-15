/**
 * Clase Producto que representa un producto en un supermercado
 * Contiene la información basica del articulo y el tiempo que toma procesarlo.
 */


public class Producto {

    private String nombre; 
    private double precio;
    private int tiempoProcesamiento;

    /**
     * Constructor de la clase Producto
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     * @param tiempoProcesamiento El tiempo que toma procesar el producto en segundos
     */
    public Producto(String nombre, double precio, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    // Getters y Setters

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public int getTiempoProcesamiento () {
        return tiempoProcesamiento;
    }

    public void setTiempoProcesamiento (int tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

}