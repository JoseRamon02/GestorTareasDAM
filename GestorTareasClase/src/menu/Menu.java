package menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import claseTarea.Tarea;
import featureCrear.CrearTarea;
import featureEliminar.EliminarTareas;
import featureListar.ListarTareas;

public class Menu {

	public static void menu() {
		
		int opcionUsuario=0;
		Scanner sc = new Scanner(System.in);
		
		LocalDate date1 = LocalDate.of(2020, 1, 30);
		LocalDate date2 = LocalDate.of(2021, 2, 24);
		
		Tarea tarea1 = new Tarea("Tarea1", "Descripcion 1", date1);
		Tarea tarea2 = new Tarea("Tarea2", "Descripcion 2", date2);
		
		ArrayList<Tarea> listaTareas = new ArrayList<>();
		
		listaTareas.add(tarea1);
		listaTareas.add(tarea2);
		
		do {
		
		System.out.println("---------GESTOR DE TAREAS---------\n\n"
				+ "1. Listar tareas\n"
				+ "2. Crear nueva tarea\n"
				+ "3. Editar tarea\n"
				+ "4. Borrar tarea\n\n"
				+ "0. Salir \n\n"
				+ "Elija una opcion:");
		
		opcionUsuario = sc.nextInt();
		
		switch (opcionUsuario) { 
	    case 1:
	    		ListarTareas.listarTareas(listaTareas);
	    break;
	    case 2:
	    		CrearTarea.crearTarea(listaTareas);
	    break;
	    case 3:
	    		System.out.println("Aun estamos desarrollando el metodo para editar las tareas.\nDisculpen las molestias.");
	    break;
	    case 4:
		     	EliminarTareas.eliminarTareas(listaTareas);
		break;
	    case 0:
	     	System.out.println("Hasta pronto!");
	    break;
	    default:
	    		System.out.println("Por favor, introduzca una opcion correcta.");
			}
		
		}while(opcionUsuario!=0);
		
	}

}
