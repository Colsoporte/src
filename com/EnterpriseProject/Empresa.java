package com.EnterpriseProject;
import java.util.Date;



public class Empresa {
	private static long id;
	private static String name;
	private static String document;
	private String phone;
	private String address;
	private Empleados users[];
	private MovimientoDinero Transaction[];
	private Date createdAt; 
	private Date updatedAt; 
	public static long getId() {
		return id;
	}
	public static void setId(long id) {
		Empresa.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Empresa.name = name;
	}
	public static String getDocument() {
		return document;
	}
	public static void setDocument(String document) {
		Empresa.document = document;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Empleados[] getUsers() {
		return users;
	}
	public void setUsers(Empleados[] users) {
		this.users = users;
	}
	public MovimientoDinero[] getTransaction() {
		return Transaction;
	}
	public void setTransaction(MovimientoDinero[] transaction) {
		Transaction = transaction;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Empresa(String name, String phone, String address, String document) {
		super();
		
		Empresa.name = name;			//revisar la estructura
		Empresa.document = document;	//revisar la estructura
		this.phone = phone;
		this.address = address;
				
		
		
		
	}
	
	
}
