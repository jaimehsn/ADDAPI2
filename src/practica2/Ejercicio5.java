package practica2;

import java.util.HashMap;

public class Ejercicio5 {

	public static Long ejercicio5Iterativo(Long a, Long b, Long c) {

		HashMap<String, Long> Mem = new HashMap<>();
		String aux = "";
		Long salida = 0L;

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j <= b; j++) {

				for (int k = 0; k <= c; k++) {

					aux = String.format("%s%s%s", i, j, k);

					if (i < 3 || j < 3 || k < 3) {

						salida = (long) (i + (j * j) + 2 * k);
						Mem.put(aux, salida);

					} else {

						if (i % j == 0) {

							salida = Mem.get(String.format("%s%s%s", i - 1, j / 2, k / 2))
									+ Mem.get(String.format("%s%s%s", i - 3, j / 3, k / 3));
							Mem.put(aux, salida);

						} else {

							salida = Mem.get(String.format("%s%s%s", i / 3, j - 3, k - 3))
									+ Mem.get(String.format("%s%s%s", i / 2, j - 2, k - 2));
							Mem.put(aux, salida);

						}

					}

				}

			}

		}

		return Mem.get(a.toString().concat(b.toString().concat(c.toString())));

	}

	public static Long ejercicio5Recursivo(Long a, Long b, Long c) {

		Long salida = 0L;
		salida = ejercicio5Recursivo(a, b, c, salida);

		return salida;
	}

	private static Long ejercicio5Recursivo(Long a, Long b, Long c, Long salida) {

		if (a < 3 || b < 3 || c < 3) {

			salida = a + (b * b) + (2 * c);

		} else {

			if (a % b == 0) {

				salida = ejercicio5Recursivo(a - 1, b / 2, c / 2, salida)
						+ ejercicio5Recursivo(a - 3, b / 3, c / 3, salida);

			} else {

				salida = ejercicio5Recursivo(a / 3, b - 3, c - 3, salida)
						+ ejercicio5Recursivo(a / 2, b - 2, c - 2, salida);

			}

		}

		return salida;

	}

	public static Long ejercicio5RecursivoMem(Long a, Long b, Long c) {

		HashMap<String, Long> Mem = new HashMap<>();
		Mem = ejercicio5RecursivoMem(a, b, c, Mem);

		return Mem.get(a.toString().concat(b.toString()).concat(c.toString()));

	}

	private static HashMap<String, Long> ejercicio5RecursivoMem(Long a, Long b, Long c, HashMap<String, Long> Mem) {
		String aux = "";

		if (!Mem.containsKey(a.toString().concat(b.toString().concat(c.toString())))) {

			if (a < 3 || b < 3 || c < 3) {

				aux = a.toString().concat(b.toString()).concat(c.toString());
				Mem.put(aux, (a + (b * b) + (2 * c)));

			} else {

				if (a % b == 0) {

					Long res1 = ejercicio5RecursivoMem(a - 1, b / 2, c / 2, Mem)
							.get(Long.toString(a - 1).concat(Long.toString(b / 2)).concat(Long.toString(c / 2)));

					Long res2 = ejercicio5RecursivoMem(a - 3, b / 3, c / 3, Mem)
							.get(Long.toString(a - 3).concat(Long.toString(b / 3)).concat(Long.toString(c / 3)));

					aux = a.toString().concat(b.toString()).concat(c.toString());
					Mem.put(aux, res1 + res2);

				} else {

					Long res1 = ejercicio5RecursivoMem(a / 3, b - 3, c - 3, Mem)
							.get(Long.toString(a / 3).concat(Long.toString(b - 3)).concat(Long.toString(c - 3)));

					Long res2 = ejercicio5RecursivoMem(a / 2, b - 2, c - 2, Mem)
							.get(Long.toString(a / 2).concat(Long.toString(b - 2)).concat(Long.toString(c - 2)));

					aux = a.toString().concat(b.toString()).concat(c.toString());
					Mem.put(aux, res1 + res2);

				}

			}

		}

		return Mem;

	}

}
