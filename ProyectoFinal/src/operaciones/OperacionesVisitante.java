package operaciones;

import java.util.Iterator;
import java.util.List;


import modeloPersona.Visitante;

public class OperacionesVisitante extends Operaciones<Visitante>{
	public Visitante buscarID(String id){
		Visitante elemento = null;
		
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Visitante e = iterador.next();
			if(e.getNombre().equalsIgnoreCase(id)){
				System.out.println("Visitante " + e.getNombre() + "con ID " + e.getId() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void eliminaPorID(String id){
		Iterator<Visitante> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Visitante e = iterador.next();
			if(e.getId().equalsIgnoreCase(id)){
				System.out.println("Visitante encontrado "+ e.getId());
				lista.remove(e);
				System.out.println("El visitante ha sido eliminado");
				break;
			}
		}
	}
	
	public void imprimeLista(List<Visitante> lista){

		Iterator<Visitante> iterador = lista.iterator();
		System.out.println("--LinkedList---");
	 	//recorremos y mostramos la lista
		while(iterador.hasNext())
		{
			Visitante e = iterador.next();
			System.out.println( "Nombre    :  " + e.getNombre());
			System.out.println( "Genero    :  " + e.getGenero());
			System.out.println( "Matricula :  " + e.getId());
			System.out.println( "Edad      :  " + e.getEdad());
						
			System.out.println( "**********************************" );
		}
	
	}
	
	
	@Override
	public void imprimeLista() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actualizacion(String parametro) {
		// TODO Auto-generated method stub
		
	}
}
