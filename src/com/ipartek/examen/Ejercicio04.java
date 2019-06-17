package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ib��ez Rojo
 */
public class Ejercicio04 {

	/**
	 * Programa que pida los datos de un tren, los muestre y diga si est� lleno o es
	 * viejo.
	 * 
	 * @param tipo             (String) - tipo de tren (Mercanc�as, pasajeros,
	 *                         tur�stico...)
	 * @param referencia       (int) - identificador del tren.
	 * @param asientosOcupados (int) - n�mero de asientos ocupados del tren.
	 * @param annosActivo      (int) - a�os en activo del tren.
	 * @param sc               (Scanner) variable para recoger datos por teclado.
	 * @param locomotroa       (Tren) - array de Tren cuyos datos son introducidos
	 *                         por teclado.
	 */
	public static void main(String[] args) {
		String tipo = null;
		int referencia = 0;
		int asientosOcupados = 0;
		int annosActivo = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tipo de tren: ");
		tipo = sc.nextLine();
		System.out.print("Introduce la referencia de tren: ");
		referencia = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el n�mero de asientos ocupados: ");
		asientosOcupados = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce cu�ntos a�os tiene el tren: ");
		annosActivo = Integer.parseInt(sc.nextLine());

		Tren locomotora = new Tren(tipo, referencia, asientosOcupados, annosActivo);

		System.out.println(locomotora.toString());

		if (locomotora.demasiadoViejo()) {
			System.out.println("El tren ya es demasiado viejo para circular.");
		} else {
			System.out.println("El tren todav�a puede circular.");
		}

		if (locomotora.trenLleno()) {
			System.out.println("El tren ya est� completo.");
		} else {
			System.out.println("El tren todav�a tiene plazas disponibles.");
		}

		sc.close();
	}

}
