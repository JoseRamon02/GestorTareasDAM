package featureModificar;

import java.util.ArrayList;

import claseTarea.Tarea;
import featureCrear.CrearTarea;

import java.time.LocalDate;
import java.util.*;

public class ModificarTarea {
	static Scanner sc = new Scanner(System.in);

	public static void Modificar(ArrayList<Tarea> modificar) {

		System.out.print("Titulo de la tarea a modificar: ");
		String elec = sc.nextLine();
		
		for (Tarea tarea: modificar) {
			if (tarea.titulo.equals(elec)) {
				
				System.out.print("Titulo de la tarea: ");
				tarea.titulo = sc.nextLine();
				
				System.out.print("Breve descripcion: ");
				tarea.descripcion = sc.nextLine();
				
				System.out.println("Fecha de la tarea: ");
				System.out.print("Anno: ");
				int anyo = sc.nextInt();
				System.out.print("Mes: ");
				int mes = sc.nextInt();
				System.out.print("Dia: ");
				int dia = sc.nextInt();

				tarea.fecha = LocalDate.of(anyo, mes, dia);
				
			}
		}
		
	}
}
