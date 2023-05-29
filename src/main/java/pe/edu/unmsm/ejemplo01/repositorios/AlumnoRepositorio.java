package pe.edu.unmsm.ejemplo01.repositorios;

import org.springframework.data.repository.CrudRepository;

import pe.edu.unmsm.ejemplo01.entidades.Alumno;
import java.util.List;


public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer> {
	
	/**
	 *Busca un alumno por su codigo 
	 * @param alu_vccodigo el codigo del alumno
	 * @return una 
	 */

	public Alumno findByAluvccodigo(String aluvccodigo);
	
}
