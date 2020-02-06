package jsp_usebean;

import java.util.Date;

//Bean=VO=DTO -> DTO란 ? getter setter 를 해주는 기능 

public class Memberinfo {
	private String id;
	private String password;
	private String name;
	private Date registerDate;
	private String email;
	
	
	
	public String getId() { // 데이터 가져오기 
		return id;
	}
	public void setId(String id) { // 데이터 넣기 
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
