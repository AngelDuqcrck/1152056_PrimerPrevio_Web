package com.primer_previo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Table(name = "paciente")
@Entity
@Data
@NamedQuery(name = "paciente.findAll", query = "SELECT p FROM paciente p")
public class paciente {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String documento;
	private String nombre;
	private String apellido;
	private String email;
	private String genero;
	private Date fechanacimiento;
	private String telefono;
	private String Direccion;
	private float peso;
	private float estatura;
	
	@Transient
	private float imc;
	private String estado;

	public paciente(String documento, String nombre, String apellido, String email, String genero, Date fechanacimiento,
			String telefono, String direccion, float peso, float estatura) {

		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		Direccion = direccion;
		this.peso = peso;
		this.estatura = estatura;
	}
	
	public float getImc() {
	    return peso / (estatura / 100.0f * estatura / 100.0f);
	}
	
	
	public String getEstado() {
		if(imc <18.5f) {
			return "Bajo Peso";
		} else if (imc >= 18.5f && imc<=24.9f) {
			return "Normal";
		}else return "Sobrepeso";
	}

}
