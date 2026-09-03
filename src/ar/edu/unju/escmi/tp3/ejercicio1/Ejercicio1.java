package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		ArrayList<Persona> personas=new ArrayList<>();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int opcion;

		do{
			System.out.println("1 - Crear objeto con Constructor por defecto");
			System.out.println("2 - Crear objeto con Constructor parametrizado");
			System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
			System.out.println("4 - Mostrar personas");
			System.out.println("5 - Salir");
			opcion=scanner.nextInt();
			scanner.nextLine();

			switch(opcion){
				case 1:
					Persona p1=new Persona();
					System.out.println("Ingrese dni:");
					p1.setDni(scanner.nextLine());
					System.out.println("Ingrese nombre:");
					p1.setNombre(scanner.nextLine());
					System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy):");
					p1.setFechaNacimiento(LocalDate.parse(scanner.nextLine(), formato));
					System.out.println("Ingrese domicilio:");
					p1.setDomicilio(scanner.nextLine());
					System.out.println("Ingrese provincia:");
					p1.setProvincia(scanner.nextLine());
					personas.add(p1);
					break;

				case 2:
					System.out.println("Ingrese dni:");
					String dni2=scanner.nextLine();
					System.out.println("Ingrese nombre:");
					String nombre2=scanner.nextLine();
					System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy):");
					LocalDate fecha2=LocalDate.parse(scanner.nextLine(), formato);
					System.out.println("Ingrese domicilio:");
					String domicilio2=scanner.nextLine();
					System.out.println("Ingrese provincia:");
					String provincia2=scanner.nextLine();
					personas.add(new Persona(dni2, nombre2, fecha2, domicilio2, provincia2));
					break;

				case 3:
					System.out.println("Ingrese dni:");
					String dni3=scanner.nextLine();
					System.out.println("Ingrese nombre:");
					String nombre3=scanner.nextLine();
					System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy):");
					LocalDate fecha3=LocalDate.parse(scanner.nextLine(), formato);
					personas.add(new Persona(dni3, nombre3, fecha3));
					break;

				case 4:
					for(Persona p : personas){
						p.mostrarDatos();
						System.out.println("-----------------------");
					}
					break;

				case 5:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opcion invalida");
			}

		} while(opcion!=5);

		scanner.close();
	}
}