package ahorcado;

import java.util.Scanner;

public class Ahorcado {

	/**
	 * Juego del ahorcado.
	 * 
	 * @param adivinar
	 * @param resuelto
	 * @param vidas
	 * 
	 */
	
	//Volcado a casa.
	
	public static void main(String[] args) {
		char[] adivinar = { 'V', 'I', 'E', 'R', 'N', 'E', 'S' };
		// char[] adivinar = seleccionarPalabra();
		char[] resuelto = new char[adivinar.length];
		boolean[] aciertos = new boolean[adivinar.length];
		int vidas = 8;
		char letra = ' ';
		boolean control = false;
		boolean igualarPalabras = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("#########################");
		System.out.println("##     EL AHORCADO     ##");
		System.out.println("#########################\n\n\n");

		System.out.println("La palabra que tienes que adivinar:\n");

		for (int i = 0; i < adivinar.length; i++) {
			resuelto[i] = '_';
			aciertos[i] = false;
		}

		do {
			for (int i = 0; i < adivinar.length; i++) {
				System.out.print(" " + resuelto[i] + " ");
			}

			System.out.print("\n\nDime una letra: ");
			letra = sc.nextLine().charAt(0);

			for (int i = 0; i < adivinar.length; i++) {
				if (Character.toUpperCase(letra) == Character.toUpperCase(adivinar[i])) {
					resuelto[i] = Character.toUpperCase(letra);
					aciertos[i] = true;
				} else {
					aciertos[i] = false;
				}
			}

			control = false;
			for (int i = 0; i < aciertos.length; i++) {
				if (aciertos[i]) {
					control = true;
					break;
				}
			}

			if (!control) {
				vidas--;
			}

			if (vidas == 0) {
				System.out.println("\n\nHas muerto.");
				break;
			} else {
				System.out.println("\n\nTe quedan " + vidas + "/7 vidas.");
			}

			igualarPalabras = comprobarPalabras(adivinar, resuelto);

		} while ((!igualarPalabras) || (vidas > 0));

		System.out.println("FIN DEL PROGRAMA.");

		sc.close();
	}

	public static char[] seleccionarPalabra() {
		String[] palabras = { "VIERNES", "CASA", "GATO", "PLAYA", "NIEVE", "JAVA", "GITHUB" };
		int elegir = 0;

		elegir = (int) (Math.random() * palabras.length);
		String palabra = palabras[elegir];

		char[] resultado = new char[palabra.length()];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = palabra.charAt(i);
		}

		return resultado;
	}

	public static boolean comprobarPalabras(char[] primera, char[] segunda) {
		String original = "";
		String creada = "";

		for (int i = 0; i < primera.length; i++) {
			original = original + primera[i];
			creada = creada + segunda[i];
		}

		return original.equals(creada);
	}

}
