package kr.co.ezenac.stream.model;

public class User {
	
	private int id;
	private String name;
	private String emailAddress;
	private boolean isVerified;
	public int getId() {
		return id;
	}
	public User setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public User setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public User setVerified(boolean isVerified) {
		this.isVerified = isVerified;
		return this;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", isVerified=" + isVerified
				+ "]";
	}
	
	
	
}
