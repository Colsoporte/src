package com.EnterpriseProject;
import java.util.Date;


public class Empleados {
	private long id;
	private String name;
	private String email;
	private Perfil profile;
	private String role; //devolver a RolEnum****
	private Empresa enterprise;
	private MovimientoDinero transactions[];
	private Date updatedAt;
	private Date createdAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Perfil getProfile() {
		return profile;
	}
	public void setProfile(Perfil profile) {
		this.profile = profile;
	}
	public String getRole() {   // devolver a EnumRol***
		return role;
	}
	public void setRole(String role) {  // devolver a EnumRol***
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Empresa getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(Empresa enterprise) {
		this.enterprise = enterprise;
	}
	public MovimientoDinero[] getTransactions() {
		return transactions;
	}
	public void setTransactions(MovimientoDinero[] transactions) {
		this.transactions = transactions;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Empleados(String name, String email, String role, Empresa enterprise) {
		super();
		
		this.enterprise = enterprise;
		this.name = name;
		this.email = email;
		this.role = role;
		
		
		
	
	}
	
}
