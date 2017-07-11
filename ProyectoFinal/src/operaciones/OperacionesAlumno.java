package operaciones;

import java.util.Iterator;
import modeloPersona.Alumno;
import modeloPersona.Persona;

public class OperacionesAlumno extends Operaciones<Alumno>{
	public Alumno buscarMatricula(String matricula){
		Alumno elemento = null;
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			if(((Persona) e).getNombre().equalsIgnoreCase(matricula)){
				System.out.println("Visitante " + ((Persona) e).getNombre() + "con Matricula " + ((modeloPersona.Alumno) e).getMatricula() + "encontrado.");
				elemento = e;
			}
		}
		return elemento;
	}
	
	public void eliminaPorMatricula(String matricula){
		Iterator<Alumno> iterador = lista.iterator();
		
		while (iterador.hasNext()){
			Alumno e = iterador.next();
			
			if(((modeloPersona.Alumno) e).getMatricula().equalsIgnoreCase(matricula)){
				System.out.println("Alumno encontrado "+ ((modeloPersona.Alumno) e).getMatricula());
				lista.remove(e);
				System.out.println("El alumno ha sido eliminado");
				break;
			}
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