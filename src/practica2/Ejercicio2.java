package practica2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void ejercicio2(String[][] matriz) {
		Integer largo = matriz[0].length;

		while (largo >= 2) {

			for (int j = 0; j < matriz[0].length; j += largo - 1) {
				for (int i = 0; i < largo; i += largo - 1) {
					System.out.print(String.format("%s_%s_", matriz[j][i]));
					System.out.print(String.format("%s_%s", matriz[j][i]));
				}
			}

			System.out.println("");
			largo = largo / 2;
		}

	}

	public static List<String> ejercicio2Recursivo(String[][] matriz) {

		Integer x = 0;
		Integer y = 0;
		Integer I = matriz[0].length;
		List<String> salida = new ArrayList<>();
		salida = ejercicio2Recursivo(matriz, x, y, I, salida);
		return salida;

	}

	private static List<String> ejercicio2Recursivo(String[][] matriz, Integer x, Integer y, Integer I,
			List<String> salida) {

		if (!(matriz.length != matriz[0].length) && (matriz.length + matriz[0].length) % 2 == 0) {

			salida.add(String.format("%s%s%s%s", matriz[x][y], matriz[x][y + (I - 1)], matriz[x + (I - 1)][y],
					matriz[x + (I - 1)][y + (I - 1)]));

			if (I != 2) {
				
				salida = ejercicio2Recursivo(matriz, x, y, I / 2, salida);
				salida = ejercicio2Recursivo(matriz, x + (I / 2), y, I / 2, salida);
				salida = ejercicio2Recursivo(matriz, x, y + (I / 2), I / 2, salida);
				salida = ejercicio2Recursivo(matriz, x + (I / 2), y + (I / 2), I / 2, salida);

			}

		} else {

			System.out.print("Debe ser una matriz 2 elevado a N x 2 elevado a N.");

		}
		return salida;
	}

}
