package featureEliminar;
import java.util.*;
import claseTarea.Tarea;
import featureListar.ListarTareas;
public class EliminarTareas {
	
	public static void eliminarTareas(ArrayList<Tarea> listaTareas) {
		
		Scanner sc = new Scanner(System.in);
		
		ListarTareas.listarTareas(listaTareas);
		
		System.out.println("¿Que tarea quieres eliminar?\n");
		String elec = sc.nextLine();
		for (Tarea tarea : listaTareas) {
			if (tarea.titulo.equals(elec)) listaTareas.remove(tarea);
			else System.out.println("Tarea no encontrada.");
		}
		
		System.out.println("Tarea " + elec + " eliminada.");
		
		
	}

}
