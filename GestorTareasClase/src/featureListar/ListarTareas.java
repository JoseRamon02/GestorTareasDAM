package featureListar;

import java.util.*;
import claseTarea.Tarea;

public class ListarTareas {
	
	public static void listarTareas(ArrayList<Tarea> listaTareas) {
		
		System.out.println("Lista de tareas:\n");
	
	for (Tarea tarea : listaTareas) {
		System.out.println(tarea.toString());
	}
	System.out.println("");
	
	}

	
}
