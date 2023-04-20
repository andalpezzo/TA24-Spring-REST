package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.crud.h2.utils.Trabajo;

@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {
	
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String nombre;
	private String trabajo;
	private int salario;
	
	//Constructores
	public Empleado() {
	
	}

	public Empleado(Long id, String nombre, String trabajo) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return obtenerSalario(trabajo);
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int obtenerSalario(String trabajo) {
		Trabajo[] trabajosDisponibles = Trabajo.values();

		for (Trabajo trabajos : trabajosDisponibles) {
			if (trabajos.name().equalsIgnoreCase(trabajo)) {
				return trabajos.getSalario();
			}
		}
		return 0;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
}
