package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import practica2.Ejercicio1;
import practica2.Ejercicio2;
import practica2.Ejercicio3;
import us.lsi.common.Files2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test1();
//		Test21();
//		Test22();
		Test3();
	}

	public static void Test1() {
		List<String> lineas = Files2.linesFromFile("ficheros/PI2Ej1DatosEntrada1.txt");
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
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		HashSet<Integer> lista = Ejercicio3.ejercicio3Recursivo(4, 7, numeros);
		for(Integer i : lista) {
			System.out.println(i);
		}
		
	}

}
