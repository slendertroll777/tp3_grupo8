package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {

	private String color;
	private double peso;
	private String raza;
	private int edad;
	private String nombre;
	private String sexo;

	public GatoSimple(String color, double peso, String raza, int edad, String nombre, String sexo) {
		this.color = color;
		this.peso = peso;
		this.raza = raza;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public double getPeso() {
		return peso;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void maullar() {
		System.out.println("Miauu");
	}

	public void ronronear() {
		System.out.println("prrrr");
	}

	public void comer(String comida) {
		if (comida.equalsIgnoreCase("pescado")) {
			System.out.println("Que rico ¡Gracias!!");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}

	public void pelear(GatoSimple gatoContrincante) {
		if (sexo.equalsIgnoreCase("hembra")) {
			System.out.println("No me gusta pelear");
		} else {
			if (gatoContrincante.getSexo().equalsIgnoreCase("hembra")) {
				System.out.println("No peleo contra gatitas");
			} else {
				System.out.println("¡Ven aquí que te vas a enterar!");
			}
		}
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Raza: " + raza);
		System.out.println("Color: " + color);
		System.out.println("Peso: " + peso);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + sexo);
	}
}