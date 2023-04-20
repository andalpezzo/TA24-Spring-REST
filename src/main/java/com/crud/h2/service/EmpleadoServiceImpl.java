package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.EmpleadoDAO;
import com.crud.h2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	EmpleadoDAO empleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return empleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return empleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		
		return empleadoDAO.findById(id).get();
	}
	
	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return empleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		empleadoDAO.deleteById(id);
		
	}

	@Override
	public List<Empleado> listarEmpleadoNomnbre(String nombre) {
		
		return empleadoDAO.findByNombre(nombre);
	}

	public List<Empleado> listarEmpleadoTrabajo(String trabajo) {
		
		return empleadoDAO.findByTrabajo(trabajo);
	}

}
