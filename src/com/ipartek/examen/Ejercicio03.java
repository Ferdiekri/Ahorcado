package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ib��ez Rojo
 */
public class Ejercicio03 {

	/**
	 * Programa que muestre los m�ltiplos de 7 y la media de los n�meros recogidos
	 * en una array.
	 * 
	 * @param datos (int[]) - array que guarda los datos introducidos por teclado.
	 * @param sc    (Scanner) variable para recoger datos por teclado.
	 */
	public static void main(String[] args) {
		int[] datos = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Introduce el n�mero de la posici�n #" + i + ": ");
			datos[i] = Integer.parseInt(sc.nextLine());
		}

		multiplosSiete(datos);

		mediaDatos(datos);

		sc.close();

	}

	/**
	 * Funci�n que calcula cu�ntos y cuales son los n�meros m�ltiplos de 7 en la
	 * array.
	 * 
	 * @param datos(int[]) - array de n�meros que obtenemos en el main.
	 * @param contador     (int) - variable que va contando cu�ntos m�ltiplos hay en
	 *                     la arra.
	 */
	public static void multiplosSiete(int[] datos) {
		int contador = 0;

		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				contador++;
				System.out.println("El n�mero " + datos[i] + " es m�ltiplo de 7.");
			}
		}
		System.out.println("En total hay " + contador + " m�ltiplos de 7.");
	}

	/**
	 * Funci�n que calcula la media de los datos introducidos.
	 * 
	 * @param datos (int[]) - array de n�meros que obtenemos en el main.
	 * @param suma  (float) - la suma de todos los valores de la array.
	 */
	public static void mediaDatos(int[] datos) {
		float suma = 0;

		for (int i = 0; i < datos.length; i++) {
			suma = suma + datos[i];
		}
		System.out.printf("La media de los n�mero es: %.2f", suma / datos.length);
	}

}
