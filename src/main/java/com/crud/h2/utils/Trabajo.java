package com.crud.h2.utils;

public enum Trabajo {
	INFORMATICO(1300), COMERCIAL(1150), TELEOPERADOR(900);
	
	private int salario;
	
	Trabajo(int salario) {
		this.salario = salario;
	}

	public int getSalario() {
		return this.salario;
	}
}
