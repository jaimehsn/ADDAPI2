package practica2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio4 {

	public static Long ejercicio4Iterativo(Integer n) {

		List<Long> lista = new ArrayList<>();
		lista.add(2L);
		lista.add(4L);
		lista.add(6L);

		for (int i = 3; i <= n; i++) {

			lista.add((2 * lista.get(i - 1)) + (4 * lista.get(i - 2)) + (6 * lista.get(i - 3)));

		}

		return lista.get(lista.size() - 1);

	}

	public static Long ejercicio4Recursivo(Integer n) {

		List<Long> lista = new ArrayList<>();
		lista.add(2L);
		lista.add(4L);
		lista.add(6L);
		Integer i = 3;

		lista = ejercicio4Recursivo(n, i, lista);

		return lista.get(lista.size() - 1);

	}

	private static List<Long> ejercicio4Recursivo(Integer n, Integer i, List<Long> lista) {

		if (i <= n) {

			lista.add((2 * lista.get(i - 1)) + (4 * lista.get(i - 2)) + (6 * lista.get(i - 3)));
			lista = ejercicio4Recursivo(n, i + 1, lista);
		}

		return lista;

	}

	public static Long ejercicio4RecursivoMem(Integer n) {

		HashMap<Integer, Long> Mem = new HashMap<>();
		Mem.put(0, 2L);
		Mem.put(1, 4L);
		Mem.put(2, 6L);
		Integer i = 3;

		Mem = ejercicio4RecursivoMem(n, i, Mem);

		return Mem.get(n);

	}

	private static HashMap<Integer, Long> ejercicio4RecursivoMem(Integer n, Integer i, HashMap<Integer, Long> Mem) {

		if (!Mem.containsKey(n)) {

			if (!Mem.containsKey(i)) {

				Mem.put(i, (2 * (Mem.get(i - 1))) + (4 * (Mem.get(i - 2))) + (6 * (Mem.get(i - 3))));
				Mem = ejercicio4RecursivoMem(n, i + 1, Mem);

			} else {

				Mem = ejercicio4RecursivoMem(n, i + 1, Mem);

			}

		}

		return Mem;
	}

}
