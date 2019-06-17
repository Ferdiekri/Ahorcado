package com.ipartek.examen;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String tipo; // Mercancías, pasajeros, turístico...
		int referencia; // número identificativo XXXXX
		int asientosOcupados; // número entero
		int annosActivo; // número entero
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tipo de tren: ");
		tipo = sc.nextLine();
		System.out.print("Introduce la referencia de tren: ");
		referencia = sc.nextInt();
		System.out.print("Introduce el número de asientos ocupados: ");
		asientosOcupados = sc.nextInt();
		System.out.print("Introduce cuántos años tiene el tren: ");
		annosActivo = sc.nextInt();

		Tren tranvia = new Tren(tipo, referencia, asientosOcupados, annosActivo);

		System.out.println(tranvia.toString());
		if (tranvia.demasiadoViejo()) {
			System.out.println("El tren ya es demasiado viejo para circular.");
		} else {
			System.out.println("El tren todavía puede circular.");
		}

		if (tranvia.trenLleno()) {
			System.out.println("El tren ya está completo.");
		} else {
			System.out.println("El tren todavía tiene plazas disponibles.");
		}

		sc.close();
	}

}
