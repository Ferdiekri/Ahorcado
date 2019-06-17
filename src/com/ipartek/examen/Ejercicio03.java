package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ibáñez Rojo
 */
public class Ejercicio03 {

	/**
	 * Programa que muestre los múltiplos de 7 y la media de los números recogidos
	 * en una array.
	 * 
	 * @param datos (int[]) - array que guarda los datos introducidos por teclado.
	 * @param sc    (Scanner) variable para recoger datos por teclado.
	 */
	public static void main(String[] args) {
		int[] datos = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Introduce el número de la posición #" + i + ": ");
			datos[i] = Integer.parseInt(sc.nextLine());
		}

		multiplosSiete(datos);

		mediaDatos(datos);

		sc.close();

	}

	/**
	 * Función que calcula cuántos y cuales son los números múltiplos de 7 en la
	 * array.
	 * 
	 * @param datos(int[]) - array de números que obtenemos en el main.
	 * @param contador     (int) - variable que va contando cuántos múltiplos hay en
	 *                     la arra.
	 */
	public static void multiplosSiete(int[] datos) {
		int contador = 0;

		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				contador++;
				System.out.println("El número " + datos[i] + " es múltiplo de 7.");
			}
		}
		System.out.println("En total hay " + contador + " múltiplos de 7.");
	}

	/**
	 * Función que calcula la media de los datos introducidos.
	 * 
	 * @param datos (int[]) - array de números que obtenemos en el main.
	 * @param suma  (float) - la suma de todos los valores de la array.
	 */
	public static void mediaDatos(int[] datos) {
		float suma = 0;

		for (int i = 0; i < datos.length; i++) {
			suma = suma + datos[i];
		}
		System.out.printf("La media de los número es: %.2f", suma / datos.length);
	}

}
