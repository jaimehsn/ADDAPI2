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

	public static void ejercicio2Recursivo(String[][] matriz) {
		if (!(matriz.length != matriz[0].length) && (matriz.length + matriz[0].length) % 2 == 0) {

			if (matriz.length >= 2 && matriz[0].length >= 2) {
				System.out.print(String.format("%s_%s_", matriz[0][0], matriz[0][matriz[0].length - 1]));
				System.out.print(String.format("%s_%s", matriz[matriz.length - 1][0],
						matriz[matriz.length - 1][matriz[0].length - 1]));
				// LLAMADAS RECURSIVAS
			}

		} else {

			System.out.print("Debe ser una matriz 2 elevado a N x 2 elevado a N.");

		}
	}

	public static List<String[][]> funcionAuxiliar(String[][] matriz) {
		List<String[][]> matrixList = new ArrayList<String[][]>();
		String[][] subMatrix = new String[matriz.length / 2][matriz[0].length / 2];
		// Primer cuadrante
		for (int i = 0; i < matriz.length / 2; i++) {
			for (int j = 0; j < matriz[0].length / 2; j++) {
				subMatrix[i][j] = matriz[i][j];
			}
		}
		matrixList.add(subMatrix);
		// Segundo cuadrante
		for (int i = matriz.length / 2; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length / 2; j++) {
				subMatrix[i - (matriz.length / 2)][j] = matriz[i][j];
			}
		}
		matrixList.add(subMatrix);
		// Tercer cuadrante
		for (int i = 0; i < matriz.length / 2; i++) {
			for (int j = matriz[0].length / 2; j < matriz[0].length; j++) {
				subMatrix[i][j - (matriz[0].length / 2)] = matriz[i][j];
			}
		}
		matrixList.add(subMatrix);
		// Cuarto cuadrante
		for (int i = matriz.length / 2; i < matriz.length - 1; i++) {
			for (int j = matriz[0].length / 2; j < matriz[0].length; j++) {
				subMatrix[i - (matriz.length / 2)][j - (matriz[0].length / 2)] = matriz[i][j];
			}
		}
		matrixList.add(subMatrix);
		return matrixList;

	}

}
