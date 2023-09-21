package featureEliminar;
import java.util.*;
import claseTarea.Tarea;
import featureListar.ListarTareas;
public class EliminarTareas {
	
	public static void eliminarTareas(ArrayList<Tarea> listaTareas) {
		
		Scanner sc = new Scanner(System.in);
		int flag=0;
		ListarTareas.listarTareas(listaTareas);
		
		System.out.println("Que tarea quieres eliminar?\n");
		String elec = sc.nextLine();
		
		
		
		Iterator<Tarea> iterador = listaTareas.iterator();
		while(iterador.hasNext()) {
			Tarea tarea = iterador.next();
			if (tarea.titulo.equals(elec)) {
				iterador.remove();
				System.out.println("Tarea " +elec+ " eliminada.");
				flag=1;
			}
		}
		if (flag==0) System.out.println("Tarea no encontrada.");
		
		
	}

}
