import java.util.Date;

public class Perfil {
	private String id;
	private String image;
	private String phone;
	private String user; //preguntar al tutor
	private Date createdAt;
	private Date udatedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUdatedAt() {
		return udatedAt;
	}
	public void setUdatedAt(Date udatedAt) {
		this.udatedAt = udatedAt;
	}
	public Perfil(String id, String image, String phone, String user, Date createdAt, Date udatedAt) {
		super();
		this.id = id;
		this.image = image;
		this.phone = phone;
		this.user = user;
		this.createdAt = createdAt;
		this.udatedAt = udatedAt;
	} 
	
	
}
