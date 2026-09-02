package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    private static final double SALARIO_MINIMO = 600000.00;
    private static final double AUMENTO_MERITOS = 90000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    public int getLegajo() {
        return legajo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + salario);
    }

    public void aumentarSalario() {
        this.salario += AUMENTO_MERITOS;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = null;
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1- Crear empleado");
            System.out.println("2- Aumentar Salario");
            System.out.println("3- Mostrar los datos del empleado");
            System.out.println("4- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el legajo: ");
                    int legajo = scanner.nextInt();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado exitosamente.");
                    break;

                case 2:
                    if (empleado != null) {
                        System.out.print("Ingrese el número de legajo: ");
                        int legajoBuscar = scanner.nextInt();
                        if (legajoBuscar == empleado.getLegajo()) {
                            empleado.aumentarSalario();
                            System.out.println("Salario aumentado exitosamente.");
                        } else {
                            System.out.println("El legajo no coincide con el empleado creado.");
                        }
                    } else {
                        System.out.println("Primero debe crear un empleado (Opción 1).");
                    }
                    break;

                case 3:
                    if (empleado != null) {
                        empleado.mostrarDatos();
                    } else {
                        System.out.println("Primero debe crear un empleado (Opción 1).");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
