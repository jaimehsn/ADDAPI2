package practica2;

public class Ejercicio2 {

	public static void ejercicio2(String[][] matriz) {
		Integer largo = matriz[0].length;

		while (largo >= 2) {

			for (int j = 0; j < matriz[0].length; j += largo - 1) {
				for (int i = 0; i < largo; i += largo - 1) {
					System.out.print(String.format("%s_", matriz[j][i]));
				}
			}

			System.out.println("");
			largo = largo / 2;
		}

	}

}
