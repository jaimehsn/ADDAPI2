package practica2;

import java.util.HashSet;
import java.util.List;

//import us.lsi.common.IntegerSet;

public class Ejercicio3 {

	public static HashSet<Integer> ejercicio3Recursivo(Integer a, Integer b, List<Integer> list) {
		Boolean flagR = false;
		Boolean flagL = false;
		Integer target = list.size() / 2;
		HashSet<Integer> setEnteros = new HashSet<Integer>();
		setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target, setEnteros);

		return setEnteros;
	}

	private static HashSet<Integer> ejercicio3Recursivo(Integer a, Integer b, List<Integer> list, Boolean flagL,
			Boolean flagR, Integer target, HashSet<Integer> setEnteros) {

		if (!flagL || !flagR) {

			if (list.get(target) >= a && list.get(target) < b) {

				if (!flagR) {

					setEnteros.add(list.get(target));

					if (list.get(target + 1) == b) {

						flagR = true;
						setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target, setEnteros);

					} else {

						setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target + 1, setEnteros);

					}

				} else {

					setEnteros.add(list.get(target));

					if (list.get(target) == a) {

						flagL = true;
						setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target, setEnteros);

					} else {

						setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target - 1, setEnteros);

					}

				}

			} else {

				if (a < list.get(target) && b <= list.get(target)) {

					target = target / 2;
					setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target, setEnteros);

				} else {

					target = target + ((list.size() - target) / 2);
					setEnteros = ejercicio3Recursivo(a, b, list, flagL, flagR, target, setEnteros);

				}

			}

		}

		return setEnteros;
	}

}
