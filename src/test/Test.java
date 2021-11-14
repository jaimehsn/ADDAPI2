package test;

import java.util.ArrayList;
import java.util.List;

import practica2.Ejercicio1;
import practica2.Ejercicio2;
import practica2.Ejercicio3;
import practica2.Ejercicio4;
import practica2.Ejercicio5;
import us.lsi.common.Files2;
import us.lsi.common.IntegerSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1();
		Test21();
		Test22();
		Test3();
		Test4();
		Test5();
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

	public static void Test21() {

		List<String> lista = Files2.linesFromFile("ficheros/PI2Ej2DatosEntrada1.txt");
		String[][] matriz = new String[lista.size()][lista.get(0).split(" ").length];

		for (int i = 0; i < lista.size(); i++) {

			for (int j = 0; j < lista.get(i).split(" ").length; j++) {

				matriz[i][j] = lista.get(i).split(" ")[j].trim();

			}

		}

		System.out.println("lista de cadenas obtenida:");
		List<String> exit = Ejercicio2.ejercicio2Recursivo(matriz);

		for (int i = 0; i < exit.size(); i++) {

			System.out.println(String.format("%s). %s", i + 1, exit.get(i)));

		}

	}

	public static void Test22() {

		List<String> lista = Files2.linesFromFile("ficheros/PI2Ej2DatosEntrada2.txt");
		String[][] matriz = new String[lista.size()][lista.get(0).split(" ").length];

		for (int i = 0; i < lista.size(); i++) {

			for (int j = 0; j < lista.get(i).split(" ").length; j++) {

				matriz[i][j] = lista.get(i).split(" ")[j].trim();

			}

		}

		System.out.println("lista de cadenas obtenida:");
		List<String> exit = Ejercicio2.ejercicio2Recursivo(matriz);

		for (int i = 0; i < exit.size(); i++) {

			System.out.println(String.format("%s). %s", i + 1, exit.get(i)));

		}

	}

	public static void Test3() {
		List<String> lineas = Files2.linesFromFile("ficheros/PI2Ej3DatosEntrada.txt");

		for (String linea : lineas) {

			String[] datos = linea.split("#");
			String[] lista = datos[0].split(",");
			List<Integer> entrada = new ArrayList<>();

			for (int i = 0; i < lista.length; i++) {

				entrada.add(Integer.parseInt(lista[i]));

			}

			String[] rango = datos[1].split(",");

			IntegerSet salida = Ejercicio3.ejercicio3Recursivo(Integer.parseInt(rango[0]), Integer.parseInt(rango[1]),
					entrada);

			System.out.println(String.format("Lista: %s", entrada));

			System.out.println(String.format("Rango: [%s, %s)", rango[0], rango[1]));

			System.out.println(String.format("Conjunto obtenido: %s", salida.toString()));

			System.out.println("_________________________________________________________");

		}

	}

	public static void Test4() {

		List<String> lineas = Files2.linesFromFile("ficheros/PI2Ej4DatosEntrada.txt");

		for (String linea : lineas) {

			System.out.println(String.format("Entero de entrada:\t%s", linea.replace("n=", "")));

			System.out.println(String.format("Sol. Rec. sin memoria:\t%s",
					Ejercicio4.ejercicio4Recursivo(Integer.parseInt(linea.replace("n=", "")))));

			System.out.println(String.format("Sol. Rec. con memoria:\t%s",
					Ejercicio4.ejercicio4RecursivoMem(Integer.parseInt(linea.replace("n=", "")))));

			System.out.println(String.format("Sol. Rec. iterativa:\t%s",
					Ejercicio4.ejercicio4Iterativo(Integer.parseInt(linea.replace("n=", "")))));

			System.out.println("\n___________________________________________________________");

		}

	}

	public static void Test5() {

		List<String> lineas = Files2.linesFromFile("ficheros/PI2Ej5DatosEntrada.txt");
		String[] dato;

		for (String linea : lineas) {

			dato = linea.split(",");
			System.out.println(String.format("(a, b, c) = (%s, %s, %s)", dato[0], dato[1], dato[2]));

			System.out.println(String.format("Sol. Rec. sin memoria: \t%s", Ejercicio5
					.ejercicio5Recursivo(Long.parseLong(dato[0]), Long.parseLong(dato[1]), Long.parseLong(dato[2]))));

			System.out.println(String.format("Sol. Rec. con memoria: \t%s", Ejercicio5.ejercicio5RecursivoMem(
					Long.parseLong(dato[0]), Long.parseLong(dato[1]), Long.parseLong(dato[2]))));

			System.out.println(String.format("Sol. Iterativa: \t%s", Ejercicio5
					.ejercicio5Iterativo(Long.parseLong(dato[0]), Long.parseLong(dato[1]), Long.parseLong(dato[2]))));

			System.out.println("___________________________________________________________________");

		}

	}

}
