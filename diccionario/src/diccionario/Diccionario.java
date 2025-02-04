package diccionario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		List<Palabra> diccionario = new ArrayList<>();
		int opp;
		String termino_introducido;
		String definicion_introducida;
		do {

			imprimirMenu();
			opp = entrada.nextInt();
			switch (opp) {
			case 1:
				System.out.println("Introduce término:");
				termino_introducido = entrada.next();

				entrada.nextLine();

				System.out.println("Introduce definición:");
				definicion_introducida = entrada.nextLine();

				diccionario.add(new Palabra(termino_introducido, definicion_introducida));
				break;
			case 2:
				Iterator<Palabra> iter = diccionario.iterator();
				while (iter.hasNext()) {
					Palabra p = iter.next();
					System.out.println("\n" + p.getTermino() + "\n");
				}
				break;
			case 3:
				System.out.println("Introduce termino:");
				termino_introducido = entrada.nextLine();
				for (Palabra palabra : diccionario) {
					if (palabra.termino.equals(termino_introducido)) {
						System.out.println(palabra.definicion);
					}
				}
				break;
			case 4:
				System.out.print("Introduce el término a eliminar: ");
				termino_introducido = entrada.nextLine();
				for (int i = 0; i < diccionario.size(); i++) {
					if (diccionario.get(i).termino.equals(termino_introducido)) {
						diccionario.remove(i);
						System.out.println("Término eliminado");
					}
				}
				break;
			case 0:
				System.out.println("Has salido del programa");
				break;
			}
		} while (opp != 0);

	}

	public static void imprimirMenu() {
		System.out.println("0)Salir");
		System.out.println("1)Introducir término y definición");
		System.out.println("2)Mostrar todos los términos");
		System.out.println("3)Obtener definición de un término introducido");
		System.out.println("4)Eliminar un término y su definición");
	}

}
