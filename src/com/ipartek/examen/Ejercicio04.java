package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ibáñez Rojo
 */
public class Ejercicio04 {

	/**
	 * Programa que pida los datos de un tren, los muestre y diga si está lleno o es
	 * viejo.
	 * 
	 * @param tipo             (String) - tipo de tren (Mercancías, pasajeros,
	 *                         turístico...)
	 * @param referencia       (int) - identificador del tren.
	 * @param asientosOcupados (int) - número de asientos ocupados del tren.
	 * @param annosActivo      (int) - años en activo del tren.
	 * @param sc               (Scanner) variable para recoger datos por teclado.
	 * @param locomotroa       (Tren) - array de Tren cuyos datos son introducidos
	 *                         por teclado.
	 */
	public static void main(String[] args) {
		String tipo;
		int referencia;
		int asientosOcupados;
		int annosActivo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tipo de tren: ");
		tipo = sc.nextLine();
		System.out.print("Introduce la referencia de tren: ");
		referencia = sc.nextInt();
		System.out.print("Introduce el número de asientos ocupados: ");
		asientosOcupados = sc.nextInt();
		System.out.print("Introduce cuántos años tiene el tren: ");
		annosActivo = sc.nextInt();

		Tren locomotroa = new Tren(tipo, referencia, asientosOcupados, annosActivo);

		System.out.println(locomotroa.toString());

		if (locomotroa.demasiadoViejo()) {
			System.out.println("El tren ya es demasiado viejo para circular.");
		} else {
			System.out.println("El tren todavía puede circular.");
		}

		if (locomotroa.trenLleno()) {
			System.out.println("El tren ya está completo.");
		} else {
			System.out.println("El tren todavía tiene plazas disponibles.");
		}

		sc.close();
	}

}
