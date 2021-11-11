package test;

import java.util.List;

import practica2.Ejercicio1;
import practica2.Ejercicio2;
import us.lsi.common.Files2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test1();
		Test2();
	}

	public static void Test1() {
		List<String> lineas = Files2.linesFromFile("ficheros/PI2Ej1DatosEntrada.txt");
		String[] dato;
		for (String linea : lineas) {
			dato = linea.split(",");
			System.out.println(String.format("(a, b, c) = (%s, %s, %s)", dato[0], dato[1], dato[2]));
			System.out.println(String.format("Sol. Rec. No final: \t%s", Ejercicio1.ejercicio1NoFinal(
					Integer.parseInt(dato[0]), Integer.parseInt(dato[1]), Integer.parseInt(dato[2]))));
			System.out.println(String.format("Sol. Iterativo: \t%s", Ejercicio1.ejercicio1Iterativo(
					Integer.parseInt(dato[0]), Integer.parseInt(dato[1]), Integer.parseInt(dato[2]))));
			System.out.println(String.format("Sol. Rec. Final: \t%s", Ejercicio1
					.ejercicio1Final(Integer.parseInt(dato[0]), Integer.parseInt(dato[1]), Integer.parseInt(dato[2]))));
			System.out.println("_____________________________________________________________________________________");

		}
	}

	public static void Test2() {
		String[][] matriz = { { "1", "2", "3", "4" }, { "5", "6", "7", "8" }, { "9", "10", "11", "12" },
				{ "13", "14", "15", "16" } };
//		System.out.print(Ejercicio2.funcionAuxiliar(matriz));
		for (String[][] sub : Ejercicio2.funcionAuxiliar(matriz)) {
			for (String[] i : sub) {
				for (String j : i) {
					System.out.print(j + "_");
				}
			}
			System.out.print("\n");
		}
	}

}
