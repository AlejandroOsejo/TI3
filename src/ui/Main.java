package ui;

import java.util.Scanner;

public class Main{
	private Scanner sc;
	
	public int showMenuVeterinary() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para añadir un veterinario \n" +
				"(2) Para añadir un mascota \n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Vuelva pronto");
			break;
		case 1:

			break;
		case 2:

			break;
		default:
			System.out.println("Error, opción no válida");
		}
	}
}