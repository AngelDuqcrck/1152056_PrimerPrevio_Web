package com.primer_previo.test;
import java.time.LocalDate;

import com.primer_previo.DAO.*;
import com.primer_previo.model.paciente;
public class Test {

	public static void main(String[] args) {
		PacienteDAO pDAO = new PacienteDAO();
		pDAO.insert(new paciente("9876543", "Pedro", "Martinez", "pedritomar@gmail.com", "M",
			    java.sql.Date.valueOf(LocalDate.parse("2000-03-15")), "3123456789", "Calle 26 #10-50 Guaimaral", 70.6f, 1.67f));


	}

}
