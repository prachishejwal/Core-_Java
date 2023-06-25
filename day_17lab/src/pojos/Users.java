package pojos;

import java.sql.Date;

//id | first_name | last_name | email | password | reg_amt | reg_date   | role
public class Users {

	private int id;
	private String fname;
	private String lastname;
	private String email;
	private String password;
	private double regAmount;
	private Date regDate;
	private String role;
	//def constructor
	public User()
	{
		//not needed currently will be used later
		
	}
	public Users(int id, String fname, String lastname, String email, String password, double regAmount, Date regDate,
			String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lastname=" + lastname + ", email=" + email + ", regAmount="
				+ regAmount + ", regDate=" + regDate + ", role=" + role + "]";
	}
	
	
}
