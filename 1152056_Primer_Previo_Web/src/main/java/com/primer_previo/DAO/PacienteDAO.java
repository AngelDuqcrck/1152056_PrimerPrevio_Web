package com.primer_previo.DAO;

import com.primer_previo.DAO.GenericDAO;
import com.primer_previo.model.paciente;
import com.primer_previo.utils.Conexion;

public class PacienteDAO extends Conexion<paciente> implements GenericDAO<paciente>{
	//Estudiante DAO tenga la conexion de la BD e implemente los metodos
		public PacienteDAO(){
			super(paciente.class);
		}
}

