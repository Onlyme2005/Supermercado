/** 
 * Clase que representa a una cajera del supermercado.
 * Hereda de Thread para poder ejecutarse de forma concurrente (simultánea).
 */
public class Cajera extends Thread {

    private String nombre;
    private Cliente cliente;
    private long tiempoInicial;

    /**
     * Constructor de la clase Cajera.
     * @param nombre El nombre de la cajera.
     * @param cliente El cliente al que le va a cobrar.
     * @param tiempoInicial El tiempo exacto en milisegundos en que inicia todo el sistema.
     */
    public Cajera(String nombre, Cliente cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     * El método run() es el corazón del hilo. Todo lo que esté aquí adentro
     * se ejecutará de forma simultánea cuando iniciemos el hilo.
     */
    @Override
        public void run() {
            System.out.println("La cajera " + this.nombre + 
                            " COMIENZA a cobrarle al " + this.cliente.getNombre() + 
                            " en: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg");

        double costoTotalCompra = 0;

        // Recorremos el carrito de compras del cliente
        for (Producto producto : this.cliente.getCarritoCompra()) {
            
            // Sumamos el costo del producto al total
            costoTotalCompra += producto.getPrecio();

            // Simulamos el tiempo que tarda la cajera en escanear el producto
            this.esperarXSegundos(producto.getTiempoProcesamiento());

                System.out.println("Cajera " + this.nombre + " proceso " + producto.getNombre() + 
                                " (Costo: $" + producto.getPrecio() + ") " +
                                " -> Tiempo transcurrido: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg");
            }

            System.out.println("...La Cajera " + this.nombre + 
                            " HA TERMINADO de cobrarle al " + this.cliente.getNombre() + 
                            ". Costo total: $" + costoTotalCompra + 
                            ". Tiempo total de este cobro: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg");

        }

        /**
     * Método auxiliar para simular el tiempo de escaneo usando Thread.sleep().
     * Como exige buenas prácticas, manejamos la excepción de interrupción.
     * @param milisegundos El tiempo que el hilo se detendrá.
     */

        private void esperarXSegundos(int milisegundos) {
            try {
                Thread.sleep(milisegundos);
            } catch (InterruptedException e) {
                System.out.println("El hilo de la cajera " + this.nombre + " fue interrumpido.");
            }
        }

        // --- GETTERS Y SETTERS ---
            public String getNombre() {
                return nombre; 
            }
            public void setNombre(String nombre) { 
                this.nombre = nombre; 
            }
            public Cliente getCliente() { 
                return cliente; 
            }
            public void setCliente(Cliente cliente) { 
                this.cliente = cliente; 
            }
            public long getTiempoInicial() { 
                return tiempoInicial; 
            }
            public void setTiempoInicial(long tiempoInicial) { 
                this.tiempoInicial = tiempoInicial; 
            }
}
            

