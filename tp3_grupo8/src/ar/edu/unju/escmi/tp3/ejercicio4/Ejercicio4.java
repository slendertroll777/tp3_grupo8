package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente[] clientes = new Cliente[4];

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar los datos de un cliente");
            System.out.println("3 - Mostrar todos los clientes");
            System.out.println("4 - Mostrar todos los clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    int posicion = -1;

                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] == null) {
                            posicion = i;
                            break;
                        }
                    }

                    if (posicion == -1) {
                        System.out.println("El array está lleno. No se pueden agregar más clientes.");
                    } else {

                        System.out.print("Ingrese DNI: ");
                        int dni = teclado.nextInt();
                        teclado.nextLine();

                        System.out.print("Ingrese nombre: ");
                        String nombre = teclado.nextLine();

                        System.out.print("Ingrese categoría: ");
                        char categoria = teclado.nextLine().charAt(0);

                        clientes[posicion] = new Cliente(dni, nombre, categoria);

                        System.out.println("Cliente creado correctamente.");
                    }

                    break;

                case 2:

                    System.out.print("Ingrese el DNI a buscar: ");
                    int dniBuscar = teclado.nextInt();

                    boolean encontrado = false;

                    for (int i = 0; i < clientes.length; i++) {

                        if (clientes[i] != null &&
                            clientes[i].getDni() == dniBuscar) {

                            System.out.println(clientes[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el dni");
                    }

                    break;

                case 3:

                    boolean hayClientes = false;

                    for (int i = 0; i < clientes.length; i++) {

                        if (clientes[i] != null) {
                            System.out.println(clientes[i]);
                            hayClientes = true;
                        }
                    }

                    if (!hayClientes) {
                        System.out.println("No hay clientes cargados.");
                    }

                    break;

                case 4:

                    System.out.print("Ingrese la categoría a buscar: ");
                    char categoriaBuscar = teclado.next().charAt(0);

                    boolean categoriaEncontrada = false;

                    for (int i = 0; i < clientes.length; i++) {

                        if (clientes[i] != null &&
                            clientes[i].getCategoria() == categoriaBuscar) {

                            System.out.println(clientes[i]);
                            categoriaEncontrada = true;
                        }
                    }

                    if (!categoriaEncontrada) {
                        System.out.println("No se encontraron clientes con esa categoría.");
                    }

                    break;

                case 5:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");

                    break;
            }

        } while (opcion != 5);

        teclado.close();
    }
}