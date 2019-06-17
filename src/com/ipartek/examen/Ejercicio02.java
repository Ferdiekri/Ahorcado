package com.ipartek.examen;

import java.util.Scanner;

/**
 * @author Eder Ibáñez Rojo
 */
public class Ejercicio02 {

	/**
	 * Programa que calcula si un piloto se puede clasificar esta temporada.
	 * 
	 * @param puntos (int) - variable que guarde el dato recogido por teclado.
	 * @param sc     (Scanner) variable para recoger datos por teclado.
	 */
	public static void main(String[] args) {
		int puntos = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la puntuación del piloto: ");
		puntos = Integer.parseInt(sc.nextLine());

		if (ganar(puntos)) {
			System.out.println("Puedes ganar el campeonato.");
		} else {
			System.out.println("Ponte las pilas si quieres ganar.");
		}

		sc.close();

	}

	/**
	 * Función que calcula si el jugador se clasifica.
	 * 
	 * @param puntos     (int) - los puntos recibidos por teclado
	 * @param verificado (boolean) - variable que guarda si el jugador se clasifica.
	 * @return (boolean) - verdadero si pasa de 70 puntos. Si no, falso.
	 */
	public static boolean ganar(int puntos) {
		boolean verificado = false;

		if (puntos >= 70) {
			verificado = true;
		}
		return verificado;
	}

}
