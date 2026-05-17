
# Simulación de Cobro en Supermercado (Concurrencia en Java)

Este proyecto es una aplicación de consola desarrollada en Java que simula el proceso de cobro en un supermercado utilizando **hilos (Threads)** y programación concurrente. 

Desarrollado como solución al Caso de Estudio del Departamento de Tecnología en Desarrollo de Software de la IUDigital de Antioquia.

##  Objetivo del Proyecto

El sistema reemplaza el cobro secuencial (un cliente a la vez) por un sistema de procesamiento paralelo. Permite que múltiples cajeras procesen los carritos de compra de distintos clientes de manera simultánea, calculando el tiempo de procesamiento por producto y el tiempo total de la compra.

##  Arquitectura y Estructura de Clases

El proyecto está diseñado bajo los principios de la Programación Orientada a Objetos (POO) y consta de las siguientes clases principales:

* **`Producto.java`**: POJO que representa los artículos del supermercado. Encapsula atributos como nombre, precio y el tiempo de procesamiento (en milisegundos).
* **`Cliente.java`**: Representa al comprador. Contiene el nombre del cliente y una lista dinámica (`List<Producto>`) que actúa como su carrito de compras.
* **`Cajera.java`**: **El núcleo concurrente del sistema.** Hereda de la clase `Thread` nativa de Java. Su método `run()` contiene la lógica para procesar los productos del cliente, utilizando `Thread.sleep()` para simular el tiempo de escaneo en caja.
* **`Main.java`**: Clase orquestadora. Instancia los objetos e inicia los hilos usando el método `.start()`, desencadenando la ejecución concurrente.

##  Requisitos Previos

Para compilar y ejecutar este proyecto, necesitas:
* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) versión 8 o superior (Se recomienda Java 17 o 21 LTS).
* Un IDE o editor de código como Visual Studio Code, IntelliJ IDEA o Eclipse.

## Instrucciones de Ejecución

Si utilizas la terminal o línea de comandos:

1. Clona este repositorio:
   ```bash
   git clone https://github.com/Onlyme2005/Supermercado.git
   
Navega al directorio del proyecto:
   ```bash
   cd Supermercado

Compila los archivos Java:
   ```bash
   javac *.java

Ejecuta la clase principal:

   ```bash
   java Main

(Nota: Si usas VS Code con el Extension Pack for Java, simplemente abre Main.java y haz clic en el botón "Run").

## Demostración
Al ejecutar la aplicación, la consola imprimirá los registros de forma intercalada, evidenciando que las cajeras trabajan en paralelo.

Ejemplo de salida esperada:

Plaintext
----- INICIANDO COBROS SIMULTÁNEOS -----
>>> La cajera Cajera 1 (Rosa) COMIENZA a cobrarle al Cliente 1 (Juan) en el tiempo: 0 seg
>>> La cajera Cajera 2 (Carmen) COMIENZA a cobrarle al Cliente 2 (Maria) en el tiempo: 0 seg
Cajera Cajera 1 (Rosa) procesó Manzanas (Costo: $1500.0)  -> Tiempo transcurrido: 1 seg
Cajera Cajera 2 (Carmen) procesó Pan (Costo: $2000.0)  -> Tiempo transcurrido: 2 seg
...
<<< La cajera Cajera 1 (Rosa) HA TERMINADO de cobrarle al Cliente 1 (Juan). Costo total: $7000.0. Tiempo total: 4 seg

## Autor
Brislleily Sirley Carmona Correa -- Desarrollo de Software Seguro
