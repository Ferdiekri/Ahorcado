package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ibáñez Rojo
 */
public class Ejercicio03 {

	final static int MAX_NUMEROS = 10;
	static int[] datos = new int[MAX_NUMEROS];

	/**
	 * Programa que muestre los múltiplos de 7 y la media de los números recogidos
	 * en una array.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < MAX_NUMEROS; i++) {
			System.out.print("Introduce el " + (i + 1) + "º número: ");
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
	 */
	public static void multiplosSiete(int[] datos) {
		int contador = 0;

		for (int i = 0; i < MAX_NUMEROS; i++) {
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
	 */
	public static void mediaDatos(int[] datos) {
		float suma = 0;

		for (int i = 0; i < MAX_NUMEROS; i++) {
			suma += datos[i];
		}
		System.out.printf("La media de los número es: %.2f", suma / MAX_NUMEROS);
	}

}
