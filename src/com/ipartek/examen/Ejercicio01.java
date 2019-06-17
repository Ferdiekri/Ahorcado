package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ib��ez Rojo
 */
public class Ejercicio01 {

	/**
	 * Programa que calcule mediante el peso de 30 boxeadores a qu� categor�a
	 * pertenecen.
	 * 
	 * @param peso (int) peso del boxeado introducido por teclado.
	 * @param sc   (Scanner) variable para recoger datos por teclado.
	 */
	public static void main(String[] args) {
		int peso = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 30; i++) {
			System.out.print("Introduce el peso del boxeador #" + i + ": ");

			try {
				peso = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera del rango.");
				break;
			}

			if (peso < 52) {
				System.out.println("Este boxeador entra en la categor�a de MOSCA.");
			} else if (peso < 57) {
				System.out.println("Este boxeador entra en la categor�a de PLUMA.");
			} else if (peso < 65) {
				System.out.println("Este boxeador entra en la categor�a de LIGERO.");
			} else if (peso < 90) {
				System.out.println("Este boxeador entra en la categor�a de MEDIANO.");
			} else {
				System.out.println("Este boxeador entra en la categor�a de PESADO.");
			}
		}

		sc.close();

	}

}
