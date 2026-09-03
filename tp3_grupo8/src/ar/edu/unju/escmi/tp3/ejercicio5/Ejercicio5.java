package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Producto[] productos = new Producto[3];

        int opcion;
        int cantidad = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar los productos que superen un precio");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    if (cantidad < productos.length) {

                        Producto producto = new Producto();

                        System.out.print("Ingrese código: ");
                        producto.setCodigo(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("Ingrese descripción: ");
                        producto.setDescripcion(scanner.nextLine());

                        System.out.print("Ingrese precio: ");
                        producto.setPrecio(scanner.nextDouble());
                        scanner.nextLine();

                        productos[cantidad] = producto;
                        cantidad++;

                        System.out.println("Producto creado correctamente.");

                    } else {
                        System.out.println("No hay espacio para más productos.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- PRODUCTOS ---");

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println(productos[i]);
                    }

                    if (cantidad == 0) {
                        System.out.println("No hay productos creados.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto: ");
                    int codigo = scanner.nextInt();

                    boolean encontrado = false;

                    for (int i = 0; i < cantidad; i++) {

                        if (productos[i].getCodigo() == codigo) {

                            System.out.print("Ingrese el nuevo precio: ");
                            double nuevoPrecio = scanner.nextDouble();

                            productos[i].setPrecio(nuevoPrecio);

                            System.out.println("Precio modificado correctamente.");

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el producto.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el precio a superar: ");
                    double precioBuscado = scanner.nextDouble();

                    boolean hayProductos = false;

                    System.out.println("\n--- PRODUCTOS QUE SUPERAN EL PRECIO ---");

                    for (int i = 0; i < cantidad; i++) {

                        if (productos[i].getPrecio() > precioBuscado) {
                            System.out.println(productos[i]);
                            hayProductos = true;
                        }
                    }

                    if (!hayProductos) {
                        System.out.println("No hay productos que superen ese precio.");
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}