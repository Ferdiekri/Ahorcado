package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String tipo; // Mercanc�as, pasajeros, tur�stico...
		int referencia; // n�mero identificativo XXXXX
		int asientosOcupados; // n�mero entero
		int annosActivo; // n�mero entero
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tipo de tren: ");
		tipo = sc.nextLine();
		System.out.print("Introduce la referencia de tren: ");
		referencia = sc.nextInt();
		System.out.print("Introduce el n�mero de asientos ocupados: ");
		asientosOcupados = sc.nextInt();
		System.out.print("Introduce cu�ntos a�os tiene el tren: ");
		annosActivo = sc.nextInt();

		Tren tranvia = new Tren(tipo, referencia, asientosOcupados, annosActivo);

		System.out.println(tranvia.toString());
		if (tranvia.demasiadoViejo()) {
			System.out.println("El tren ya es demasiado viejo para circular.");
		} else {
			System.out.println("El tren todav�a puede circular.");
		}

		if (tranvia.trenLleno()) {
			System.out.println("El tren ya est� completo.");
		} else {
			System.out.println("El tren todav�a tiene plazas disponibles.");
		}

		sc.close();
	}

}
