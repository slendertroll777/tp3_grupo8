package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<GatoSimple> gatos = new ArrayList<>();

		GatoSimple gatoSimple = null;
		int opcion;

		do {
			System.out.println();
			System.out.println("1 - Crear gato simple");
			System.out.println("2 - Dar de comer a un gato simple");
			System.out.println("3 - Mostrar todos los gatos");
			System.out.println("4 - Crear gato contrincante para pelear con un gato simple");
			System.out.println("5 - Salir");
			System.out.print("Seleccione una opcion: ");

			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {

			case 1:
				System.out.println("Ingrese nombre:");
				String nombre = scanner.nextLine();

				System.out.println("Ingrese raza:");
				String raza = scanner.nextLine();

				System.out.println("Ingrese color:");
				String color = scanner.nextLine();

				System.out.println("Ingrese peso:");
				double peso = scanner.nextDouble();

				System.out.println("Ingrese edad:");
				int edad = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Ingrese sexo (macho/hembra):");
				String sexo = scanner.nextLine();

				gatoSimple = new GatoSimple(color, peso, raza, edad, nombre, sexo);
				gatos.add(gatoSimple);

				System.out.println("Gato creado correctamente.");
				break;

			case 2:
				if (gatoSimple != null) {
					System.out.println("Ingrese la comida:");
					String comida = scanner.nextLine();

					gatoSimple.comer(comida);
				} else {
					System.out.println("Primero debe crear un gato simple.");
				}
				break;

			case 3:
				if (gatos.isEmpty()) {
					System.out.println("No hay gatos creados.");
				} else {
					for (GatoSimple gato : gatos) {
						gato.mostrarDatos();
						gato.maullar();
						gato.ronronear();
						System.out.println("-----------------------");
					}
				}
				break;

			case 4:
				if (gatoSimple != null) {

					System.out.println("Ingrese nombre del gato contrincante:");
					String nombreContrincante = scanner.nextLine();

					System.out.println("Ingrese raza:");
					String razaContrincante = scanner.nextLine();

					System.out.println("Ingrese color:");
					String colorContrincante = scanner.nextLine();

					System.out.println("Ingrese peso:");
					double pesoContrincante = scanner.nextDouble();

					System.out.println("Ingrese edad:");
					int edadContrincante = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Ingrese sexo (macho/hembra):");
					String sexoContrincante = scanner.nextLine();

					GatoSimple gatoContrincante = new GatoSimple(
							colorContrincante,
							pesoContrincante,
							razaContrincante,
							edadContrincante,
							nombreContrincante,
							sexoContrincante
					);

					gatoSimple.pelear(gatoContrincante);

				} else {
					System.out.println("Primero debe crear un gato simple.");
				}
				break;

			case 5:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion invalida.");
			}

		} while (opcion != 5);

		scanner.close();
	}
}