package net.sports.ZenSportsBackEnd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User implements Serializable{
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 3286175755443236838L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Size(min=1, max=30,message="user name should be between 1 to 30 characters long")
	private String userName;
	@Size(min=1, max=30,message="user full name should be between 1 to 30 characters long")
	private String userFullName;
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> address=new ArrayList<>();
		
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@NotBlank
	private String userRole;
	@Size(min=1, max=30,message="user password should be between 1 to 30 characters long")
	private String userPassword;
	@Size(min=1, max=30,message="user confirm password should be between 1 to 30 characters long")
	@Transient
	private String userConPassword;
	@Size(min=1, max=50,message="user email should be between 1 to 50 characters long")
	private String userEmail;
	@Size(min=1, max=30,message="user name should be between 1 to 30 characters long")
	private String userMobile;
	@NotBlank
	private String userSecurityQ;
	@Size(min=1, max=30,message="user security answer should be between 1 to 30 characters long")
	private String userSecurityA;
	
	private boolean enabled;
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public User(int userId, String userName,String userFullName ,String userRole, String userPassword, String userConPassword,
		 String userEmail, String userMobile, String userSecurityQ, String userSecurityA) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userFullName = userFullName;
		this.userRole = userRole;
		this.userPassword = userPassword;
		this.userConPassword = userConPassword;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userSecurityQ = userSecurityQ;
		this.userSecurityA = userSecurityA;
		this.enabled=false;
	}
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConPassword() {
		return userConPassword;
	}
	public void setUserConPassword(String userConPassword) {
		this.userConPassword = userConPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserSecurityQ() {
		return userSecurityQ;
	}
	public void setUserSecurityQ(String userSecurityQ) {
		this.userSecurityQ = userSecurityQ;
	}
	public String getUserSecurityA() {
		return userSecurityA;
	}
	public void setUserSecurityA(String userSecurityA) {
		this.userSecurityA = userSecurityA;
	}
}
