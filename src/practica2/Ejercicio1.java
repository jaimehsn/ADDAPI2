package practica2;

import java.util.stream.Stream;

public class Ejercicio1 {

	public static String ejercicio1NoFinal(Integer a, Integer b, Integer c) {
		String salida;

		if (a < 3 && b < 3 && c < 3) {
			salida = String.format("(%s)", (a * b * c));
		} else {
			if (a < 3 || b < 3 || c < 3) {
				salida = String.format("(%s)", (a + b + c));
			} else {
				if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
					salida = Integer.toString(a * b * c) + ejercicio1NoFinal(a / 2, b - 2, c / 2);
				} else {
					salida = Integer.toString(a + b + c) + ejercicio1NoFinal(a / 3, b - 3, c / 3);
				}
			}
		}

		return salida;
	}

	public static String ejercicio1Iterativo(Integer a, Integer b, Integer c) {
		String salida = "";
		while (a >= 3 && b >= 3 && c >= 3) {
			if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
				salida += Integer.toString(a * b * c);
				a = a / 2;
				b = b - 2;
				c = c / 2;
			} else {
				salida += Integer.toString(a + b + c);
				a = a / 3;
				b = b - 3;
				c = c / 3;
			}
		}
		if (a < 3 || b < 3 || c < 3) {
			salida += String.format("(%s)", (a + b + c));
		} else {
			salida += String.format("(%s)", (a * b * c));
		}
		return salida;
	}

	public static String ejercicio1Final(Integer a, Integer b, Integer c) {
		String salida = "";

		salida = ejercicio1Final(a, b, c, salida);

		return salida;
	}

	private static String ejercicio1Final(Integer a, Integer b, Integer c, String salida) {
		if (a < 3 && b < 3 && c < 3) {
			salida += String.format("(%s)", (a * b * c));
		} else if (a < 3 || b < 3 || c < 3) {
			salida += String.format("(%s)", (a + b + c));
		} else if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			salida = ejercicio1Final(a / 2, b - 2, c / 2, salida.concat(Integer.toString(a * b * c)));
		} else {
			salida = ejercicio1Final(a / 3, b - 3, c / 3, salida.concat(Integer.toString(a + b + c)));
		}
		return salida;
	}

	public static String ejercicio1Funcional(Integer a, Integer b, Integer c) {
		Stream.iterate(null, null);
		return "";
	}

}
