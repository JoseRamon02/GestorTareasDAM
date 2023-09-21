package featureEliminar;
import java.util.*;
import claseTarea.Tarea;
import featureListar.ListarTareas;
public class EliminarTareas {
	
	public static void eliminarTareas(ArrayList<Tarea> listaTareas) {
		
		Scanner sc = new Scanner(System.in);
		
		ListarTareas.listarTareas(listaTareas);
		
		System.out.println("¿Que tarea quieres eliminar?\n");
		int elec = sc.nextInt();		
		listaTareas.remove(elec);
		
		System.out.println("Tarea numero " + elec + " eliminada. ¿Quieres ver el resto de tareas? (1 = Si | 2 = No");
		elec = sc.nextInt();
		
		switch (elec) {
		case 1: 
			System.out.println("Perfecto. Aquí están el resto de tareas: \n");
			ListarTareas.listarTareas(listaTareas);
			break;
		case 2:
			break;
		default:
			System.out.println("Opcion invalida. Por favor, seleccione una opcion correcta");
			break;
		}
		
	}

}
