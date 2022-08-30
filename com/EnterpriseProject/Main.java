package com.EnterpriseProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa nuevaEmpresa = new Empresa ("nuevaEmpresa", "315748987", "Calle siempre viva 123", "1" );
		System.out.println("Dirección de la empresa: " + nuevaEmpresa.getAddress() );
		
		Empleados nuevoEmpleados = new Empleados ("Pepito", "correodeprueba@gmail.com", "Administrador", nuevaEmpresa);
		System.out.println("Nombre del empleado: " + nuevoEmpleados.getName());
		
		
	}

}
