package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ibáñez Rojo
 */
public class Ejercicio01 {

	final static int PESO_MOSCA = 52;
	final static int PESO_PLUMA = 57;
	final static int PESO_LIGERO = 65;
	final static int PESO_MEDIANO = 90;
	// >90 PESO_PESADO;
	final static int MAX_BOXEADORES = 30;

	/**
	 * Programa que calcule mediante el peso de 30 boxeadores a qué categoría
	 * pertenecen.
	 */
	public static void main(String[] args) {

		int peso = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= MAX_BOXEADORES; i++) {

			try {
				System.out.print("Introduce el peso del boxeador #" + i + ": ");
				peso = Integer.parseInt(sc.nextLine());

				if (peso <= 0) {
					throw new Exception("Peso incorrecto. Debe ser mayor que 0.");
				}

				if (peso < PESO_MOSCA) {
					System.out.println("Este boxeador entra en la categoría de MOSCA.");
				} else if (peso < PESO_PLUMA) {
					System.out.println("Este boxeador entra en la categoría de PLUMA.");
				} else if (peso < PESO_LIGERO) {
					System.out.println("Este boxeador entra en la categoría de LIGERO.");
				} else if (peso < PESO_MEDIANO) {
					System.out.println("Este boxeador entra en la categoría de MEDIANO.");
				} else {
					System.out.println("Este boxeador entra en la categoría de PESADO.");
				}

			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Ha introducido datos sin el formato indicado o fuera del rango.");
				break;
			}

		}

		sc.close();

	}

}
