package test;

import java.util.List;

import practica2.Ejercicio1;
import us.lsi.common.Files2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1();
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

}
