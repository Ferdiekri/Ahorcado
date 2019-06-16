package ahorcado;

import java.util.Scanner;

public class Ahorcado {

	/**
	 * Juego del ahorcado.
	 * 
	 * @param adivinar        (char[]) - array que guarda la palabra secreta.
	 * @param resuelto        (char[]) - array que va guardando las respuestas
	 *                        correctas.
	 * @param aciertos        (boolean[]) - array que comprueba si se ha acertado
	 *                        una letra.
	 * @param vidas           (int) - número de vidas del jugador.
	 * @param letra           (char) - variable donde se guardará la letra
	 *                        introducida por teclado.
	 * @param control         (boolean) - variable que controla si ha fallado para
	 *                        quitarle una vida.
	 * @param igualarPalabras (boolean) - variable que comprueba si las dos palabras
	 *                        son iguales.
	 * @param sc              (Scanner) - variable para recoger letras por teclado.
	 *                        MÉTODOS: igualarPalabras
	 * 
	 */

	public static void main(String[] args) {
		// char[] adivinar = { 'V', 'I', 'E', 'R', 'N', 'E', 'S' };
		char[] adivinar = seleccionarPalabra();
		char[] resuelto = new char[adivinar.length];
		boolean[] aciertos = new boolean[adivinar.length];
		int vidas = 7;
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
				dibujarAhorcado(vidas);
			}

			if (vidas == 0) {
				System.out.println("\n\nHas muerto.");
				break;
			} else {
				System.out.println("\n\nTe quedan " + vidas + "/7 vidas.");
			}

			igualarPalabras = comprobarPalabras(adivinar, resuelto);
			if (igualarPalabras) {
				System.out.println("¡HAS ACERTADO! Enhorabuena. Te has salvado.");
			}

		} while (!igualarPalabras);

		System.out.println("FIN DEL PROGRAMA.");

		sc.close();
	}

	/**
	 * Función que selecciona una palabra aleatoria.
	 * 
	 * @param palabras (String[]) - array con diferentes palabras.
	 * @param elegir   (int) - variable que decicirá qué palabra de la array se
	 *                 elige.
	 * @return (char[]) - array con la palabra a adivinar.
	 */
	public static char[] seleccionarPalabra() {
		String[] palabras = { "JAVA", "GITHUB", "PUSH", "COMMIT", "FUNCTION", "MAIN", "INT", "CHAR", "BOOLEAN",
				"STRING" };
		int elegir = 0;

		elegir = (int) (Math.random() * palabras.length);
		String palabra = palabras[elegir];

		char[] resultado = new char[palabra.length()];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = palabra.charAt(i);
		}

		return resultado;
	}

	/**
	 * 
	 * @param primera (char[]) - array con la palabra original.
	 * @param segunda (char[]) - array con la palabra del jugador.
	 * @return (boolean) - devuelve si las dos arrays son iguales.
	 */
	public static boolean comprobarPalabras(char[] primera, char[] segunda) {
		String original = "";
		String creada = "";

		for (int i = 0; i < primera.length; i++) {
			original = original + primera[i];
			creada = creada + segunda[i];
		}

		return original.equals(creada);
	}

	/**
	 * Dibuja un poco más del dibujo cada vez que entre.
	 * 
	 * @param vidas (int) - el número decide cuánto pintar.
	 */
	public static void dibujarAhorcado(int vidas) {

		switch (vidas) {
		case 0:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |       -------   ");
			System.out.println(" |      | x   x |  ");
			System.out.println(" |      |   ~   |  ");
			System.out.println(" |       -------   ");
			System.out.println(" |          |      ");
			System.out.println(" |        / | \\   ");
			System.out.println(" |       /  |  \\  ");
			System.out.println(" |          |      ");
			System.out.println(" |         / \\    ");
			System.out.println(" |        /   \\   ");
			System.out.println("------             ");
			break;
		case 1:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |       -------   ");
			System.out.println(" |      |       |  ");
			System.out.println(" |      |       |  ");
			System.out.println(" |       -------   ");
			System.out.println(" |          |      ");
			System.out.println(" |        / | \\   ");
			System.out.println(" |       /  |  \\  ");
			System.out.println(" |          |      ");
			System.out.println(" |         / \\    ");
			System.out.println(" |        /   \\   ");
			System.out.println("------             ");
			break;
		case 2:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |       -------   ");
			System.out.println(" |      |       |  ");
			System.out.println(" |      |       |  ");
			System.out.println(" |       -------   ");
			System.out.println(" |          |      ");
			System.out.println(" |        / | \\   ");
			System.out.println(" |       /  |  \\  ");
			System.out.println(" |          |      ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println("-------------------");
			break;
		case 3:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |       -------   ");
			System.out.println(" |      |       |  ");
			System.out.println(" |      |       |  ");
			System.out.println(" |       -------   ");
			System.out.println(" |          |      ");
			System.out.println(" |          |      ");
			System.out.println(" |          |      ");
			System.out.println(" |          |      ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println("-------------------");
			break;
		case 4:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |       -------   ");
			System.out.println(" |      |       |  ");
			System.out.println(" |      |       |  ");
			System.out.println(" |       -------   ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println("-------------------");
			break;
		case 5:
			System.out.println("-------------------");
			System.out.println(" |          |      ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println("-------------------");
			break;
		case 6:
			System.out.println("-------------------");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println(" |                 ");
			System.out.println("-------------------");
			break;

		default:
			break;
		}

	}

}
