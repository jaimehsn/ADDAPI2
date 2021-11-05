package practica2;

import java.util.List;

import us.lsi.common.Files2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lineas = Files2.linesFromFile("ficheros/prueba.txt");
		System.out.print(lineas);
	}

}
