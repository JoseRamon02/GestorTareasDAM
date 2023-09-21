package featureCrear;
import java.util.ArrayList;

import claseTarea.Tarea;

import java.time.LocalDate;
import java.util.*;
public class CrearTarea {
	static Scanner sc = new Scanner(System.in);
	public static void crearTarea(ArrayList<Tarea> Crear) {
		
		
		System.out.print("Titulo de la tarea: ");
		String Titulo = sc.nextLine();
		
		System.out.print("Breve descripcion: ");
		String Descripcion = sc.nextLine();
		
		System.out.println("Fecha de la tarea: ");
		System.out.print("Anno: ");
		int anyo = sc.nextInt();
		System.out.print("Mes: ");
		int mes = sc.nextInt();
		System.out.print("Dia: ");
		int dia = sc.nextInt();

		LocalDate Fecha = LocalDate.of(anyo, mes, dia);
		
		Tarea NuevaTarea = new Tarea(Titulo, Descripcion, Fecha);
		
		Crear.add(NuevaTarea);
		
	}

}
