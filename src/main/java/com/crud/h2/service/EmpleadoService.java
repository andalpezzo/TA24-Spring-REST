package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Empleado;

public interface EmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado cliente);	//Guarda un cliente CREATE
	
	public Empleado empleadoXID(Long id); //Leer datos de un cliente READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Clientes por campo nombre
	
	public Empleado actualizarEmpleado(Empleado cliente); //Actualiza datos del cliente UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el cliente DELETE
}
