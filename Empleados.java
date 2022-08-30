import java.util.Date;

public class Empleados {
	private long id;
	private String email;
	private Perfil profile;
	private Enum_RoleName role;
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
	public Enum_RoleName getRole() {
		return role;
	}
	public void setRole(Enum_RoleName role) {
		this.role = role;
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
	public Empleados(long id, String email, Perfil profile, Enum_RoleName role, Empresa enterprise,
			MovimientoDinero[] transactions, Date updatedAt, Date createdAt) {
		super();
		this.id = id;
		this.email = email;
		this.profile = profile;
		this.role = role;
		this.enterprise = enterprise;
		this.transactions = transactions;
		this.updatedAt = updatedAt;
		this.createdAt = createdAt;
	}
	
}
